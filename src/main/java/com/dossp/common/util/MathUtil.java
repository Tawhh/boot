/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: MathUtil.java 
 *
 * @Date:  2017年2月22日  上午10:14:56
 *
 * @Package com.dossp.pms.common.util
 */

package com.dossp.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yufenghui
 *         </p>
 *         日期：2017年2月22日 上午10:14:56
 *         </p>
 *         描述：
 *
 */

public final class MathUtil {

	/**
	 * 提供精确加法计算的add方法
	 * 
	 * @param value1
	 *            被加数
	 * @param value2
	 *            加数
	 * @return 两个参数的和
	 */
	public static double add(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.add(b2).doubleValue();
	}

	/**
	 * 提供精确减法运算的sub方法
	 * 
	 * @param value1
	 *            被减数
	 * @param value2
	 *            减数
	 * @return 两个参数的差
	 */
	public static double sub(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.subtract(b2).doubleValue();
	}

	/**
	 * 提供精确乘法运算的mul方法
	 * 
	 * @param value1
	 *            被乘数
	 * @param value2
	 *            乘数
	 * @return 两个参数的积
	 */
	public static double mul(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.multiply(b2).doubleValue();
	}

	/**
	 * 提供精确的除法运算方法div
	 * 
	 * @param value1
	 *            被除数
	 * @param value2
	 *            除数
	 * @param scale
	 *            精确范围
	 * @return 两个参数的商
	 * @throws IllegalAccessException
	 */
	public static double div(double value1, double value2, int scale) {
		// 如果精确范围小于0，抛出异常信息
		if (scale < 0) {
			throw new RuntimeException("精确度不能小于0");
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round1(String value) {
		DecimalFormat df = new DecimalFormat("######0.0");
		
		return df.format(Double.parseDouble(value)); 
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round2(String value) {
		DecimalFormat df = new DecimalFormat("######0.00");
		
		return df.format(Double.parseDouble(value)); 
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round1(Double value) {
		DecimalFormat df = new DecimalFormat("######0.0");
		
		return df.format(value); 
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round2(Double value) {
		DecimalFormat df = new DecimalFormat("######0.00");
		
		return df.format(value); 
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round4(String value) {
		DecimalFormat df = new DecimalFormat("######0.0000");
		
		return df.format(Double.parseDouble(value)); 
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String round4(Double value) {
		DecimalFormat df = new DecimalFormat("######0.0000");
		
		return df.format(value); 
	}

	/** 
	 * @param s1
	 * @param s2
	 * @param i
	 * @return 
	 */
	public static String add(String s1, String s2, int i) {
		if(StringUtils.isBlank(s1)) {
			s1 = "0";
		}
		if(StringUtils.isBlank(s2)) {
			s2 = "0";
		}
		double ret = add(Double.parseDouble(s1), Double.parseDouble(s2));
		return round1(ret);
	}
	
	/** 
	 * @param s1
	 * @param s2
	 * @param i
	 * @return 
	 */
	public static String div2(String s1, String s2) {
		if(StringUtils.isBlank(s1)) {
			s1 = "0";
		}
		if(StringUtils.isBlank(s2)) {
			s2 = "0";
		}
		double ret = div(Double.parseDouble(s1), Double.parseDouble(s2), 2);
		return round2(ret);
	}

}
