package com.design.tradition.order;

import com.design.tradition.make.CheckPizza;
import com.design.tradition.make.GreekPizza;
import com.design.tradition.make.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 披萨订购
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getOrderType();
            if (orderType.equals("GreekPizza")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("CheckPizza")) {
                pizza = new CheckPizza();
            } else {
                break;
            }
            pizza.setName(orderType);
            //输出制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
