package com.design.improve;

/**
 * 指挥者
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.builderHouse();
    }
}
