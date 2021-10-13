package com.latewind.boot.cloud.controller;

import com.latewind.boot.cloud.facade.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRemote userRemote;

    @RequestMapping("/call/{name}")
    public String index(@PathVariable("name") String name) {
        return userRemote.getUser(name);
    }

}
