package com.designmode.IOC;

import com.designmode.IOC.Dao.UserDaoMyImpl;
import com.designmode.IOC.Dao.UserDaoOracleImpl;
import com.designmode.IOC.mode.Hello;
import com.designmode.IOC.mode.User;
import com.designmode.IOC.mode.UserT;
import com.designmode.IOC.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestComponent
public class IOCApplication {

    @Test
    public void test(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test1(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoMyImpl());
        service.getUser();

        service.setUserDao(new UserDaoOracleImpl());
        service.getUser();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----------------------------------------");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----------------------------------------");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----------------------------------------");
        UserT userT = (UserT) context.getBean("userT3");
        userT.show();
    }
}
