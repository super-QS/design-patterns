package com.design.factorymethod.make;

public class LDCheckPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.printf("伦敦奶酪披萨制作");
    }
}
