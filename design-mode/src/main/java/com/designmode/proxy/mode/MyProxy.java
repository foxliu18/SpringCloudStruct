package com.designmode.proxy.mode;

public class MyProxy implements Rent{
    private Host host;
    public MyProxy() { }
    public MyProxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
