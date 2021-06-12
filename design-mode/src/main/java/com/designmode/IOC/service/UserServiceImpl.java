package com.designmode.IOC.service;

import com.designmode.IOC.Dao.UserDao;
import com.designmode.IOC.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser(){
        userDao.getUser();
    }
}
