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

public class MarketVarTableModel extends BaseModel{

	/** 
	 * 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -4714119252250839495L;
	
	private String orgCode;
	
	private String orgName;
	
	private String var;
	
	private String varDelta;
	
	private Double varPnt;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getVarDelta() {
		return varDelta;
	}

	public void setVarDelta(String varDelta) {
		this.varDelta = varDelta;
	}

	public Double getVarPnt() {
		return varPnt;
	}

	public void setVarPnt(Double varPnt) {
		this.varPnt = varPnt;
	}

}
