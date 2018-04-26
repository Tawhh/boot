/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: DataSourceContextHolder.java 
 *
 * @Date:  2017年6月29日  下午1:47:39
 *
 * @Package com.dossp.cofco.etl.common.util
 */

package com.dossp.common.datasource;

/**
 * @author yufenghui
 * 
 *         日期：2017年6月29日 下午1:47:39
 *
 *         描述：
 * @version V1.0
 *
 */

public final class DataSourceContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDbType() {
		return ((String) contextHolder.get());
	}

	public static void clearDbType() {
		contextHolder.remove();
	}

}
