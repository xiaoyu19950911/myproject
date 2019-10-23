package com.example.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoyu.common.entity.User;
import com.xiaoyu.common.service.IHelloWorld;
import com.xiaoyu.common.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-05-07 17:29
 */
@Component
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser() {
        return new User();
    }
}
