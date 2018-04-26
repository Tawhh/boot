/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupMapper.java
 * @Date: 2018/4/20 17:43
 * @Package com.dossp.crp.daily.group.mapper
 */
package com.dossp.crp.daily.group.mapper;

import com.dossp.crp.daily.group.model.DailyGroupChartModel;
import com.dossp.crp.daily.group.model.DailyGroupPnlModel;
import com.dossp.crp.daily.group.model.DailyGroupPositionModel;
import com.dossp.crp.daily.group.vo.DailyGroupPositionVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 17:43
 *         </p>
 *         描述：
 */
public interface DailyGroupMapper {

    /**
     * 获取最大日期
     *
     * @return
     */
    String getMaxDate();

    /**
     * 获取最近的上次数据日期
     *
     * @return
     */
    String getMaxPrevDate(String tradeDate);

    /**
     * @param tradeDate
     * @return
     */
    List<DailyGroupChartModel> getChartData(String tradeDate);

    /**
     * @param tradeDate
     * @return
     */
    List<DailyGroupPnlModel> getPnlData(String tradeDate);

    /**
     * @param tradeDate
     * @return
     */
    List<DailyGroupPositionModel> getPositionData(String tradeDate);

    /**
     * 获取使用率系数
     *
     * @param vo
     * @return
     */
    List<BigDecimal> getIndexValue(DailyGroupPositionVo vo);
}
