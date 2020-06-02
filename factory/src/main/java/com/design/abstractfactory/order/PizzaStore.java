package com.design.abstractfactory.order;

import com.design.abstractfactory.factpry.LDFactory;

public class  PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setAbsFactory(new LDFactory());
    }
}
