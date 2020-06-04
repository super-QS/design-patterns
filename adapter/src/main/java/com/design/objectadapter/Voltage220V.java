package com.design.objectadapter;

/**
 * 被适配者
 */
public class Voltage220V {
    protected int outPut220V() {
        int src = 220;
        System.out.println("电压为" + src + "V");
        return src;
    }
}
