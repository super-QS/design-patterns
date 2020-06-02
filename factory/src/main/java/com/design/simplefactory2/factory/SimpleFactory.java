package com.design.simplefactory2.factory;

import com.design.simplefactory2.make.CheckPizza;
import com.design.simplefactory2.make.GreekPizza;
import com.design.simplefactory2.make.Pizza;

/**
 * 简单工厂类
 * 简单工厂  也叫静态工厂
 */
public class SimpleFactory {

//    public Pizza createPizza(String orderType) {
//        Pizza pizza = null;
//        System.out.println("简单工厂模式");
//        if (orderType.equals("GreekPizza")) {
//            pizza.setName(orderType);
//            pizza = new GreekPizza();
//        } else if (orderType.equals("CheckPizza")) {
//            pizza.setName(orderType);
//            pizza = new CheckPizza();
//        }
//
//        return pizza;
//    }

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("静态工厂模式");
        if (orderType.equals("GreekPizza")) {
            pizza = new GreekPizza();
            pizza.setName(orderType);
        } else if (orderType.equals("CheckPizza")) {
            pizza = new CheckPizza();
            pizza.setName(orderType);
        }

        return pizza;
    }
}
