package com.design.lazy.unsafe;

/**
 * 懒汉式-线程不安全
 */
public class ThreadUnsafe {

}

class Singleton {

    private static Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }
    // 2、对外提供一个静态方法，返回实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}