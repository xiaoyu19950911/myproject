package com.xyu.sync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncTest {

    @Async  //标注使用
    public void asyncMethodWithVoidReturnType() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            //
        }
        System.out.println("异步线程名:" + Thread.currentThread().getName());
    }

    @Async
    public Future<String> asyncMethodWithReturnType() {
        System.out.println("Execute method asynchronously - "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            return new AsyncResult<String>("hello world !!!!");
        } catch (InterruptedException e) {
            //
        }

        return null;
    }

    public static void main(String[] args) {
        int n = 15;
        int hash = 48690;
        System.out.println((n - 1) & hash);
    }
}
