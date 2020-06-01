package com.design;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/*
    完成Person 接收消息的功能
 */
class Email {
    public String getInfo() {
        return "电子邮件信息：你好，世界";
    }
}

/**
 * 分析1
 * 1、简单
 * 2、如果获取的的对象是 微信，短信等，则需要新增类，且 Person 增加相应的接收方法
 * 3、思路：引入抽象接口IReceive ,表示接受者，这样这个 Person 类与 接口发生依赖
 *  好处：因为  email ,微信 等等都属于接收的范围，他们各自实现接口，实现依赖倒置原则
 */
class Person {
    public void receive(Email email) {
        System.out.println("email.getInfo() = " + email.getInfo());
    }
}