/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: DynamicDataSource.java 
 *
 * @Date:  2017年6月29日  下午1:47:15
 *
 * @Package com.dossp.cofco.etl.common.util
 */


package com.dossp.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author yufenghui
 * 
 * 日期：2017年6月29日 下午1:47:15
 *
 * 描述：
 * @version V1.0
 *
 */

public class DynamicDataSource extends AbstractRoutingDataSource {

	/** 
	 * @return 
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDbType();
	}

}
