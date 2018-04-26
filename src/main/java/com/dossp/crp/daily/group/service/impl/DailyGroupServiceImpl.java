/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupServiceImpl.java
 * @Date: 2018/4/20 17:45
 * @Package com.dossp.crp.daily.group.service.impl
 */
package com.dossp.crp.daily.group.service.impl;

import com.dossp.crp.daily.group.mapper.DailyGroupMapper;
import com.dossp.crp.daily.group.model.DailyGroupChartModel;
import com.dossp.crp.daily.group.model.DailyGroupPnlModel;
import com.dossp.crp.daily.group.model.DailyGroupPositionModel;
import com.dossp.crp.daily.group.service.DailyGroupService;
import com.dossp.crp.daily.group.vo.DailyGroupChartVo;
import com.dossp.crp.daily.group.vo.DailyGroupPositionVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 17:45
 *         </p>
 *         描述：
 */
@Service
public class DailyGroupServiceImpl implements DailyGroupService {

    @Autowired
    private DailyGroupMapper groupMapper;

    /**
     * 获取最大数据日期
     *
     * @return
     */
    @Override
    public String getMaxDate() {
        return groupMapper.getMaxDate();
    }

    /**
     * 获取图表数据
     *
     * @param tradeDate
     * @return
     */
    @Override
    public DailyGroupChartVo getChartData(String tradeDate) {
        DailyGroupChartVo vo = new DailyGroupChartVo();
        List<DailyGroupChartModel> chartList = groupMapper.getChartData(tradeDate);
        if (chartList != null && chartList.size() > 0) {
            String[] corpName = new String[chartList.size()];
            String[] totalPnl = new String[chartList.size()];
            String[] prevTotalPnl = new String[chartList.size()];
            String[] budgetProfit = new String[chartList.size()];
            for (int i = 0; i < chartList.size(); i++) {
                DailyGroupChartModel model = chartList.get(i);
                corpName[i] = model.getCorpName() == null ? "" : model.getCorpName();
                totalPnl[i] = model.getTotalPnl() == null ? "" : String.valueOf(model.getTotalPnl());
                prevTotalPnl[i] = model.getPrevTotalPnl() == null ? "" : String.valueOf(model.getPrevTotalPnl());
                budgetProfit[i] = model.getBudgetProfit() == null ? "" : String.valueOf(model.getBudgetProfit());
            }
            vo.setCorpName(corpName);
            vo.setTotalPnl(totalPnl);
            vo.setPrevTotalPnl(prevTotalPnl);
            vo.setBudgetProfit(budgetProfit);
        }
        return vo;
    }

    /**
     * 获取盈亏及回撤数据
     *
     * @param tradeDate
     * @return
     */
    @Override
    public List<DailyGroupPnlModel> getPnlData(String tradeDate) {
        return groupMapper.getPnlData(tradeDate);
    }

    /**
     * 获取头寸数据
     *
     * @param tradeDate
     * @return
     */
    @Override
    public List<DailyGroupPositionModel> getPositionData(String tradeDate) {
        List<DailyGroupPositionModel> list = getPositionDeltaData(tradeDate);
        List<DailyGroupPositionModel> returnList = getPositionRateData(list, tradeDate);
        return returnList;
    }

    /**
     * 计算总敞口delta
     *
     * @param tradeDate
     * @return
     */
    public List<DailyGroupPositionModel> getPositionDeltaData(String tradeDate) {
        String prevDate = groupMapper.getMaxPrevDate(tradeDate);
        List<DailyGroupPositionModel> todayList = groupMapper.getPositionData(tradeDate);
        List<DailyGroupPositionModel> prevList = groupMapper.getPositionData(prevDate);
        BigDecimal zero = new BigDecimal(0.00);
        if (todayList != null && todayList.size() > 0) {
            for (int i = 0; i < todayList.size(); i++) {
                DailyGroupPositionModel todayModel = todayList.get(i);
                if (prevList != null && prevList.size() > 0) {
                    for (int j = 0; j < prevList.size(); j++) {
                        DailyGroupPositionModel prevModel = prevList.get(j);
                        if (todayModel.getCorpCode().equals(prevModel.getCorpCode()) && todayModel.getCdCode().equals(prevModel.getCdCode())) {
                            BigDecimal todayTotal = todayModel.getTotalPosition() == null ? zero : todayModel.getTotalPosition();
                            BigDecimal prevTotal = prevModel.getTotalPosition() == null ? zero : prevModel.getTotalPosition();
                            BigDecimal deltaTotal = todayTotal.subtract(prevTotal);
                            todayModel.setDeltaPosition(deltaTotal);
                        }
                    }
                }
            }
        }
        return todayList;
    }

    /**
     * 查询使用率
     *
     * @param list
     * @return
     */
    public List<DailyGroupPositionModel> getPositionRateData(List<DailyGroupPositionModel> list, String tradeDate) {
        BigDecimal zero = new BigDecimal(0.00);
        DailyGroupPositionVo vo = new DailyGroupPositionVo();
        if (list != null && list.size() > 0) {
            for (DailyGroupPositionModel model : list) {
                BigDecimal total = model.getTotalPosition() == null ? zero : model.getTotalPosition();
                if (StringUtils.isNotBlank(model.getIndexCode())) {
                    vo.setCdCode(model.getIndexCode());
                    vo.setCorpCode(model.getCorpCode());
                    vo.setTradeDate(tradeDate);
                    if (total.compareTo(zero) > 0) {
                        vo.setIndexProperty("多头");
                        List<BigDecimal> valueList = groupMapper.getIndexValue(vo);
                        BigDecimal value = new BigDecimal(0.00);
                        if (valueList != null && valueList.size() > 0) {
                            value = valueList.get(0);
                        }
                        if (value.compareTo(zero) == 0) {
                            model.setRate(zero);
                        } else {
                            BigDecimal rate = total.divide(value, 4, BigDecimal.ROUND_HALF_UP);
                            model.setRate(rate);
                        }
                    } else if (total.compareTo(zero) < 0) {
                        vo.setIndexProperty("空头");
                        List<BigDecimal> valueList = groupMapper.getIndexValue(vo);
                        BigDecimal value = new BigDecimal(0.00);
                        if (valueList != null && valueList.size() > 0) {
                            value = valueList.get(0);
                        }
                        if (value.compareTo(zero) == 0) {
                            model.setRate(zero);
                        } else {
                            BigDecimal rate = total.divide(value, 4, BigDecimal.ROUND_HALF_UP);
                            model.setRate(rate);
                        }
                    } else {
                        model.setRate(zero);
                    }
                } else {
                    model.setRate(zero);
                }
            }
        }
        return list;
    }
}
