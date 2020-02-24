package com.example.lock;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-30 11:31
 */
public class ThreadLocalTest {

    private ThreadLocal<Long> local = new ThreadLocal<>();

    public static void main(String[] args) {
        new ThreadLocalTest().test();
    }

    private void test() {
        local.set(new Date().getTime());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long time = new Date().getTime() - local.get();
        System.out.println(time);
    }
}
