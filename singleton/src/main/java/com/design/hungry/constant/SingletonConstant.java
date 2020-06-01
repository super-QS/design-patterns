package com.design.hungry.constant;

/**
 * 饿汉式-静态常量
 */
public class SingletonConstant {
    public static void main(String[] args) {

    }
}

class Singleton {
    // 1、私有化构造器
    private Singleton() {
    }
    //2、创建一个对象实例
    private final static Singleton instance = new Singleton();

    // 3、对外提供一个静态方法，返回实例对象
    public static  Singleton getInstance(){
        return instance;
    }
}