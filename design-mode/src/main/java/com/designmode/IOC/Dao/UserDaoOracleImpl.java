package com.designmode.IOC.Dao;

public class UserDaoOracleImpl implements UserDao{

    @Override
    public void getUser(){
        System.out.println("Oracle get User Data");
    }
}
