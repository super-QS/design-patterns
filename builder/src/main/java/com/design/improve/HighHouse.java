package com.design.improve;

/**
 * 具体建造者
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("HighHouse buildBasic 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighHouse buildWalls 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("HighHouse roofed 封顶");
    }
}
