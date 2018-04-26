/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: AppServiceImpl.java 
 *
 * @Date:  2018年4月19日  下午12:17:55
 *
 * @Package com.dossp.pms.app.service
 */


package com.dossp.pms.app.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dossp.common.util.DateUtil;
import com.dossp.common.util.IDUtil;
import com.dossp.pms.app.mapper.PmsAppClientMapper;
import com.dossp.pms.app.model.PmsAppClientModel;
import com.dossp.pms.app.service.AppService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月19日 下午12:17:55
 * </p>
 * 描述：
 *
 */
@Service
public class AppServiceImpl implements AppService {
	
	@Autowired
	private PmsAppClientMapper pmsAppClientMapper;

	/** 
	 * @param device_code
	 * @param token
	 * @return 
	 */
	@Override
	public boolean checkAuth(String device_code, String token) {
		boolean flag = false;
		if(StringUtils.isBlank(device_code) && StringUtils.isBlank(token)) {
			return flag;
		}
		// 判断device_code和token是否匹配
		Example example = new Example(PmsAppClientModel.class);
		Criteria c = example.createCriteria();
		c.andEqualTo("deviceCode", device_code);
		c.andEqualTo("token", token);
		
		List<PmsAppClientModel> clientList = pmsAppClientMapper.selectByExample(example);
		if(clientList.size() > 0 && clientList.get(0).getId() != null) {
			// 判断是否禁用
			PmsAppClientModel client = clientList.get(0);
			if("1".equals(client.getStatus())) {
				flag = true;
				
				// 判断token是否过期 TODO
				
			}

		}
		
		return flag;
	}

	/** 
	 * @param device_code
	 * @param mac
	 * @return 
	 */
	@Override
	public String registerClient(String device_code, String mac, String name, String email) {
		
		String token = IDUtil.uuid32();
		// 判断该客户端以前是否注册过，如果注册过更新token和过期时间，如果没有，添加一条记录即可。
		// TODO
		Example example = new Example(PmsAppClientModel.class);
		Criteria c = example.createCriteria();
		c.andEqualTo("deviceCode", device_code);
		c.andEqualTo("name", name);
		c.andEqualTo("email", email);
		
		List<PmsAppClientModel> clientList = pmsAppClientMapper.selectByExample(example);
		if(clientList.size() > 0 && clientList.get(0).getId() != null) {
			PmsAppClientModel model = new PmsAppClientModel();
			model.setToken(token);
			model.setName(name);
			model.setEmail(email);
			model.setMac(mac);
			model.setUpdateTime(DateUtil.now());
			
			pmsAppClientMapper.updateByExampleSelective(model, example);
		} else {
			
			PmsAppClientModel model = new PmsAppClientModel();
			model.setDeviceCode(device_code);
			model.setName(name);
			model.setEmail(email);
			model.setMac(mac);
			model.setToken(token);
			
			model.setCreateTime(DateUtil.now());
			model.setUpdateTime(DateUtil.now());
			
			model.setStatus("0");
			
			pmsAppClientMapper.insertSelective(model);
		}
		
		return token;
	}

}
