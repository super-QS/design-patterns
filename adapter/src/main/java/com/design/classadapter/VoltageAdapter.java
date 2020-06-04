package com.design.classadapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int outPut5V() {
        int srcV = outPut220V();
        int dstV = srcV / 44;
        System.out.println("输出 5V 电压");
        return dstV;
    }
}
