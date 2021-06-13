package com.designmode.annotate.mode;

import com.designmode.autowiring.mode.Cat;
import com.designmode.autowiring.mode.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class User {
    @Qualifier(value = "cat2")
    private Cat cat;
    //@Autowired先byType，@Resource先byName
    @Autowired
    private Dog dog;

    public void setStr(String str) {
        this.str = str;
    }

    private String str;

    public Cat getCat() {
        return cat;
    }
    public Dog getDog() {
        return dog;
    }
    public String getStr() {
        return str;
    }
}
