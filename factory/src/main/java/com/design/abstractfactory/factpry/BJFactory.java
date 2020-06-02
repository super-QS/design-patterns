package com.design.abstractfactory.factpry;

import com.design.abstractfactory.make.BJCheckPizza;
import com.design.abstractfactory.make.BJPeeperPizza;
import com.design.abstractfactory.make.Pizza;

public class BJFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("CheckPizza".equals(orderType)) {
            pizza = new BJCheckPizza();
        } else if ("PepperPizza".equals(orderType)) {
            pizza = new BJPeeperPizza();
        }
        return pizza;
    }
}
