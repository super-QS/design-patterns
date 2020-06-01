package com.design.doublecheck;

/**
 * 双重检查
 */
public class DoubleCheck {
}

class Singleton {

    /**
     * 被volatile关键字修饰的变量，如果值发生了变更，其他线程立马可见，避免出现脏读的现象。
     */
    private static volatile Singleton instance;

    // 1、私有化构造器
    private Singleton() {
    }

    // 2、对外提供一个静态方法，加入双重检查，解决线程安全问题和懒加载问题， 返回实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}