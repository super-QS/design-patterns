package com.design.improve;


public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep cloneSheep =(Sheep) sheep.clone();
        System.out.println("sheep = " + sheep);
        System.out.println("cloneSheep = " + cloneSheep);
    }
}
