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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:29:24
 * </p>
 * 描述：
 *
 */

public class CreditExposureGroupVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -5328954482146749513L;

	@JsonProperty("index_name")
	private String indexName;
	
	@JsonProperty("index_value")
	private String indexValue = "";
	
	private String status = "";
	
	private String delta = "";
	

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the delta
	 */
	public String getDelta() {
		return delta;
	}

	/**
	 * @param delta the delta to set
	 */
	public void setDelta(String delta) {
		this.delta = delta;
	}

	/**
	 * 
	 */
	public CreditExposureGroupVo() {
		super();
	}

	/**
	 * @param indexName
	 * @param indexValue
	 */
	public CreditExposureGroupVo(String indexName, String indexValue) {
		super();
		this.indexName = indexName;
		this.indexValue = indexValue;
	}

	/**
	 * @return the indexName
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * @param indexName the indexName to set
	 */
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	/**
	 * @return the indexValue
	 */
	public String getIndexValue() {
		return indexValue;
	}

	/**
	 * @param indexValue the indexValue to set
	 */
	public void setIndexValue(String indexValue) {
		this.indexValue = indexValue;
	}
	
	
}
