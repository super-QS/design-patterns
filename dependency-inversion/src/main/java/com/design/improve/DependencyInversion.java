package com.design.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：你好，世界";
    }
}

class Weixin implements  IReceiver{
    @Override
    public String getInfo() {
        return "微信消息：你好 JAVA";
    }
}

class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println("email.getInfo() = " + iReceiver.getInfo());
    }
}