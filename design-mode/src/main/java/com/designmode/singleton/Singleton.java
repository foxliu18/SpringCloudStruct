package com.designmode.singleton;

//饿汉模式
public class Singleton {
    private Singleton(){
        System.out.println("Private Construct function");
    };
    {
        System.out.println("normal block statement 1");
    }
    private static final Singleton INSTANCE = new Singleton();

    static{
        System.out.println("Static code block ");
    }

    {
        System.out.println("normal block statement 2");
    }
    public static Singleton getInstance() {
        System.out.println("static function");
        return INSTANCE;
    }
}
// 懒汉模式 线程不安全
class SingletonNPS {
    private SingletonNPS() {}
    private static SingletonNPS single=null;
    //静态工厂方法
    public static SingletonNPS getInstance() {
        if (single == null) {
            single = new SingletonNPS();
        }
        return single;
    }
}
// 懒汉模式 线程安全
class SingletonPS {
    private SingletonPS() {}
    private static SingletonPS single=null;
    //静态工厂方法
    public static synchronized SingletonPS getInstance() {
        if (single == null) {
            single = new SingletonPS();
        }
        return single;
    }
}


// 懒汉模式 双重检查锁定
class SingletonDCL {
    private SingletonDCL() {}
    private static SingletonDCL single=null;
    //静态工厂方法
    public static synchronized SingletonDCL getInstance() {
        if (single == null){
            synchronized (SingletonDCL.class) {
                if (single == null) {
                    single = new SingletonDCL();
                }
            }
        }
        return single;
    }
}

// 懒汉模式 静态内部类
// 既实现了线程安全，又避免了同步带来的性能影响。
class SingletonSIC {
    private static class LazyHolder {
        private static final SingletonSIC INSTANCE = new SingletonSIC();
    }
    private SingletonSIC (){}
    public static final SingletonSIC getInstance() {
        return LazyHolder.INSTANCE;
    }
}