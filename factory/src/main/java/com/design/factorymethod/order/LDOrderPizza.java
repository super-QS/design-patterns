package com.design.factorymethod.order;

import com.design.factorymethod.make.LDCheckPizza;
import com.design.factorymethod.make.LDPeeperPizza;
import com.design.factorymethod.make.Pizza;

public class LDOrderPizza extends OrderPizza {

    private Pizza pizza;

    @Override
    public Pizza createPizza(String orderType) {
        if ("CheckPizza".equals(orderType)) {
            pizza = new LDCheckPizza();
        } else if ("PepperPizza".equals(orderType)) {
            pizza = new LDPeeperPizza();
        }
        return pizza;
    }
}
