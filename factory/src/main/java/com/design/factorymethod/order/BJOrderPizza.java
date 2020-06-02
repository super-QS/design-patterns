package com.design.factorymethod.order;

import com.design.factorymethod.make.*;

public class BJOrderPizza extends OrderPizza {

    private Pizza pizza;

    @Override
    public Pizza createPizza(String orderType) {
        if ("CheckPizza".equals(orderType)) {
            pizza = new BJCheckPizza();
        } else if ("PepperPizza".equals(orderType)) {
            pizza = new BJPeeperPizza();
        }
        return pizza;
    }
}
