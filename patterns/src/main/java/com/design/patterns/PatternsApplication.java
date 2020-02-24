package com.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;

@SpringBootApplication
public class PatternsApplication {


    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }

}
