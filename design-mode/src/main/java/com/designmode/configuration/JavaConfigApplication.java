package com.designmode.configuration;

import com.designmode.configuration.config.MyConfig;
import com.designmode.configuration.mode.DogConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@TestComponent
public class JavaConfigApplication {

    @Test
    public void test(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        DogConfig dog = (DogConfig) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}
