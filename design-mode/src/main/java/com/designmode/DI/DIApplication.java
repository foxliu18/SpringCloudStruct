package com.designmode.DI;

import com.designmode.DI.mode.Student;
import com.designmode.DI.mode.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestComponent
public class DIApplication {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-----------------------------------------");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());
        //student.show();

        User userP = (User) context.getBean("userP");
        User userC = (User) context.getBean("userC");

        System.out.println(userP);
        System.out.println(userC);

    }
}
