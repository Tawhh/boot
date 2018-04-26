/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketAnalysisIndexModel.java 
 *
 * @Date:  2018年4月10日  下午4:11:10
 *
 * @Package com.dossp.crp.market.analysis.Index.model
 */


package com.dossp.crp.market.var.vo;

/**
 * @author wulei
 * 
 * 日期：2018年4月10日 下午4:11:10
 *
 * 描述：
 * @version V1.0
 *
 */

public class MarketVarDataVo{
	
	private String name;
	
	private Object obj = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
