/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureVo.java 
 *
 * @Date:  2018年4月16日  下午3:26:20
 *
 * @Package com.dossp.crp.credit.exposure.vo
 */


package com.dossp.crp.credit.exposure.vo;

import java.util.ArrayList;
import java.util.List;

import com.dossp.common.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:26:20
 * </p>
 * 描述：
 *
 */

public class CreditExposureVo extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 5369441422777581824L;
	
	@JsonProperty("data_date")
	private String dataDate;
	
	private List<CreditExposureGroupVo> group = new ArrayList<>(0);
	
	private CreditExposureChartVo chart;
	
	@JsonProperty("table_list")
	private List<CreditExposureTableVo> table = new ArrayList<>(0);

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
	 * @return the group
	 */
	public List<CreditExposureGroupVo> getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(List<CreditExposureGroupVo> group) {
		this.group = group;
	}

	/**
	 * @return the chart
	 */
	public CreditExposureChartVo getChart() {
		return chart;
	}

	/**
	 * @param chart the chart to set
	 */
	public void setChart(CreditExposureChartVo chart) {
		this.chart = chart;
	}

	/**
	 * @return the table
	 */
	public List<CreditExposureTableVo> getTable() {
		return table;
	}

	/**
	 * @param table the table to set
	 */
	public void setTable(List<CreditExposureTableVo> table) {
		this.table = table;
	}

}
