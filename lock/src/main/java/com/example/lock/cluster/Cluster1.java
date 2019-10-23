package com.example.lock.cluster;

/**
 * @program: myproject
 * @description: 模拟集群并发操作 集群1
 * @author: xyu
 * @create: 2019-07-23 10:36
 */
public class Cluster1 {

    public static void main(String[] args) throws InterruptedException {
        while (true){
            if (System.currentTimeMillis() == 1563849465000L){
                //concurrentHandler();
                break;
            }else {
                Thread.sleep(100);
            }
        }
    }
}
