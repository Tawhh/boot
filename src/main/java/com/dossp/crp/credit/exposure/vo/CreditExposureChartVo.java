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

public class CreditExposureChartVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -5328954482146749513L;
	
	private String[] corp_name;
	
	private String[] ar_exposure;
	
	private String[] ar_index;
	
	private String[] prepay_exposure;
	
	private String[] prepay_index;
	
	private String[] ar_prepay_exposure;
	
	private String[] ar_prepay_index;

	/**
	 * @return the corp_name
	 */
	public String[] getCorp_name() {
		return corp_name;
	}

	/**
	 * @param corp_name the corp_name to set
	 */
	public void setCorp_name(String[] corp_name) {
		this.corp_name = corp_name;
	}

	/**
	 * @return the ar_exposure
	 */
	public String[] getAr_exposure() {
		return ar_exposure;
	}

	/**
	 * @param ar_exposure the ar_exposure to set
	 */
	public void setAr_exposure(String[] ar_exposure) {
		this.ar_exposure = ar_exposure;
	}

	/**
	 * @return the ar_index
	 */
	public String[] getAr_index() {
		return ar_index;
	}

	/**
	 * @param ar_index the ar_index to set
	 */
	public void setAr_index(String[] ar_index) {
		this.ar_index = ar_index;
	}

	/**
	 * @return the prepay_exposure
	 */
	public String[] getPrepay_exposure() {
		return prepay_exposure;
	}

	/**
	 * @param prepay_exposure the prepay_exposure to set
	 */
	public void setPrepay_exposure(String[] prepay_exposure) {
		this.prepay_exposure = prepay_exposure;
	}

	/**
	 * @return the prepay_index
	 */
	public String[] getPrepay_index() {
		return prepay_index;
	}

	/**
	 * @param prepay_index the prepay_index to set
	 */
	public void setPrepay_index(String[] prepay_index) {
		this.prepay_index = prepay_index;
	}

	/**
	 * @return the ar_prepay_exposure
	 */
	public String[] getAr_prepay_exposure() {
		return ar_prepay_exposure;
	}

	/**
	 * @param ar_prepay_exposure the ar_prepay_exposure to set
	 */
	public void setAr_prepay_exposure(String[] ar_prepay_exposure) {
		this.ar_prepay_exposure = ar_prepay_exposure;
	}

	/**
	 * @return the ar_prepay_index
	 */
	public String[] getAr_prepay_index() {
		return ar_prepay_index;
	}

	/**
	 * @param ar_prepay_index the ar_prepay_index to set
	 */
	public void setAr_prepay_index(String[] ar_prepay_index) {
		this.ar_prepay_index = ar_prepay_index;
	}

}
