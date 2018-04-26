/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureModel.java 
 *
 * @Date:  2018年4月16日  下午4:47:16
 *
 * @Package com.dossp.crp.credit.exposure.mode
 */


package com.dossp.crp.credit.exposure.mode;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午4:47:16
 * </p>
 * 描述：
 *
 */

public class CreditExposureModel extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 6653661964186646231L;

	private String dataDate = "";
	
	private String corpName = "";
	
	private String arNetAmt = "";
	
	private String prepayNetAmt = "";
	
	private String totalNetAmt = "";
	
	private String arNetIndexAmt = "";
	
	private String prepayNetIndexAmt = "";
	
	private String arNetIndexRate = "";
	
	private String prepayNetIndexRate = "";
	
	private String arDeltaNetAmt = "";
	
	private String prepayDeltaNetAmt = "";
	
	private String totalDeltaNetAmt = "";
	
	private String arTurnover = "";
	
	private String arTurnoverDelta = "";
	
	private String prepayTurnover = "";
	
	private String prepayTurnoverDelta = "";
	
	
	/**
	 * @return the arTurnover
	 */
	public String getArTurnover() {
		return arTurnover;
	}

	/**
	 * @param arTurnover the arTurnover to set
	 */
	public void setArTurnover(String arTurnover) {
		this.arTurnover = arTurnover;
	}

	/**
	 * @return the arTurnoverDelta
	 */
	public String getArTurnoverDelta() {
		return arTurnoverDelta;
	}

	/**
	 * @param arTurnoverDelta the arTurnoverDelta to set
	 */
	public void setArTurnoverDelta(String arTurnoverDelta) {
		this.arTurnoverDelta = arTurnoverDelta;
	}

	/**
	 * @return the prepayTurnover
	 */
	public String getPrepayTurnover() {
		return prepayTurnover;
	}

	/**
	 * @param prepayTurnover the prepayTurnover to set
	 */
	public void setPrepayTurnover(String prepayTurnover) {
		this.prepayTurnover = prepayTurnover;
	}

	/**
	 * @return the prepayTurnoverDelta
	 */
	public String getPrepayTurnoverDelta() {
		return prepayTurnoverDelta;
	}

	/**
	 * @param prepayTurnoverDelta the prepayTurnoverDelta to set
	 */
	public void setPrepayTurnoverDelta(String prepayTurnoverDelta) {
		this.prepayTurnoverDelta = prepayTurnoverDelta;
	}

	/**
	 * @return the arDeltaNetAmt
	 */
	public String getArDeltaNetAmt() {
		return arDeltaNetAmt;
	}

	/**
	 * @param arDeltaNetAmt the arDeltaNetAmt to set
	 */
	public void setArDeltaNetAmt(String arDeltaNetAmt) {
		this.arDeltaNetAmt = arDeltaNetAmt;
	}

	/**
	 * @return the prepayDeltaNetAmt
	 */
	public String getPrepayDeltaNetAmt() {
		return prepayDeltaNetAmt;
	}

	/**
	 * @param prepayDeltaNetAmt the prepayDeltaNetAmt to set
	 */
	public void setPrepayDeltaNetAmt(String prepayDeltaNetAmt) {
		this.prepayDeltaNetAmt = prepayDeltaNetAmt;
	}

	/**
	 * @return the totalDeltaNetAmt
	 */
	public String getTotalDeltaNetAmt() {
		return totalDeltaNetAmt;
	}

	/**
	 * @param totalDeltaNetAmt the totalDeltaNetAmt to set
	 */
	public void setTotalDeltaNetAmt(String totalDeltaNetAmt) {
		this.totalDeltaNetAmt = totalDeltaNetAmt;
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
	 * @return the arNetAmt
	 */
	public String getArNetAmt() {
		return arNetAmt;
	}

	/**
	 * @param arNetAmt the arNetAmt to set
	 */
	public void setArNetAmt(String arNetAmt) {
		this.arNetAmt = arNetAmt;
	}

	/**
	 * @return the prepayNetAmt
	 */
	public String getPrepayNetAmt() {
		return prepayNetAmt;
	}

	/**
	 * @param prepayNetAmt the prepayNetAmt to set
	 */
	public void setPrepayNetAmt(String prepayNetAmt) {
		this.prepayNetAmt = prepayNetAmt;
	}

	/**
	 * @return the totalNetAmt
	 */
	public String getTotalNetAmt() {
		return totalNetAmt;
	}

	/**
	 * @param totalNetAmt the totalNetAmt to set
	 */
	public void setTotalNetAmt(String totalNetAmt) {
		this.totalNetAmt = totalNetAmt;
	}

	/**
	 * @return the arNetIndexAmt
	 */
	public String getArNetIndexAmt() {
		return arNetIndexAmt;
	}

	/**
	 * @param arNetIndexAmt the arNetIndexAmt to set
	 */
	public void setArNetIndexAmt(String arNetIndexAmt) {
		this.arNetIndexAmt = arNetIndexAmt;
	}

	/**
	 * @return the prepayNetIndexAmt
	 */
	public String getPrepayNetIndexAmt() {
		return prepayNetIndexAmt;
	}

	/**
	 * @param prepayNetIndexAmt the prepayNetIndexAmt to set
	 */
	public void setPrepayNetIndexAmt(String prepayNetIndexAmt) {
		this.prepayNetIndexAmt = prepayNetIndexAmt;
	}

	/**
	 * @return the arNetIndexRate
	 */
	public String getArNetIndexRate() {
		return arNetIndexRate;
	}

	/**
	 * @param arNetIndexRate the arNetIndexRate to set
	 */
	public void setArNetIndexRate(String arNetIndexRate) {
		this.arNetIndexRate = arNetIndexRate;
	}

	/**
	 * @return the prepayNetIndexRate
	 */
	public String getPrepayNetIndexRate() {
		return prepayNetIndexRate;
	}

	/**
	 * @param prepayNetIndexRate the prepayNetIndexRate to set
	 */
	public void setPrepayNetIndexRate(String prepayNetIndexRate) {
		this.prepayNetIndexRate = prepayNetIndexRate;
	}

}
