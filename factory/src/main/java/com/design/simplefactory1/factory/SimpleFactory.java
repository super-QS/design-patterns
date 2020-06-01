package com.design.simplefactory1.factory;

import com.design.simplefactory1.make.CheckPizza;
import com.design.simplefactory1.make.GreekPizza;
import com.design.simplefactory1.make.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if (orderType.equals("GreekPizza")) {
            pizza.setName(orderType);
            pizza = new GreekPizza();
        } else if (orderType.equals("CheckPizza")) {
            pizza.setName(orderType);
            pizza = new CheckPizza();
        }

        return pizza;
    }
}
