package com.example.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoyu.common.entity.User;
import com.xiaoyu.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-05-09 16:21
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }

    @GetMapping("/test")
    public Response<String> test(){
        return new Response.Builder<>().payload("hello world").build();
    }
}

