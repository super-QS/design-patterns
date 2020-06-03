package com.design.improve;

/**
 * 抽象建造者
 */
public abstract class HouseBuilder {

    private House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    public House getHouse() {
        return house;
    }

    public House builderHouse() {
        house.setBasic("打地基");
        house.setWall("砌墙");
        house.setRoofed("封顶");
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
