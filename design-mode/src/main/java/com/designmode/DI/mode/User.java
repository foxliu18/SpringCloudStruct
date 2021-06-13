package com.designmode.DI.mode;

public class User {
    private String name;
    private int age;

    public User(){
        System.out.println("user无参构造方法");
    }

    public User(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("user参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
