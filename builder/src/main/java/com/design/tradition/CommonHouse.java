package com.design.tradition;

public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("buildBasic 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("buildWalls 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("roofed 封顶");
    }
}
