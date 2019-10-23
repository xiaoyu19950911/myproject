package com.example.provider.config;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.alibaba.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import com.angel.prospective.dubbo.service.IHelloWorld;
import com.example.provider.impl.HelloWorldProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-07-17 15:53
 */
public class ConfigConsumer {

    private final static Logger logger =LoggerFactory.getLogger(ConfigConsumer.class);

    public static void main(String[] args) throws Exception {
        try {
            ApplicationConfig application = new ApplicationConfig();
            application.setName("hello-world");

            RegistryConfig registry = new RegistryConfig();
            registry.setAddress("zookeeper://10.200.4.181:2181");

            ReferenceConfig<IHelloWorld> reference = new ReferenceConfig<IHelloWorld>();
            reference.setApplication(application);
            reference.setRegistry(registry);
            reference.setInterface(IHelloWorld.class);

            IHelloWorld world = reference.get();
            System.out.println("调用成功：" + world.hello("test"));
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            Thread.sleep(100000000L);
        }
    }
}
