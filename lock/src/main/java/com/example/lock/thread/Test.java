package com.example.lock.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-26 16:39
 */
public class Test {

    public volatile static int count;

    private final static ReentrantLock lock = new ReentrantLock();

    private final static Condition condition = lock.newCondition();


    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    lock.lock();
                        if (count<10){
                            count++;
                            condition.signal();
                            System.out.println("生产："+count);
                        }else {
                            try {
                                condition.await();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    if (count > 0) {
                        count--;
                        condition.signal();
                        System.out.println("消费：" + count);
                    } else {
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }

            }

        }).start();
        Thread.sleep(3000);
        System.out.println(count);
    }
}
