package com.zookeeper.config.watcher;

import com.zookeeper.config.factory.ZkClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.CuratorWatcher;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;

import java.io.IOException;

/**
 * Created by troy on 2016/8/29.
 * kouhongyu@163.com
 */
@Slf4j
public class ZooKeeperCuratorWatcher implements CuratorWatcher {

    //private static Logger log = Logger.getLogger(ZooKeeperCuratorWatcher.class);


    public void process(WatchedEvent watchedEvent) throws Exception {
        /**
         * 有较的path 和 监听开关为打开状态
         */
        log.info("触发watcher，节点为:{},类型为：{}",watchedEvent.getPath(),watchedEvent.getType());
        if (watchedEvent.getPath() != null) {
            ZkClient zkClient = ZkClient.getInstance();
            byte[] data = zkClient.getNodeData(watchedEvent.getPath());
            zkClient.watchNode(watchedEvent.getPath());

            //System.out.println("path  = " + watchedEvent.getPath());
            //System.out.println("bytes = " + new String(data));

            log.info("path  = " + watchedEvent.getPath());
            //log.info("bytes = " + new String(data));
            //ZooKeeperConfigProperties.putProperties(watchedEvent.getPath(), data);
            //ZooKeeperConfigProperties.resetBeanField(watchedEvent.getPath(), data);

        }

    }
}
