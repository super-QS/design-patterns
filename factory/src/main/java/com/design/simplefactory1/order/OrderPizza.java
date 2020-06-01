package com.design.simplefactory1.order;

import com.design.simplefactory1.factory.SimpleFactory;
import com.design.simplefactory1.make.CheckPizza;
import com.design.simplefactory1.make.GreekPizza;
import com.design.simplefactory1.make.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * 披萨订购
 */
public class OrderPizza {


    //定义个简单工厂对象
    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getOrderType();
            pizza = this.simpleFactory.createPizza(orderType);
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

    //获取用户订购的披萨种类
    private String getOrderType() {
        try {
            InputStream in;
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
