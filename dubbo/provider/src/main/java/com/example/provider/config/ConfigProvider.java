package com.example.provider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.monitor.dubbo.DubboMonitor;
import com.angel.prospective.dubbo.service.IHelloWorld;
import com.example.provider.impl.HelloWorldProvider;

import java.util.HashMap;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-07-17 15:52
 */
public class ConfigProvider {

    public static void main(String[] args) throws InterruptedException {
        try {
            IHelloWorld helloWorld = new HelloWorldProvider();
            ApplicationConfig application = new ApplicationConfig();
            application.setName("hello-world");

            RegistryConfig registry = new RegistryConfig();
            //registry.setAddress("zookeeper://10.200.4.74:2181");
            registry.setAddress("zookeeper://10.200.4.181:2181");
            ProtocolConfig protocol = new ProtocolConfig();
            protocol.setName("dubbo");
            protocol.setPort(8881);
            protocol.setThreads(200);

            ServiceConfig<IHelloWorld> service = new ServiceConfig<IHelloWorld>();
            service.setApplication(application);
            service.setRegistry(registry);
            service.setProtocol(protocol);
            service.setInterface(IHelloWorld.class);
            service.setRef(helloWorld);
            service.export();
            System.out.println("服务暴露！");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            Thread.sleep(100000000L);
        }

    }
}
