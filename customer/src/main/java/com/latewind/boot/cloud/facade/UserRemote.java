package com.latewind.boot.cloud.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-provider")
public interface UserRemote {
    @RequestMapping(value = "/getUser")
    String getUser(@RequestParam(value = "name") String name);

}