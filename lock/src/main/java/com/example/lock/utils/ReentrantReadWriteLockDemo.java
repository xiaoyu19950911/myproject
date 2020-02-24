package com.example.lock.utils;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-07-01 15:20
 */
public class ReentrantReadWriteLockDemo {
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        final Demo myObject = new Demo();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 3; j++) {
                    try {
                        myObject.get();//多个线程读取操作
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 3; j++) {

                    try {
                        myObject.put(new Random().nextInt(1000));//写操作
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }



        executorService.shutdown();
    }
}
