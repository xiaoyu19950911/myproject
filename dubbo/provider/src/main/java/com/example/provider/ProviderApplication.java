package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDubbo
public class ProviderApplication {

    private static ApplicationContext context;

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(ProviderApplication.class);
        Map<String,Object> map = new HashMap<>();
        map.put("test","test");
        application.setDefaultProperties(map);
        context = application.run(args);
        //context = SpringApplication.run(ProviderApplication.class, args);
    }

}
