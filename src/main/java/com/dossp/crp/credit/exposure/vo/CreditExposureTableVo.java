/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureGroupVo.java 
 *
 * @Date:  2018年4月16日  下午3:29:24
 *
 * @Package com.dossp.crp.credit.exposure.mode
 */


package com.dossp.crp.credit.exposure.vo;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:29:24
 * </p>
 * 描述：
 *
 */

public class CreditExposureTableVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -5328954482146749513L;

	private String corp_name;
	
	private String ar_exposure;
	
	private String ar_exposure_status;
	
	private String ar_exposure_delta;
	
	private String ar_index_rate;
	
	private String ar_turnover;
	
	private String ar_turnover_status;
	
	private String ar_turnover_delta;
	
	private String ar_index_limit;
	
	private String prepay_exposure;
	
	private String prepay_exposure_status;
	
	private String prepay_exposure_delta;
	
	private String prepay_index_rate;
	
	private String prepay_turnover;
	
	private String prepay_turnover_status;
	
	private String prepay_turnover_delta;
	
	private String prepay_index_limit;

	/**
	 * @return the corp_name
	 */
	public String getCorp_name() {
		return corp_name;
	}

	/**
	 * @param corp_name the corp_name to set
	 */
	public void setCorp_name(String corp_name) {
		this.corp_name = corp_name;
	}

	/**
	 * @return the ar_exposure
	 */
	public String getAr_exposure() {
		return ar_exposure;
	}

	/**
	 * @param ar_exposure the ar_exposure to set
	 */
	public void setAr_exposure(String ar_exposure) {
		this.ar_exposure = ar_exposure;
	}

	/**
	 * @return the ar_exposure_status
	 */
	public String getAr_exposure_status() {
		return ar_exposure_status;
	}

	/**
	 * @param ar_exposure_status the ar_exposure_status to set
	 */
	public void setAr_exposure_status(String ar_exposure_status) {
		this.ar_exposure_status = ar_exposure_status;
	}

	/**
	 * @return the ar_exposure_delta
	 */
	public String getAr_exposure_delta() {
		return ar_exposure_delta;
	}

	/**
	 * @param ar_exposure_delta the ar_exposure_delta to set
	 */
	public void setAr_exposure_delta(String ar_exposure_delta) {
		this.ar_exposure_delta = ar_exposure_delta;
	}

	/**
	 * @return the ar_index_rate
	 */
	public String getAr_index_rate() {
		return ar_index_rate;
	}

	/**
	 * @param ar_index_rate the ar_index_rate to set
	 */
	public void setAr_index_rate(String ar_index_rate) {
		this.ar_index_rate = ar_index_rate;
	}

	/**
	 * @return the ar_turnover
	 */
	public String getAr_turnover() {
		return ar_turnover;
	}

	/**
	 * @param ar_turnover the ar_turnover to set
	 */
	public void setAr_turnover(String ar_turnover) {
		this.ar_turnover = ar_turnover;
	}

	/**
	 * @return the ar_turnover_status
	 */
	public String getAr_turnover_status() {
		return ar_turnover_status;
	}

	/**
	 * @param ar_turnover_status the ar_turnover_status to set
	 */
	public void setAr_turnover_status(String ar_turnover_status) {
		this.ar_turnover_status = ar_turnover_status;
	}

	/**
	 * @return the ar_turnover_delta
	 */
	public String getAr_turnover_delta() {
		return ar_turnover_delta;
	}

	/**
	 * @param ar_turnover_delta the ar_turnover_delta to set
	 */
	public void setAr_turnover_delta(String ar_turnover_delta) {
		this.ar_turnover_delta = ar_turnover_delta;
	}

	/**
	 * @return the ar_index_limit
	 */
	public String getAr_index_limit() {
		return ar_index_limit;
	}

	/**
	 * @param ar_index_limit the ar_index_limit to set
	 */
	public void setAr_index_limit(String ar_index_limit) {
		this.ar_index_limit = ar_index_limit;
	}

	/**
	 * @return the prepay_exposure
	 */
	public String getPrepay_exposure() {
		return prepay_exposure;
	}

	/**
	 * @param prepay_exposure the prepay_exposure to set
	 */
	public void setPrepay_exposure(String prepay_exposure) {
		this.prepay_exposure = prepay_exposure;
	}

	/**
	 * @return the prepay_exposure_status
	 */
	public String getPrepay_exposure_status() {
		return prepay_exposure_status;
	}

	/**
	 * @param prepay_exposure_status the prepay_exposure_status to set
	 */
	public void setPrepay_exposure_status(String prepay_exposure_status) {
		this.prepay_exposure_status = prepay_exposure_status;
	}

	/**
	 * @return the prepay_exposure_delta
	 */
	public String getPrepay_exposure_delta() {
		return prepay_exposure_delta;
	}

	/**
	 * @param prepay_exposure_delta the prepay_exposure_delta to set
	 */
	public void setPrepay_exposure_delta(String prepay_exposure_delta) {
		this.prepay_exposure_delta = prepay_exposure_delta;
	}

	/**
	 * @return the prepay_index_rate
	 */
	public String getPrepay_index_rate() {
		return prepay_index_rate;
	}

	/**
	 * @param prepay_index_rate the prepay_index_rate to set
	 */
	public void setPrepay_index_rate(String prepay_index_rate) {
		this.prepay_index_rate = prepay_index_rate;
	}

	/**
	 * @return the prepay_turnover
	 */
	public String getPrepay_turnover() {
		return prepay_turnover;
	}

	/**
	 * @param prepay_turnover the prepay_turnover to set
	 */
	public void setPrepay_turnover(String prepay_turnover) {
		this.prepay_turnover = prepay_turnover;
	}

	/**
	 * @return the prepay_turnover_status
	 */
	public String getPrepay_turnover_status() {
		return prepay_turnover_status;
	}

	/**
	 * @param prepay_turnover_status the prepay_turnover_status to set
	 */
	public void setPrepay_turnover_status(String prepay_turnover_status) {
		this.prepay_turnover_status = prepay_turnover_status;
	}

	/**
	 * @return the prepay_turnover_delta
	 */
	public String getPrepay_turnover_delta() {
		return prepay_turnover_delta;
	}

	/**
	 * @param prepay_turnover_delta the prepay_turnover_delta to set
	 */
	public void setPrepay_turnover_delta(String prepay_turnover_delta) {
		this.prepay_turnover_delta = prepay_turnover_delta;
	}

	/**
	 * @return the prepay_index_limit
	 */
	public String getPrepay_index_limit() {
		return prepay_index_limit;
	}

	/**
	 * @param prepay_index_limit the prepay_index_limit to set
	 */
	public void setPrepay_index_limit(String prepay_index_limit) {
		this.prepay_index_limit = prepay_index_limit;
	}
	
}
