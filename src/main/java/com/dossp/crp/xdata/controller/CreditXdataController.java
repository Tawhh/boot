/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: CreditXdataController.java 
 *
 * @Date:  2018年4月19日  下午2:59:39
 *
 * @Package com.dossp.crp.xdata.controller
 */


package com.dossp.crp.xdata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dossp.common.model.JsonMsg;
import com.dossp.crp.xdata.model.CreditXdataModel;
import com.dossp.crp.xdata.service.CreditXdataService;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午2:59:39
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
@RequestMapping(value = "/api/xdata/pct_change")
public class CreditXdataController {

	@Autowired 
	private CreditXdataService creditXdataService;
	
	
	/**
	 * 查询最大数据日期并跳转页面
	 */
	@RequestMapping(value = "index")
	public String to_list(HttpServletRequest request) {
		
		return "xdata/pct_change";
	}
	
	/**
	 * 查询数据
	 */
	@RequestMapping(value = "do_list")
	@ResponseBody
	public JsonMsg do_list(HttpServletRequest request) {
		JsonMsg ret = new JsonMsg();
		try {
			List<CreditXdataModel> list = creditXdataService.getData();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("dataDate", list.get(0).getDataDate());
			map.put("list", list);
			
			ret.setObj(map);
			ret.setSuccess(true);
		} catch (Exception e) {
			ret.setSuccess(false);
			e.printStackTrace();
		}
		
		return ret;
	}
	
}
