package com.example.lock.thread;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-26 16:38
 */
public class Producer implements Runnable {


    @Override
    public void run() {
        while (true){
            if (Test.count<=10){
                Test.count++;
                System.out.println("生产者生产商品，商品数量："+Test.count);
            }else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.notifyAll();
        }
    }
}
