package com.design.staticinnerclass;

/**
 * 静态内部类,推荐使用
 */
public class StaticInnerClass {
}

class Singleton {

    private static Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }

    //2、静态内部类 属性为 Singleton
    private static class SingletonInstance {
        private final static Singleton INSTANCE = new Singleton();
    }


    // 2、 返回实例对象
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}