package com.xyu.sync;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.xyu.config");
        AsyncTest asyncTest = applicationContext.getBean(AsyncTest.class);
        Test test1 = new Test();
        test1.async(asyncTest);
        System.out.println("主线程名：" + Thread.currentThread().getName());
        HashMap<String,Object> map = new HashMap<String, Object>();

    }

    private void async( AsyncTest asyncTest) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            asyncTest.asyncMethodWithVoidReturnType();
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
