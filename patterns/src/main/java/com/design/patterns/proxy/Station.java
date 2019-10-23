package com.design.patterns.proxy;

/**
 * @program: myproject
 * @description: 火车站
 * @author: xyu
 * @create: 2019-08-05 15:02
 */
public class Station implements Trading{

    @Override
    public void sellTicket() {
        System.out.println("火车站出票成功！");
    }
}
