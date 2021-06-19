package com.designmode.proxy;

import com.designmode.proxy.mode.UserService;
import com.designmode.proxy.mode.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class ProxyApplication {

    @Test
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象的调用处理程序
        DynamicProxyInvocationHandler pih = new DynamicProxyInvocationHandler();
        pih.setTarget(userService); //设置要代理的对象
        UserService proxy = (UserService)pih.getProxy(); //动态生成代理类！
        System.out.println("--------------------------------");
        proxy.add();
        proxy.delete();
    }
}
