package com.design.simplefactory2.make;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("name bake = " + name);
    }

    public void cut() {
        System.out.println("name  cut = " + name);
    }

    public void box() {
        System.out.println("name  box = " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
