/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureController.java 
 *
 * @Date:  2018年4月16日  下午3:32:00
 *
 * @Package com.dossp.crp.credit.exposure.controller
 */


package com.dossp.crp.credit.exposure.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dossp.common.model.JsonMsg;
import com.dossp.crp.credit.exposure.service.CreditExposureService;
import com.dossp.crp.credit.exposure.vo.CreditExposureVo;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:32:00
 * </p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/api/credit/exposure")
public class CreditExposureController {
	
	private static final Logger log = LoggerFactory.getLogger(CreditExposureController.class);
	
	@Autowired
	private CreditExposureService creditExposureService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "index")
	public String index() {
		
		return "credit/exposure";
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "data")
	@ResponseBody
	public JsonMsg data() {
		JsonMsg msg = new JsonMsg();
		
		try {
			CreditExposureVo vo = creditExposureService.getData();
			
			msg.setSuccess(true);
			msg.setObj(vo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询数据出错", e);
		}
		
		return msg;
	}


}
