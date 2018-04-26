/**
 * @copy right Dossp Company All rights reserved
 * @Title: CheckPermissionInterceptor.java
 * @Date: 2016年10月26日  下午4:29:15
 * @Package com.dossp.cris.web.util
 */

package com.dossp.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dossp.common.util.SessionUtil;
import com.dossp.crp.system.model.UserSessionModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author yufenghui
 *         </p>
 *         日期：2016年10月26日 下午4:29:15
 *         </p>
 *         描述：
 */
@Component
public class CheckPermissionInterceptor implements HandlerInterceptor {

	/**
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		int index = url.indexOf(";");
        if(index != -1) {
        	url = url.substring(0, index);
        }

		// 去掉对共用页面的过滤
		if (!url.startsWith("/api")) {
			return true;
		}
		
		// 非admin用户无法访问权限管理模块
		UserSessionModel user = SessionUtil.getUser(request);
		if(user != null && StringUtils.isNotBlank(user.getAccount())) {
			return true;
		} else {
			response.sendRedirect(contextPath + "/");
			return false;
		}

	}

	/**
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// do nothing

	}

	/**
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// do nothing

	}

}
