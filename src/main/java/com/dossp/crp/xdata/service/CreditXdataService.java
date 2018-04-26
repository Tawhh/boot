/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: CreditXdataService.java 
 *
 * @Date:  2018年4月19日  下午3:01:25
 *
 * @Package com.dossp.crp.xdata.service
 */


package com.dossp.crp.xdata.service;

import java.util.List;

import com.dossp.common.service.BaseService;
import com.dossp.crp.xdata.model.CreditXdataModel;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午3:01:25
 *
 * 描述：
 * @version V1.0
 *
 */

public interface CreditXdataService extends BaseService<CreditXdataModel,Long> {
	
	List<CreditXdataModel> getData();
	
}
