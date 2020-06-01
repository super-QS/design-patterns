package com.design.lazy.block;

/**
 * 懒汉式-线程安全-同步代码块
 * 此种方法有人写，但是也不能解决线程安全问题
 */
public class CodeBlock {
}

class Singleton {

    private static Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }

    // 2、对外提供一个静态方法，加入同步处理代码，解决线程安全问题， 返回实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}