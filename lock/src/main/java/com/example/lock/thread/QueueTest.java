package com.example.lock.thread;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-12-30 10:56
 */
public class QueueTest {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        try {
            queue.put("s");
            queue.put("e");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue);
    }
}
