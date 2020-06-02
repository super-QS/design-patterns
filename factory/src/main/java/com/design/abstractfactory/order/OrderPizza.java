package com.design.abstractfactory.order;

import com.design.abstractfactory.factpry.AbsFactory;
import com.design.abstractfactory.make.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class OrderPizza {

    private AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        //定义个简单工厂对象
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = absFactory.createPizza(orderType);
            Optional<Pizza> pizzas = Optional.ofNullable(pizza);
            if (pizzas.isPresent()) {
                Pizza pa = pizzas.get();
                pa.prepare();
                pa.bake();
                pa.cut();
                pa.box();
            } else {
                System.out.println("没有这种披萨");
                break;
            }

        } while (true);
    }


    //获取用户订购的披萨种类
    private String getOrderType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入类型:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
