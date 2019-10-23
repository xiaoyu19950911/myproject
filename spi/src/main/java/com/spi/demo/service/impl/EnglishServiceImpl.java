package com.spi.demo.service.impl;

import com.spi.demo.service.DemoService;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-12 16:44
 */
public class EnglishServiceImpl implements DemoService {
    public String say(String msg) {
        return "Hello" + msg;
    }
}
