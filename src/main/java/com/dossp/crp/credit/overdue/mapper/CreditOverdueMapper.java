/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueMapper.java 
 *
 * @Date:  2018年4月18日  上午10:36:58
 *
 * @Package com.dossp.crp.credit.overdue.mapper
 */


package com.dossp.crp.credit.overdue.mapper;

import java.util.List;

import com.dossp.crp.credit.overdue.model.CreditOverdueModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月18日 上午10:36:58
 * </p>
 * 描述：
 *
 */

public interface CreditOverdueMapper {

	
	CreditOverdueModel getGroupData();
	
	List<CreditOverdueModel> getCorpData();
	
}
