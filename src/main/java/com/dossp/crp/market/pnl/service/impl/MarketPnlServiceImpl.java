/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketPnlServiceImpl.java 
 *
 * @Date:  2018年4月19日  下午6:04:20
 *
 * @Package com.dossp.crp.market.pnl.service.impl
 */


package com.dossp.crp.market.pnl.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dossp.common.service.impl.BaseServiceImpl;
import com.dossp.crp.market.pnl.mapper.DailyCdPnlMapper;
import com.dossp.crp.market.pnl.mapper.MarketPnlMapper;
import com.dossp.crp.market.pnl.model.DailyCdPnlModel;
import com.dossp.crp.market.pnl.model.MarketPnlModel;
import com.dossp.crp.market.pnl.service.MarketPnlService;
import com.dossp.crp.xdata.vo.CreditXdataVo;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午6:04:20
 *
 * 描述：
 * @version V1.0
 *
 */
@Service
public class MarketPnlServiceImpl extends BaseServiceImpl<MarketPnlModel,Long> implements MarketPnlService{

	@Autowired
	private MarketPnlMapper marketPnlMapper;
	@Autowired
	private DailyCdPnlMapper dailyCdPnlMapper;
	
	/** 
	 * @param dataDate
	 * @return 
	 */
	@Override
	public List<MarketPnlModel> getData(String dataDate) {
		List<MarketPnlModel> data = marketPnlMapper.getData(dataDate);
		List<MarketPnlModel> lastDayData = marketPnlMapper.getLastDayData(dataDate);
				BigDecimal subtract = null;
				subtract = data.get(0).getPulpTotalPosition().subtract(lastDayData.get(0).getPulpTotalPosition());
				data.get(0).setSubPnlAmt1(subtract);
				subtract = data.get(0).getSoyBeanTotalPosition().subtract(lastDayData.get(0).getSoyBeanTotalPosition());
				data.get(0).setSubPnlAmt2(subtract);
				subtract = data.get(0).getVegetableTotalPosition().subtract(lastDayData.get(0).getVegetableTotalPosition());
				data.get(0).setSubPnlAmt3(subtract);
				subtract = data.get(0).getPalmTotalPosition().subtract(lastDayData.get(0).getPalmTotalPosition());
				data.get(0).setSubPnlAmt4(subtract);
				subtract = data.get(0).getOilSeedTotalPosition().subtract(lastDayData.get(0).getOilSeedTotalPosition());
				data.get(0).setSubPnlAmt5(subtract);
				subtract = data.get(0).getCornTotalPosition().subtract(lastDayData.get(0).getCornTotalPosition());
				data.get(0).setSubPnlAmt6(subtract);
				subtract = data.get(0).getCornStarchTotalPosition().subtract(lastDayData.get(0).getCornStarchTotalPosition());
				data.get(0).setSubPnlAmt7(subtract);
				subtract = data.get(0).getWheatTotalPosition().subtract(lastDayData.get(0).getWheatTotalPosition());
				data.get(0).setSubPnlAmt8(subtract);
				subtract = data.get(0).getSugarTotalPosition().subtract(lastDayData.get(0).getSugarTotalPosition());
				data.get(0).setSubPnlAmt9(subtract);
				subtract = data.get(0).getCottonTotalPosition().subtract(lastDayData.get(0).getCottonTotalPosition());
				data.get(0).setSubPnlAmt10(subtract);
				subtract = data.get(0).getRiceTotalPosition().subtract(lastDayData.get(0).getRiceTotalPosition());
				data.get(0).setSubPnlAmt11(subtract);
		return data;
	}

	/** 
	 * @return 
	 */
	
	
	@Override
	public String getMaxDate() {
		return marketPnlMapper.getMaxDate();
	}

	/** 
	 * @param vo
	 * @return 
	 */
	
	
	@Override
	public List<DailyCdPnlModel> getDataPnl(String dataDate) {
		List<DailyCdPnlModel> data = dailyCdPnlMapper.getData(dataDate);
		List<DailyCdPnlModel> lastDayData = dailyCdPnlMapper.getLastDayData(dataDate);
		for (DailyCdPnlModel model : data) {
			for (DailyCdPnlModel dailyCdPriceModel : lastDayData) {
				if (model.getCdName().equals(dailyCdPriceModel.getCdName())) {
					BigDecimal subtract = model.getAllPnlAmt().subtract(dailyCdPriceModel.getAllPnlAmt());
					model.setSubPnlAmt(subtract);
				}
			}
		}
		return data;
	}

}
