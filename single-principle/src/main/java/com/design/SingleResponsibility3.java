package com.design;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.roadRun("汽车");
        vehicle3.airRun("飞机");
        vehicle3.waterRun("轮船");
    }
}

class Vehicle3 {
    public void roadRun(String vehicle) {
        System.out.println(vehicle + "在路上跑");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + "在天上跑");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + "在水上跑");
    }
}
