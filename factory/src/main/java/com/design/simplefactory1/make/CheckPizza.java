package com.design.simplefactory1.make;

public class CheckPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 CheckPizza 材料");
    }
}
