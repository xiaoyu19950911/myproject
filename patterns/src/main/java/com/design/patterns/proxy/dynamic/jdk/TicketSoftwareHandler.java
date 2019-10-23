package com.design.patterns.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: myproject
 * @description: 自定义handler
 * @author: xyu
 * @create: 2019-08-05 15:18
 */
public class TicketSoftwareHandler implements InvocationHandler {

    private Object target;

    public TicketSoftwareHandler(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始了！");
        Object o = method.invoke(target,args);
        System.out.println("代理结束了！");
        return o;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
