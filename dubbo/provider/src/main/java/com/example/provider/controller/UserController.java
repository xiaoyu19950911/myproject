package com.example.provider.controller;

import com.xiaoyu.common.entity.User;
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

    public UserController() {
        System.out.println(1111);
    }

    @GetMapping("/getUser")
    public User getUser(){
        return new User();
    }

    public static void main(String[] args) {
        if (!(Boolean) null){
            System.out.println(111);
        }
    }
}
