package com.design.patterns.singleton.hungry;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 11:27
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public HungrySingleton getInstance(){
        return instance;
    }
}
