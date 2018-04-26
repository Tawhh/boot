/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueController.java 
 *
 * @Date:  2018年4月17日  下午4:39:35
 *
 * @Package com.dossp.crp.credit.overdue.controller
 */


package com.dossp.crp.credit.overdue.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dossp.common.model.JsonMsg;
import com.dossp.crp.credit.overdue.service.CreditOverdueService;
import com.dossp.crp.credit.overdue.vo.CreditOverdueVo;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月17日 下午4:39:35
 * </p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/api/credit/overdue")
public class CreditOverdueController {
	
	private static final Logger log = LoggerFactory.getLogger(CreditOverdueController.class);
	
	@Autowired
	private CreditOverdueService creditOverdueService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "index")
	public String index() {
		
		return "credit/overdue";
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
			
			CreditOverdueVo vo = creditOverdueService.getData();
			
			msg.setSuccess(true);
			msg.setObj(vo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询数据出错", e);
		}
		
		return msg;
	}

}
