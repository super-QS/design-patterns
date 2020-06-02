package com.design.abstractfactory.make;

public class BJCheckPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.printf("北京奶酪披萨制作");
    }
}
