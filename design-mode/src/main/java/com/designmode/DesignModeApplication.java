package com.designmode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DesignModeApplication {

    public static void main(String[] args) {

        SpringApplication.run(DesignModeApplication.class, args);

    }

}
