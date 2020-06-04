package com.design.classadapter;

public class Phone {

    public void charge(Voltage5V voltage5V) {
        if (5 == voltage5V.outPut5V()) {
            System.out.println("电压为 5 V");
        } else {
            System.out.println("电压不是 5 V");
        }
    }
}
