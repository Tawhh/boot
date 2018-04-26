/**
 * @copy right Dossp Company All rights reserved
 * @Title: ExceptionHandler.java
 * @Date: 2017/8/26 11:47
 * @Package com.dossp.crp.limit.common.handler
 */
package com.dossp.common.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * @author yufenghui
 * </p>
 * 日期：2017/8/26 11:47
 * </p>
 * 描述：
 */
public class ExceptionHandler extends SimpleMappingExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    /**
     * 
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView view = super.doResolveException(request, response, handler, ex);

        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());

        logger.error("检测到全局异常，URL为" + url, ex);
        view = new ModelAndView("redirect:/error");
        return view;
    }

}
