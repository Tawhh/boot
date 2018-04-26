/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketVarVo.java 
 *
 * @Date:  2018年4月20日  下午2:30:42
 *
 * @Package com.dossp.crp.market.var.vo
 */


package com.dossp.crp.market.var.vo;

/**
 * @author wulei
 * 
 * 日期：2018年4月20日 下午2:30:42
 *
 * 描述：
 * @version V1.0
 *
 */

public class MarketVarVo {
	
	private String beginDate;
	
	private String endDate;
	
	private String corpCode;

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCorpCode() {
		return corpCode;
	}

	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

}
