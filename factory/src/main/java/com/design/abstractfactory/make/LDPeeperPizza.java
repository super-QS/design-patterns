package com.design.abstractfactory.make;

public class LDPeeperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨制作");
    }
}
