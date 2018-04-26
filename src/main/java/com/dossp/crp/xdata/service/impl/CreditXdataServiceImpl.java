/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: CreditXdataServiceImpl.java 
 *
 * @Date:  2018年4月19日  下午3:01:47
 *
 * @Package com.dossp.crp.xdata.service.impl
 */


package com.dossp.crp.xdata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dossp.common.annotation.DataSource;
import com.dossp.common.service.impl.BaseServiceImpl;
import com.dossp.crp.xdata.mapper.CreditXdataMapper;
import com.dossp.crp.xdata.model.CreditXdataModel;
import com.dossp.crp.xdata.service.CreditXdataService;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午3:01:47
 *
 * 描述：
 * @version V1.0
 *
 */
@Service
public class CreditXdataServiceImpl extends BaseServiceImpl<CreditXdataModel,Long> implements CreditXdataService{

	@Autowired
	private CreditXdataMapper creditXdataMapper;
	
	/** 
	 * @param vo
	 * @return 
	 */
	@Override
	@DataSource("crp_quant")
	@Cacheable(cacheNames="xdata", key="'xdata.getData'")
	public List<CreditXdataModel> getData() {
		return creditXdataMapper.getData();
	}

}
