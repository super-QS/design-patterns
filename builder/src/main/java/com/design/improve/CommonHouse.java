package com.design.improve;

/**
 * 具体建造者
 */
public class CommonHouse  extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("CommonHouse buildBasic 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse buildWalls 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse roofed 封顶");
    }
}
