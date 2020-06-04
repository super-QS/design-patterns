package com.design.objectadapter;

public class Client {


    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.setVoltage220V(new Voltage220V());
        phone.charge(voltageAdapter);
    }
}
