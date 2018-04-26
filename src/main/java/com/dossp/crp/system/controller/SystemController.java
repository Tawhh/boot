/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: SystemController.java 
 *
 * @Date:  2018年1月9日  下午5:21:49
 *
 * @Package com.dossp.cofco.factory.web
 */


package com.dossp.crp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年1月9日 下午5:21:49
 * </p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/api")
public class SystemController {
	
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(value = "main")
	public String index(Model model) {
		
		
		return "main";
	}
	
}
