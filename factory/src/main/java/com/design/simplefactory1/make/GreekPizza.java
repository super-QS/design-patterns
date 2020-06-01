package com.design.simplefactory1.make;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 GreekPizza 材料");
    }
}
