package com.design.patterns.singleton.lazy;

/**
 * @program: myproject
 * @description: 静态内部类
 * @author: xyu
 * @create: 2019-08-07 11:35
 */
public class StaticClassSingleton {

    private StaticClassSingleton() {

    }

    public StaticClassSingleton getInstance() {
        return Handler.instance;
    }


    private static class Handler {
        private static final StaticClassSingleton instance = new StaticClassSingleton();
    }
}
