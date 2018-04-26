/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketPnlService.java 
 *
 * @Date:  2018年4月19日  下午6:04:04
 *
 * @Package com.dossp.crp.market.pnl.service
 */


package com.dossp.crp.market.pnl.service;

import java.util.List;

import com.dossp.common.service.BaseService;
import com.dossp.crp.market.pnl.model.DailyCdPnlModel;
import com.dossp.crp.market.pnl.model.MarketPnlModel;
import com.dossp.crp.xdata.vo.CreditXdataVo;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午6:04:04
 *
 * 描述：
 * @version V1.0
 *
 */

public interface MarketPnlService extends BaseService<MarketPnlModel,Long>{
	List<MarketPnlModel> getData(String dataDate);
	
	String getMaxDate();
	
	List<DailyCdPnlModel> getDataPnl(String dataDate);
}
