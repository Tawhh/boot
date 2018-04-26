/**
 * @copy right Dossp Company All rights reserved
 * @Title: SystemServiceImpl.java
 * @Date: 2018年4月18日  下午12:21:35
 * @Package com.dossp.crp.system.service.impl
 */


package com.dossp.crp.system.service.impl;

import com.dossp.common.annotation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dossp.crp.system.mapper.SystemMapper;
import com.dossp.crp.system.model.UserModel;
import com.dossp.crp.system.service.SystemService;

/**
 * @author yufenghui
 *         </p>
 *         日期：2018年4月18日 下午12:21:35
 *         </p>
 *         描述：
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemMapper systemMapper;

    /**
     * @param username
     * @return
     */
    @Override
    @DataSource("crp_portal")
    public UserModel getUserByAccount(String username) {
        return systemMapper.getUserByAccount(username);
    }

    /**
     * @param user
     * @return
     */
    @Override
    public boolean isHasPermissionToLogin(UserModel user) {
        int a = systemMapper.isHasPermission(user.getUserName());
        if (a > 0) {
            return true;
        }
        return false;
    }
}
