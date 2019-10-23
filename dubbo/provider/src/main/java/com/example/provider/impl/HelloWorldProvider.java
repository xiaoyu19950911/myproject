package com.example.provider.impl;

import com.angel.prospective.dubbo.service.IHelloWorld;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-07-15 14:44
 */
public class HelloWorldProvider implements IHelloWorld {
    @Override
    public String hello(String p0) throws Exception {
        return "成功："+p0;
    }
}
