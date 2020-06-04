package com.design.objectadapter;

/**
 * 适配器类
 */
public class VoltageAdapter  implements Voltage5V {

    private Voltage220V voltage220V;

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        int srcV = voltage220V.outPut220V();
        int dstV = srcV / 44;
        System.out.println("输出 5V 电压");
        return dstV;
    }
}
