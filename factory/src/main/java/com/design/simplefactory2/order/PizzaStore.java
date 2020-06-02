package com.design.simplefactory2.order;

import com.design.simplefactory2.factory.SimpleFactory;

/**
 * 相当于客户端-发起 Pizza 订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
    }
}
