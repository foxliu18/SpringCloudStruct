package com.designmode.IOC.Dao;

public class UserDaoMyImpl implements UserDao{

    @Override
    public void getUser(){
        System.out.println("MySql get User Data");
    }
}
