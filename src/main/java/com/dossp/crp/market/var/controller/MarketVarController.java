/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: QuantLoopbackController.java 
 *
 * @Date:  2018年4月12日  下午2:13:17
 *
 * @Package com.dossp.crp.web.quant.var.loopback
 */


package com.dossp.crp.market.var.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dossp.common.model.JsonMsg;
import com.dossp.crp.market.var.service.MarketVarService;

/**
 * @author wulei
 * 
 * 日期：2018年4月20日 上午10:06:47
 *
 * 描述：var趋势图
 * @version V1.0
 *
 */

@Controller
@RequestMapping(value = "/api/market/var")
public class MarketVarController {
	
	private static final Logger log = LoggerFactory.getLogger(MarketVarController.class);
	
	@Autowired
	private	MarketVarService  marketVarService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "index")
	public String index(HttpServletRequest request) {
		
		return "quant/var";
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
			Map<Object, Object> vo =  marketVarService.getData();
			msg.setSuccess(true);
			msg.setObj(null);
			msg.setObj(vo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询数据出错", e);
		}
		
		return msg;
	}
   
}
