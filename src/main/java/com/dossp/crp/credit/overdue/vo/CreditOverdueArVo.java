/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueArVo.java 
 *
 * @Date:  2018年4月18日  上午10:44:42
 *
 * @Package com.dossp.crp.credit.overdue.vo
 */


package com.dossp.crp.credit.overdue.vo;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月18日 上午10:44:42
 * </p>
 * 描述：
 *
 */

public class CreditOverdueArVo extends BaseModel {

    /** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 1783318882416520107L;

	private String corpName;
	
	// 30天 赊销
    private String arDueAttAmt;

    //30-90天 赊销
    private String arDueSecAmt;

    //90-180天 赊销
    private String arDueSusAmt;

    //180天以上 赊销
    private String arDueLossAmt;
    

	/**
	 * 
	 */
	public CreditOverdueArVo() {
		super();
	}

	/**
	 * @param corpName
	 * @param arDueAttAmt
	 * @param arDueSecAmt
	 * @param arDueSusAmt
	 * @param arDueLossAmt
	 */
	public CreditOverdueArVo(String corpName, String arDueAttAmt, String arDueSecAmt, String arDueSusAmt,
			String arDueLossAmt) {
		super();
		this.corpName = corpName;
		this.arDueAttAmt = arDueAttAmt;
		this.arDueSecAmt = arDueSecAmt;
		this.arDueSusAmt = arDueSusAmt;
		this.arDueLossAmt = arDueLossAmt;
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
    
}
