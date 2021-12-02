package com.example.demo.createPattern.singleton;

/**
 * @author jl.yao
 * @className Singleton
 * @description  单例模式
 * @date 2021/12/1 9:37
 **/

/**
 * 饿汉式（静态变量）
 */
public class Singleton {

    private Singleton(){};

    private final static Singleton SINGLETON = new Singleton();

    public static Singleton getInstance(){
        return SINGLETON;
    }

}

/***
 * 饿汉式（静态代码块）
 */
class Singleton2 {

    private Singleton2(){};

    private static Singleton2 singleton;

    static {
        singleton =new Singleton2();
    }

    public static Singleton2 getInstance(){
        return singleton;
    }

}

/***
 * 懒汉式（线程不安全）
 */
class Singleton3 {

    private Singleton3(){};

    private static Singleton3 singleton;


    public static Singleton3 getInstance(){
        if(singleton == null){
            singleton = new Singleton3();
        }
        return singleton;
    }

}
/***
 * 懒汉式（线程安全-同步代码块）
 */
class Singleton4 {

    private Singleton4(){};

    private static Singleton4 singleton;


    public static synchronized Singleton4 getInstance(){
        if(singleton == null){
            singleton = new Singleton4();
        }
        return singleton;
    }

}

/***
 * 懒汉式（双重校验锁）---此处存在指令重排序问题
 */
class Singleton5 {

    private Singleton5(){};

    private static Singleton5 singleton;


    public static Singleton5 getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(singleton == null){
            synchronized (Singleton5.class){
                //抢到锁之后再次判断是否为null
                if(singleton == null) {
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }

}
/***
 * 懒汉式（双重校验锁）---解决底层指令重排序问题
 */
class Singleton6 {

    private Singleton6(){};

    //volatile 关键字可保障 可见性 有序性
    private static volatile Singleton6 singleton;


    public static Singleton6 getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(singleton == null){
            synchronized (Singleton6.class){
                //抢到锁之后再次判断是否为null
                if(singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }

}

/***
 * 懒汉式（静态内部类方式）
 *  静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
class Singleton7 {

    private Singleton7(){}
    private static class SingletonHolder {
        private static final Singleton7 INSTANCE = new Singleton7();
    }


    public static Singleton7 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}

/**
 * 枚举方式
 */
//public enum Singleton8 {
//    INSTANCE;
//}


