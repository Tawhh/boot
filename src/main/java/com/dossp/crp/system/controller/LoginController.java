/**
 * @copy right Dossp Company All rights reserved
 * @Title: LoginController.java
 * @Date: 2018年4月18日  下午2:52:51
 * @Package com.dossp.crp.system.controller
 */


package com.dossp.crp.system.controller;

import com.dossp.common.model.JsonMsg;
import com.dossp.common.util.SessionUtil;
import com.dossp.common.util.SpringEncryptUtil;
import com.dossp.crp.system.model.UserModel;
import com.dossp.crp.system.model.UserSessionModel;
import com.dossp.crp.system.service.SystemService;
import com.dossp.pms.app.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yufenghui
 *         </p>
 *         日期：2018年4月18日 下午2:52:51
 *         </p>
 *         描述：
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private SystemService systemService;

    @Autowired
    private AppService appService;

    /**
     * @return
     */
    @RequestMapping(value = "health")
    @ResponseBody
    public JsonMsg health() {
        JsonMsg msg = new JsonMsg();
        // 授权检测
        msg.setSuccess(true);
        msg.setMsg("服务器端正常");

        return msg;
    }


    /**
     * @return
     */
    @RequestMapping(value = "auth")
    @ResponseBody
    public JsonMsg auth(HttpServletRequest request, String device_code) {
        JsonMsg msg = new JsonMsg();
        // 授权检测
        try {
            String token = request.getHeader("CRP-TOKEN");

            boolean ret = appService.checkAuth(device_code, token);

            msg.setSuccess(ret);
            msg.setMsg("客户端已授权");
        } catch (Throwable t) {
            log.error("服务器端错误", t);
            msg.setSuccess(false);
            msg.setMsg("服务器端错误");
        }

        return msg;
    }

    /**
     * @return
     */
    @RequestMapping(value = "register_client")
    @ResponseBody
    public JsonMsg register_client(String device_code, String mac, String name, String email) {
        JsonMsg msg = new JsonMsg();
        try {
            // 客户端注册
            String token = appService.registerClient(device_code, mac, name, email);

            msg.setSuccess(true);
            msg.setMsg("注册成功");
            msg.setObj(token);
        } catch (Throwable t) {
            log.error("服务器端错误", t);
            msg.setSuccess(false);
            msg.setMsg("服务器端错误");
        }

        return msg;
    }


    /**
     * @return
     */
    @GetMapping(value = "/")
    public String index(Model model) {


        return "login";
    }

    /**
     * @return
     */
    @RequestMapping(value = "login")
    public String login(HttpServletRequest request, String userName, String password) {
        String msg = "";
        boolean flag = false;

        try {
            UserModel user = systemService.getUserByAccount(userName);
            if (user != null && user.getId() != null) {
                if ("2".equals(user.getStatus())) {
                    msg = "用户已禁用";
                } else if ("1".equals(user.getStatus())) {
                    if (SpringEncryptUtil.match(password, user.getPassword())) {
                        /*flag = systemService.isHasPermissionToLogin(user);*/
                        if (flag) {
                            flag = true;
                            // 将用户放入session中去
                            UserSessionModel usb = new UserSessionModel();
                            usb.setId(user.getId());
                            usb.setUserName(user.getUserName());
                            usb.setAccount(user.getAccount());

                            SessionUtil.saveUser(request, usb);

                        } else {
                            msg = "无权限登录";
                        }
                    } else {
                        msg = "用户名或密码错误";
                    }
                } else {
                    msg = "用户名或密码错误";
                }

            } else {
                msg = "用户名或密码错误";
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }

        if (flag) {
            return "main";
        } else {
            request.setAttribute("msg", msg);
            return "login";
        }

    }

}
