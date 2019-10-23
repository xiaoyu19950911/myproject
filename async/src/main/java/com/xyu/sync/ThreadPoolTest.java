package com.xyu.sync;

import java.util.Stack;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-02 09:51
 */
public class ThreadPoolTest {

    private static volatile AtomicInteger s = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> future =service.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return s.incrementAndGet();
            }
        });
        try {
            Integer test = future.get();
            System.out.println(test);
            System.out.println(s);
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
