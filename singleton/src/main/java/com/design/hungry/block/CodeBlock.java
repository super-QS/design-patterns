package com.design.hungry.block;

/**
 * 饿汉式-静态代码块
 */
public class CodeBlock {
}

class Singleton {

    private static Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }
    //2、创建一个对象实例

    static {
        instance = new Singleton();
    }

    // 3、对外提供一个静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}