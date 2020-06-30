package com.design;

/**
 * 装饰者
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {

        return super.getDes() + " " + super.getPrice() + " &&" + drink.getDes() + " " + drink.cost();
    }
}
