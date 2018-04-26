/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverduePrepayVo.java 
 *
 * @Date:  2018年4月18日  上午10:46:49
 *
 * @Package com.dossp.crp.credit.overdue.vo
 */


package com.dossp.crp.credit.overdue.vo;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月18日 上午10:46:49
 * </p>
 * 描述：
 *
 */

public class CreditOverduePrepayVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -8599723592237530888L;

	private String corpName;
	
	//预付  10日
    private String purDueAttAmt;
    
    //预付 10-30日
    private String purDueSecAmt;
    
    //预付  30以上
    private String purDueSusAmt;
    

	/**
	 * 
	 */
	public CreditOverduePrepayVo() {
		super();
	}

	/**
	 * @param corpName
	 * @param purDueAttAmt
	 * @param purDueSecAmt
	 * @param purDueSusAmt
	 */
	public CreditOverduePrepayVo(String corpName, String purDueAttAmt, String purDueSecAmt, String purDueSusAmt) {
		super();
		this.corpName = corpName;
		this.purDueAttAmt = purDueAttAmt;
		this.purDueSecAmt = purDueSecAmt;
		this.purDueSusAmt = purDueSusAmt;
	}

	/**
	 * @return the corpName
	 */
	public String getCorpName() {
		return corpName;
	}

	/**
	 * @param corpName the corpName to set
	 */
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	/**
	 * @return the purDueAttAmt
	 */
	public String getPurDueAttAmt() {
		return purDueAttAmt;
	}

	/**
	 * @param purDueAttAmt the purDueAttAmt to set
	 */
	public void setPurDueAttAmt(String purDueAttAmt) {
		this.purDueAttAmt = purDueAttAmt;
	}

	/**
	 * @return the purDueSecAmt
	 */
	public String getPurDueSecAmt() {
		return purDueSecAmt;
	}

	/**
	 * @param purDueSecAmt the purDueSecAmt to set
	 */
	public void setPurDueSecAmt(String purDueSecAmt) {
		this.purDueSecAmt = purDueSecAmt;
	}

	/**
	 * @return the purDueSusAmt
	 */
	public String getPurDueSusAmt() {
		return purDueSusAmt;
	}

	/**
	 * @param purDueSusAmt the purDueSusAmt to set
	 */
	public void setPurDueSusAmt(String purDueSusAmt) {
		this.purDueSusAmt = purDueSusAmt;
	}
    
}
