package com.latewind.module.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemIndexController {

	@RequestMapping("/admin/index")
	public String systemIndex(){
		
		
		return "admin/index/index";
	}
	
	
}
