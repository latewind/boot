package com.latewind.boot.cloud.`interface`

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name= "spring-cloud-provider")
interface UserRemote {
    @RequestMapping(value = "/getUser")
    fun hello(@RequestParam(value = "name") name: String): String

}