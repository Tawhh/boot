/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureMapper.java 
 *
 * @Date:  2018年4月16日  下午3:31:15
 *
 * @Package com.dossp.crp.credit.exposure.mapper
 */


package com.dossp.crp.credit.exposure.mapper;

import java.util.List;

import com.dossp.crp.credit.exposure.mode.CreditExposureModel;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:31:15
 * </p>
 * 描述：
 *
 */

public interface CreditExposureMapper {

	/** 
	 * @return 
	 */
	CreditExposureModel getGroupData();

	/** 
	 * @return 
	 */
	List<CreditExposureModel> getCorpData();
	
}
