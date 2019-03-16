package com.latewind.boot.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String index(@RequestParam String name) {
        return "get user " + name + "，this is first messge";
    }
}
