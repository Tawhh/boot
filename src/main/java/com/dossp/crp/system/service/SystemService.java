/**
 * @copy right Dossp Company All rights reserved
 * @Title: SystemService.java
 * @Date: 2018年4月18日  下午12:21:23
 * @Package com.dossp.crp.system.service
 */


package com.dossp.crp.system.service;

import com.dossp.crp.system.model.UserModel;

/**
 * @author yufenghui
 *         </p>
 *         日期：2018年4月18日 下午12:21:23
 *         </p>
 *         描述：
 */

public interface SystemService {

    /**
     * @param username
     * @return
     */
    UserModel getUserByAccount(String username);

    /**
     * 校验是否有查看报表权限
     *
     * @param user
     * @return
     */
    boolean isHasPermissionToLogin(UserModel user);

}
