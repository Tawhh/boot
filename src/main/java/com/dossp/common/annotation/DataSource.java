/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: DataSource.java 
 *
 * @Date:  2017年7月5日  上午10:28:36
 *
 * @Package com.dossp.crp.common.annotation
 */


package com.dossp.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yufenghui
 * </p>
 * 日期：2017年7月5日 上午10:28:36
 * </p>
 * 描述：数据源注解
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

	String value() default "crp";
	
}
