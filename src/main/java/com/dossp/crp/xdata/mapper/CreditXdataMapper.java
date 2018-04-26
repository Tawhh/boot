/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: CreditXdataMapper.java 
 *
 * @Date:  2018年4月19日  下午3:00:09
 *
 * @Package com.dossp.crp.xdata.mapper
 */


package com.dossp.crp.xdata.mapper;

import java.util.List;

import com.dossp.common.mybatis.MyBaseMapper;
import com.dossp.crp.xdata.model.CreditXdataModel;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午3:00:09
 *
 * 描述：
 * @version V1.0
 *
 */

public interface CreditXdataMapper extends MyBaseMapper<CreditXdataModel>{
	
	List<CreditXdataModel> getData();
	
}
