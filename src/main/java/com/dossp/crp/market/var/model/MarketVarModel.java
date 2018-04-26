/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketAnalysisIndexModel.java 
 *
 * @Date:  2018年4月10日  下午4:11:10
 *
 * @Package com.dossp.crp.market.analysis.Index.model
 */


package com.dossp.crp.market.var.model;


import com.dossp.common.model.BaseModel;

/**
 * @author wulei
 * 
 * 日期：2018年4月10日 下午4:11:10
 *
 * 描述：
 * @version V1.0
 *
 */

public class MarketVarModel extends BaseModel{

	/** 
	 * 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -4714119252250839495L;
	
	private String tradeDate;
	
	private String corpCode;
	
	private String corpName;
	
	private String unitCode;
	
	private String unitName;
	
	private String varPositive;
	
	private String varNegative;
	
	private String varLimitPositive;
	
	private String varLimitNegative;
	
	private String pnl;
	
	public String getPnl() {
		return pnl;
	}

	public void setPnl(String pnl) {
		this.pnl = pnl;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getCorpCode() {
		return corpCode;
	}

	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getVarPositive() {
		return varPositive;
	}

	public void setVarPositive(String varPositive) {
		this.varPositive = varPositive;
	}

	public String getVarNegative() {
		return varNegative;
	}

	public void setVarNegative(String varNegative) {
		this.varNegative = varNegative;
	}

	public String getVarLimitPositive() {
		return varLimitPositive;
	}

	public void setVarLimitPositive(String varLimitPositive) {
		this.varLimitPositive = varLimitPositive;
	}

	public String getVarLimitNegative() {
		return varLimitNegative;
	}

	public void setVarLimitNegative(String varLimitNegative) {
		this.varLimitNegative = varLimitNegative;
	}

}
