/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueModel.java 
 *
 * @Date:  2018年4月18日  上午10:37:12
 *
 * @Package com.dossp.crp.credit.overdue.model
 */


package com.dossp.crp.credit.overdue.model;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月18日 上午10:37:12
 * </p>
 * 描述：
 *
 */

public class CreditOverdueModel extends BaseModel {

    /** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 5490194011831009775L;

	private String dataDate;
	
	private String corpName;
	
	private String arDueTotalAmt;

    // 30天 赊销
    private String arDueAttAmt;

    //30-90天 赊销
    private String arDueSecAmt;

    //90-180天 赊销
    private String arDueSusAmt;

    //180天以上 赊销
    private String arDueLossAmt;
    
    //预付  10日
    private String purDueTotalAmt;
    
    //预付  10日
    private String purDueAttAmt;
    
    //预付 10-30日
    private String purDueSecAmt;
    
    //预付  30以上
    private String purDueSusAmt;

    
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
	 * @return the dataDate
	 */
	public String getDataDate() {
		return dataDate;
	}

	/**
	 * @param dataDate the dataDate to set
	 */
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}

	/**
	 * @return the arDueTotalAmt
	 */
	public String getArDueTotalAmt() {
		return arDueTotalAmt;
	}

	/**
	 * @param arDueTotalAmt the arDueTotalAmt to set
	 */
	public void setArDueTotalAmt(String arDueTotalAmt) {
		this.arDueTotalAmt = arDueTotalAmt;
	}

	/**
	 * @return the arDueAttAmt
	 */
	public String getArDueAttAmt() {
		return arDueAttAmt;
	}

	/**
	 * @param arDueAttAmt the arDueAttAmt to set
	 */
	public void setArDueAttAmt(String arDueAttAmt) {
		this.arDueAttAmt = arDueAttAmt;
	}

	/**
	 * @return the arDueSecAmt
	 */
	public String getArDueSecAmt() {
		return arDueSecAmt;
	}

	/**
	 * @param arDueSecAmt the arDueSecAmt to set
	 */
	public void setArDueSecAmt(String arDueSecAmt) {
		this.arDueSecAmt = arDueSecAmt;
	}

	/**
	 * @return the arDueSusAmt
	 */
	public String getArDueSusAmt() {
		return arDueSusAmt;
	}

	/**
	 * @param arDueSusAmt the arDueSusAmt to set
	 */
	public void setArDueSusAmt(String arDueSusAmt) {
		this.arDueSusAmt = arDueSusAmt;
	}

	/**
	 * @return the arDueLossAmt
	 */
	public String getArDueLossAmt() {
		return arDueLossAmt;
	}

	/**
	 * @param arDueLossAmt the arDueLossAmt to set
	 */
	public void setArDueLossAmt(String arDueLossAmt) {
		this.arDueLossAmt = arDueLossAmt;
	}

	/**
	 * @return the purDueTotalAmt
	 */
	public String getPurDueTotalAmt() {
		return purDueTotalAmt;
	}

	/**
	 * @param purDueTotalAmt the purDueTotalAmt to set
	 */
	public void setPurDueTotalAmt(String purDueTotalAmt) {
		this.purDueTotalAmt = purDueTotalAmt;
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
