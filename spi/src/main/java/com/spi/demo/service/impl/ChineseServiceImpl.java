package com.spi.demo.service.impl;

import com.spi.demo.service.DemoService;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-12 16:45
 */
public class ChineseServiceImpl implements DemoService {
    public String say(String msg) {
        return "你好"+msg;
    }
}
