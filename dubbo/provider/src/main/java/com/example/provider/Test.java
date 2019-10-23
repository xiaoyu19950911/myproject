package com.example.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.angel.prospective.dubbo.service.IHelloWorld;
import com.example.provider.impl.HelloWorldProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-07-15 14:46
 */
public class Test {

    public static void main(final String[] args) throws InterruptedException {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            IHelloWorld helloWorld = new HelloWorldProvider();

            ApplicationConfig application = new ApplicationConfig();
            application.setName("hello-world");

            RegistryConfig registry = new RegistryConfig();
            registry.setAddress("zookeeper://47.98.108.55:2181");

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
            System.out.println("启动成功！");
        }
        catch (Exception ex) {}
        finally {
            Thread.sleep(100000000L);
        }
    }
}
