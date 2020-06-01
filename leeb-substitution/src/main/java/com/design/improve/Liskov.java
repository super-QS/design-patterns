package com.design.improve;

public class Liskov {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.func1(11,3) = " + a.func1(11, 3));
        System.out.println("a.func1(1,8) = " + a.func1(1, 8));


        System.out.println("---------------");


        B b = new B();
        //因为 B 类不在继承 A 类，所以不会认为 func1 是求减法，调用就会很明确
        System.out.println("b.func1(11,3) = " + b.func1(11, 3));
        System.out.println("b.func1(1,8) = " + b.func1(1, 8));
        System.out.println("b.func2(11,3) = " + b.func2(11, 3));

        System.out.println("---------------");
        //使用组合仍然可以使用到 A 类相关方法
        System.out.println("b.func3(11,3) = " + b.func3(11, 3));


    }
}

// 创建一个基类
class Base {
    //将基础的成员和方法写在此处

}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {


    //如果 B 需要 A 的方法，使用组合
    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }


    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我们仍然需要 A 的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
