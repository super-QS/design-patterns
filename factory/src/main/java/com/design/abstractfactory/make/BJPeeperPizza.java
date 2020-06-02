package com.design.abstractfactory.make;

public class BJPeeperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨制作");
    }
}
