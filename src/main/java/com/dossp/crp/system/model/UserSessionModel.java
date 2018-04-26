/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: UserSessionModel.java 
 *
 * @Date:  2018年4月18日  下午12:22:44
 *
 * @Package com.dossp.crp.system.model
 */


package com.dossp.crp.system.model;

import com.dossp.common.model.BaseModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月18日 下午12:22:44
 * </p>
 * 描述：
 *
 */

public class UserSessionModel extends BaseModel {

	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 3299104256094559485L;

	private Long id;
	
	private String account;
	
	private String userName;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
