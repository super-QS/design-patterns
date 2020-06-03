package com.design.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseBuilder(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println("house = " + house);
    }
}
