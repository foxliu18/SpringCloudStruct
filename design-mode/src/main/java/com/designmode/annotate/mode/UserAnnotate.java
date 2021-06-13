package com.designmode.annotate.mode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Annotate")
/***
 * singleton：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
 * prototype：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收
 */
@Scope("prototype")
public class UserAnnotate {

    public String name;

    public String getName() {
        return name;
    }

    @Value("DJI")
    public void setName(String name) {
        this.name = name;
    }

    public UserAnnotate(){
        System.out.println("UserAnnotate initial");
    }

}
