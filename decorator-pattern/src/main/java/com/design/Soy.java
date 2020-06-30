package com.design;

/**
 * 具体调味品   豆浆
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.0f);
    }
}
