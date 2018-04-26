/**
 * @copy right Dossp Company All rights reserved
 * @Title: SystemMapper.java
 * @Date: 2018年4月18日  下午12:21:10
 * @Package com.dossp.crp.system.mapper
 */


package com.dossp.crp.system.mapper;

import com.dossp.crp.system.model.UserModel;

/**
 * @author yufenghui
 *         </p>
 *         日期：2018年4月18日 下午12:21:10
 *         </p>
 *         描述：
 */

public interface SystemMapper {

    /**
     * @param username
     * @return
     */
    UserModel getUserByAccount(String username);

    /**
     * @param username
     * @return
     */
    int isHasPermission(String username);
}
