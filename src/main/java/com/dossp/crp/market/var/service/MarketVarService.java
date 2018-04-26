/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketVarService.java 
 *
 * @Date:  2018年4月20日  上午11:53:09
 *
 * @Package com.dossp.crp.market.var.service
 */


package com.dossp.crp.market.var.service;

import java.util.Map;

/**
 * @author wulei
 * 
 * 日期：2018年4月20日 上午11:53:09
 *
 * 描述：
 * @version V1.0
 *
 */

public interface MarketVarService {

	/** 
	 * @return 
	 */
	
	Map<Object, Object> getData();

	/** 
	 * @return 
	 */
	
	String getMaxDate();

}
