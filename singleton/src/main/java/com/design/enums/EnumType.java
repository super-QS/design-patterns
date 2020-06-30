package com.design.enums;

/**
 * 单例模式-枚举
 */
public class EnumType {

    public static void main(String[] args) {
        Singleton.INSTANCE.method();
    }
}

enum Singleton {
    INSTANCE;

    public void method() {
        System.out.printf("ok");
    }
}