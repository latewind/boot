package com.latewind.boot.module.system.controller;

import org.apache.tomcat.jni.Global;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.latewind.boot.config.GlobalValue;
import com.latewind.boot.config.SpringContextX;
import com.latewind.boot.module.user.dao.UserDao;
import com.latewind.boot.module.user.service.UserService;

@RestController
public class HelloController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;
    @RequestMapping("/hello")
    public String index() {
    	logger.info("{}",userService == null);
    	logger.info("{},{}",SpringContextX.getBean(GlobalValue.class).getProductName(),userService.getCount());
        return "Hello World";
    }
}
