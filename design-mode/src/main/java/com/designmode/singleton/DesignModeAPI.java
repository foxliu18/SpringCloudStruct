package com.designmode.singleton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignModeAPI {

    @RequestMapping("/start")
    public void autoStart(){
        System.out.println("==================get singleton 1st times");
        Singleton singleton = Singleton.getInstance();
        System.out.println("==================get singleton second times");
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("End");
    }
}
