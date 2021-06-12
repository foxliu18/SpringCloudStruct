package com.designmode.IOC;

import com.designmode.IOC.Dao.UserDaoMyImpl;
import com.designmode.IOC.Dao.UserDaoOracleImpl;
import com.designmode.IOC.mode.Hello;
import com.designmode.IOC.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
