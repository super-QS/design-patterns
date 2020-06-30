package com.design.mode;

public abstract class Phone {

    private Brand brand;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        this.brand.call();
    }
}
