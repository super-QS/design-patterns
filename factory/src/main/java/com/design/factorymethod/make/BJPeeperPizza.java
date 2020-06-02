package com.design.factorymethod.make;

public class BJPeeperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨制作");
    }
}
