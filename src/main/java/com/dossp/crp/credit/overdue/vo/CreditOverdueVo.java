/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueVo.java 
 *
 * @Date:  2018年4月17日  下午4:41:06
 *
 * @Package com.dossp.crp.credit.overdue.vo
 */


package com.dossp.crp.credit.overdue.vo;

import java.util.List;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月17日 下午4:41:06
 * </p>
 * 描述：
 *
 */

public class CreditOverdueVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 5073225661616263343L;

	private String dataDate;

	private String[] arOverdue;

	private List<CreditOverdueArVo> arTableList;

	private String[] prepayOverdue;

	private List<CreditOverduePrepayVo> prepayTableList;

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
	 * @return the arOverdue
	 */
	public String[] getArOverdue() {
		return arOverdue;
	}

	/**
	 * @param arOverdue the arOverdue to set
	 */
	public void setArOverdue(String[] arOverdue) {
		this.arOverdue = arOverdue;
	}

	/**
	 * @return the prepayOverdue
	 */
	public String[] getPrepayOverdue() {
		return prepayOverdue;
	}

	/**
	 * @param prepayOverdue the prepayOverdue to set
	 */
	public void setPrepayOverdue(String[] prepayOverdue) {
		this.prepayOverdue = prepayOverdue;
	}

	/**
	 * @return the arTableList
	 */
	public List<CreditOverdueArVo> getArTableList() {
		return arTableList;
	}

	/**
	 * @param arTableList the arTableList to set
	 */
	public void setArTableList(List<CreditOverdueArVo> arTableList) {
		this.arTableList = arTableList;
	}

	/**
	 * @return the prepayTableList
	 */
	public List<CreditOverduePrepayVo> getPrepayTableList() {
		return prepayTableList;
	}

	/**
	 * @param prepayTableList the prepayTableList to set
	 */
	public void setPrepayTableList(List<CreditOverduePrepayVo> prepayTableList) {
		this.prepayTableList = prepayTableList;
	}

}
