package com.example.lock.thread;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-26 16:38
 */
public class Consumer implements Runnable {



    @Override
    public void run() {
        while (true){
            if (Test.count>0){
                Test.count--;
                System.out.println("消费者消费商品，商品数量："+Test.count);
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
