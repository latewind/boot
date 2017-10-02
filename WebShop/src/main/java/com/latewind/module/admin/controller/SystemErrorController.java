package com.latewind.module.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class SystemErrorController {

	
	@RequestMapping("/system/error/not.html")
	public String notHaveFunction(){
		//
		
		return "admin/error/not";
	}
}
