package com.design.mode;

public class Client {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone();
        phone.setBrand(new XiaoMi());
        phone.call();
    }
}
