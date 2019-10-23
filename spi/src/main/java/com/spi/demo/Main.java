package com.spi.demo;

import com.spi.demo.service.DemoService;

import java.util.ServiceLoader;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-12 16:43
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        for (DemoService demoService : serviceLoader){
            System.out.println(demoService.say("world"));
        }
    }
}
