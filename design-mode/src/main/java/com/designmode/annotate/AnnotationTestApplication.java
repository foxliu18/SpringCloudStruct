package com.designmode.annotate;

import com.designmode.annotate.mode.User;
import com.designmode.annotate.mode.UserAnnotate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestComponent
public class AnnotationTestApplication {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----------------------------------------");
        User user = (User)context.getBean("user");
        System.out.println(user.getStr());

        UserAnnotate userA = (UserAnnotate) context.getBean("Annotate");
        System.out.println(userA.getName());

    }
}
