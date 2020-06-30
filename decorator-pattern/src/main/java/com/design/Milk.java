package com.design;

/**
 * 具体调味品  牛奶
 */
public class Milk extends Decorator {


    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
