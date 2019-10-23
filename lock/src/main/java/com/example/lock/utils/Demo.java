package com.example.lock.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: myproject
 * @description: 读写锁
 * @author: xyu
 * @create: 2019-07-01 15:17
 */
public class Demo {

    public static void main(String[] args) {
        HashObject object = new HashObject();
        HashObject object2 = new HashObject();
        new Thread(() -> {
            try {
                object.test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                object.test2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                object2.test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                object2.test2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private Object object;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void get() throws InterruptedException {
        lock.readLock().lock();//上读锁
        try {
            System.out.println(lock.writeLock().tryLock());
            System.out.println(Thread.currentThread().getName() + "准备读取数据");
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(Thread.currentThread().getName() + "读数据为：" + this.object);
        }finally {
            lock.readLock().unlock();
        }
    }

    public void put(Object object) throws InterruptedException {
        lock.writeLock().lock();//上写锁
        try {
            System.out.println(Thread.currentThread().getName() + "准备写数据");
            Thread.sleep(new Random().nextInt(1000));
            this.object = object;
            System.out.println(Thread.currentThread().getName() + "写数据为" + this.object);
        }finally {
            lock.writeLock().unlock();
        }
    }

}
