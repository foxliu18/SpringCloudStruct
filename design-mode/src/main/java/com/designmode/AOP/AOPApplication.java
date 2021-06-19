package com.designmode.AOP;

import com.designmode.AOP.mode.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestComponent
public class AOPApplication {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/aop/AnnotationAopBeans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }

}
