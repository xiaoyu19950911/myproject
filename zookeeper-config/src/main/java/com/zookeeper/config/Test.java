package com.zookeeper.config;

import com.zookeeper.config.factory.ZkClient;
import com.zookeeper.config.watcher.ZooKeeperCuratorWatcher;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-06-21 11:33
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ZkClient zkClient = ZkClient.getInstance();
        zkClient.deleteNode("/sweet-config",true);
        zkClient.createNode(CreateMode.PERSISTENT,"/sweet-config");
        zkClient.watchNode("/sweet-config");
        zkClient.createNode(CreateMode.PERSISTENT,"/sweet-config/test1","test1");
        zkClient.watchNode("/sweet-config/test1");
        Thread.sleep(1000);
        zkClient.createNode(CreateMode.PERSISTENT,"/sweet-config/test2","test2");
        zkClient.watchNode("/sweet-config/test2");

        //zkClient.watchNode("/sweet-config/test");
        zkClient.setNodeData("/sweet-config/test1","test11".getBytes());
        Thread.sleep(1000);
        zkClient.setNodeData("/sweet-config/test1","test12".getBytes());
        Thread.sleep(1000);
        zkClient.createNode(CreateMode.PERSISTENT,"/sweet-config/test1/123","123");
        zkClient.deleteNode("/sweet-config/test2");
        Thread.sleep(1000);
        zkClient.createNode(CreateMode.PERSISTENT,"/sweet-config/test2","test2");
        //System.out.println(new String(data));
        //System.in.read();
    }


}
