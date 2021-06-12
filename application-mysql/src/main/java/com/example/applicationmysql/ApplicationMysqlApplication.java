package com.example.applicationmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMysqlApplication.class, args);
    }

}
