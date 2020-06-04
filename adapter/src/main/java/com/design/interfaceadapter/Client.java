package com.design.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("覆盖 operation1() 方法");
            }

            @Override
            public void operation2() {
                System.out.println("覆盖 operation2() 方法");
            }
        };
        absAdapter.operation1();
        absAdapter.operation2();
    }
}
