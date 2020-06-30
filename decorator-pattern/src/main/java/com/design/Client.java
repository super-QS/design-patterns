package com.design;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 装饰者模式下单   一份巧克力 + 一份牛奶 的 LongBlack

        //1、点一份  LongBlack
        Drink order = new LongBlackCoffee();
        System.out.println("order.getPrice() = " + order.cost());
        System.out.println("order.getDes() = " + order.getDes());
        order = new Milk(order);
        System.out.println("order.getDes() = " + order.getDes());
        System.out.println("order.cost() = " + order.cost());
        order = new Chocolate(order);
        System.out.println("order.getDes() = " + order.getDes());
        System.out.println("order.cost() = " + order.cost());
    }
}
