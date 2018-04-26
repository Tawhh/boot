/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketVarMapper.java 
 *
 * @Date:  2018年4月20日  上午11:53:52
 *
 * @Package com.dossp.crp.market.var.mapper
 */


package com.dossp.crp.market.var.mapper;

import java.util.List;

import com.dossp.crp.market.var.model.MarketVarModel;
import com.dossp.crp.market.var.model.MarketVarTableModel;
import com.dossp.crp.market.var.vo.MarketVarVo;


/**
 * @author wulei
 * 
 * 日期：2018年4月20日 上午11:53:52
 *
 * 描述：
 * @version V1.0
 *
 */

public interface MarketVarMapper {

	/** 
	 * @return 
	 */
	
	
	List<MarketVarModel> getData(MarketVarVo vo);

	/** 
	 * @return 
	 */
	
	List<MarketVarModel> getSuperpositionData(MarketVarVo vo);

	/** 
	 * @return 
	 */
	
	List<String> getDateList(MarketVarVo vo);

	/** 
	 * @return 
	 */
	
	String findMaxTradeDate();

	/** 
	 * @param vo
	 * @return 
	 */
	
	List<MarketVarTableModel> getVarTableList(MarketVarVo vo);

	/** 
	 * @param vo
	 * @return 
	 */
	
	MarketVarTableModel getJtztVar(MarketVarVo vo);

}
