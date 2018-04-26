/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: DataSourceAspect.java 
 *
 * @Date:  2017年7月5日  上午10:31:12
 *
 * @Package com.dossp.crp.common.aspect
 */

package com.dossp.common.aspect;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dossp.common.annotation.DataSource;
import com.dossp.common.datasource.DataSourceContextHolder;


/**
 * @author yufenghui
 *         </p>
 *         日期：2017年7月5日 上午10:31:12
 *         </p>
 *         描述：
 *
 */
@Aspect
@Component
public class DataSourceAspect {
	
	private static final Logger log = LoggerFactory.getLogger(DataSourceAspect.class);

	/**
	 *
	 * @param pjp
	 */
	@Around("@annotation(com.dossp.common.annotation.DataSource)")
	public Object around(ProceedingJoinPoint pjp) {
		Object result = null;
		try {
			Class<?> target = pjp.getTarget().getClass();
			MethodSignature signature = (MethodSignature) pjp.getSignature();
			// 默认使用目标类型的注解，如果没有则使用其实现接口的注解
			for (Class<?> clazz : target.getInterfaces()) {
				resolveDataSource(clazz, signature.getMethod());
			}
			resolveDataSource(target, signature.getMethod());
		
			result = pjp.proceed();
		} catch (Throwable e) {
			log.error("目标方法调用出错", e);
			throw new RuntimeException("目标方法调用出错", e);
		} finally {
			DataSourceContextHolder.clearDbType();
		}
		
		return result;
	}

	/**
	 * 提取目标对象方法注解和类型注解中的数据源标识
	 * 
	 * @param clazz
	 * @param method
	 * @throws Exception 
	 */
	private void resolveDataSource(Class<?> clazz, Method method) throws Exception {
		try {
			Class<?>[] types = method.getParameterTypes();
			// 默认使用类型注解
			if (clazz.isAnnotationPresent(DataSource.class)) {
				DataSource source = clazz.getAnnotation(DataSource.class);
				String value = source.value();
				if(StringUtils.isNotBlank(value)) {
					DataSourceContextHolder.setDbType(value);
				}
			}
			// 方法注解可以覆盖类型注解
			Method m = clazz.getMethod(method.getName(), types);
			if (m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource source = m.getAnnotation(DataSource.class);
				String value = source.value();
				if(StringUtils.isNotBlank(value)) {
					DataSourceContextHolder.setDbType(value);
				}
			}
		} catch (Exception e) {
			log.error("解析数据源出错", e);
			throw e;
		}
	}

}
