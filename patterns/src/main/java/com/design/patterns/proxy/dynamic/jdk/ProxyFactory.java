package com.design.patterns.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @program: myproject
 * @description: 代理工厂
 * @author: xyu
 * @create: 2019-08-05 15:12
 */
public class ProxyFactory {

    private TicketSoftwareHandler handler;

    public ProxyFactory(TicketSoftwareHandler handler){
        this.handler=handler;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(handler.getTarget().getClass().getClassLoader(),handler.getTarget().getClass().getInterfaces(),handler);
    }
}
