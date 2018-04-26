/**
 * @copy right Dossp Company All rights reserved
 * @Title: SessionUtil.java
 * @Date: 2016年10月17日  上午11:00:19
 * @Package com.dossp.mcprc.cmr.web.das.util
 */


package com.dossp.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dossp.crp.system.model.UserSessionModel;


/**
 * @author yufenghui
 * </p>
 * 日期：2016年10月17日 上午11:00:19
 * </p>
 * 描述：
 *
 */

public final class SessionUtil {

    /**
     *
     * @param request
     * @param model
     */
    public static void saveUser(HttpServletRequest request, UserSessionModel model) {

        HttpSession session = request.getSession();
        session.setAttribute("app_user", model);
    }

    /**
     *
     * @param request
     * @param request
     */
    public static UserSessionModel getUser(HttpServletRequest request) {

        HttpSession session = request.getSession();
        UserSessionModel user = (UserSessionModel) session.getAttribute("app_user");
        if(user == null) {
        	throw new RuntimeException("用户未登录");
        } else {
        	return user;
        }
    }

    /**
     *
     * @param request
     */
    public static void removeUser(HttpServletRequest request) {

        HttpSession session = request.getSession();
        session.removeAttribute("app_user");
    }

}
