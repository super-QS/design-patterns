package com.design.tradition.order;

/**
 * 相当于客户端-发起 Pizza 订购
 *  1> 优点是比较好理解，简单易操作
 *  2> 缺点是违反设计模式的原则：即 对扩展开发，对修改关闭
 *      当我们给雷增加新功能的时候，尽量不要修改原来的代码
 *
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
    }
}
