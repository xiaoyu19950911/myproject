package com.design.patterns.singleton.lazy;

import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

import java.util.List;

/**
 * @program: myproject
 * @description: 双重锁校验
 * @author: xyu
 * @create: 2019-08-07 11:29
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){

    }

    public DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

RedisAutoConfiguration


}
