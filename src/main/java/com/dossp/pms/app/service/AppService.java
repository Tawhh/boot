/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: AppService.java 
 *
 * @Date:  2018年4月19日  下午12:17:42
 *
 * @Package com.dossp.pms.app.service
 */


package com.dossp.pms.app.service;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月19日 下午12:17:42
 * </p>
 * 描述：
 *
 */

public interface AppService {

	/** 
	 * @param device_code
	 * @param token
	 * @return 
	 */
	boolean checkAuth(String device_code, String token);

	/** 
	 * @param device_code
	 * @param mac
	 * @return 
	 */
	String registerClient(String device_code, String mac, String name, String email);

}
