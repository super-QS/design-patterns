package com.design;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

/**
 * 1、遵守单一原则
 * 2、花销大，改动大
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上跑");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上跑");
    }
}