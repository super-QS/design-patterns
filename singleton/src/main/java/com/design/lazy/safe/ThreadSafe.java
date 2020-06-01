package com.design.lazy.safe;

/**
 * 懒汉式-线程安全
 */
public class ThreadSafe {
}

class Singleton {

    private static Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }

    // 2、对外提供一个静态方法，加入同步处理代码，解决线程安全问题， 返回实例对象
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}