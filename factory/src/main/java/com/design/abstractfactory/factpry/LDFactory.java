package com.design.abstractfactory.factpry;

import com.design.abstractfactory.make.*;

public class LDFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("CheckPizza".equals(orderType)) {
            pizza = new LDCheckPizza();
        } else if ("PepperPizza".equals(orderType)) {
            pizza = new LDPeeperPizza();
        }
        return pizza;
    }
}
