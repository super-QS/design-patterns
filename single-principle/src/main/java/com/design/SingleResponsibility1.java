package com.design;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("自行车");
        vehicle.run("轮船");
    }
}

//交通工具类

/**
 * 在  run 方法中违反单一职责原则
 */
class Vehicle {
    public void run(String vehocle) {
        System.out.println(vehocle + "在公路上");
    }
}