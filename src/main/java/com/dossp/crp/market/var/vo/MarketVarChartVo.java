/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketAnalysisIndexModel.java 
 *
 * @Date:  2018年4月10日  下午4:11:10
 *
 * @Package com.dossp.crp.market.analysis.Index.model
 */


package com.dossp.crp.market.var.vo;


import java.util.ArrayList;
import java.util.List;

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

public class MarketVarChartVo extends BaseModel{
	
	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 5839582322155901698L;

	private String name;
	
	private List<String> data = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}
}
