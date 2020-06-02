package com.design.factorymethod.order;

import com.design.factorymethod.make.Pizza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public abstract class OrderPizza {
    //定义个简单工厂对象
    private Pizza pizza = null;
    String orderType = "";

    public OrderPizza() {
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            Optional<Pizza> pizza = Optional.ofNullable(this.pizza);
            if (pizza.isPresent()) {
                Pizza pa = pizza.get();
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

    /**
     * 定义抽象方法，让各个子类自己实现
     *
     * @return
     */
    public abstract Pizza createPizza(String orderType);





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
