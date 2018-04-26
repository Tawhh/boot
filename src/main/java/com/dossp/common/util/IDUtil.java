/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: IDUtil.java 
 *
 * @Date:  2018年4月19日  下午1:29:35
 *
 * @Package com.dossp.common.util
 */


package com.dossp.common.util;

import java.util.UUID;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月19日 下午1:29:35
 * </p>
 * 描述：
 *
 */

public class IDUtil {
	
	/**
	 * 
	 * @return
	 */
	public static String uuid32() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
