package com.designmode.proxy.mode;

import com.designmode.configuration.config.MyConfig;

public class Client {
    public static void main(String[] args) {
//        //真实业务
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.query();
//        //代理类
//        UserServiceProxy proxy = new UserServiceProxy();
//
//        //使用代理类实现日志功能！
//        proxy.setUserService(userService);
//
//        proxy.add();
//        proxy.delete();

        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host); //将真实角色放置进去！
        Rent proxyR = (Rent)pih.getProxy(); //动态生成对应的代理类！
        //一个动态代理 , 一般代理某一类业务 , 一个动态代理可以代理多个类，代理的是接口！
        proxyR.rent();

    }
}
