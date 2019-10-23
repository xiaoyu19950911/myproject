package com.zookeeper.config;

import com.zookeeper.config.factory.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-06-21 17:10
 */
public class Test2 {
    public static void main(String[] args) {
        ZkClient zkClient = ZkClient.getInstance();
        System.out.println(new String(zkClient.getNodeData("/sweet-config/test")));
    }
}
