package com.design.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

// 画图类
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }


}

abstract class Shape {
    int m_type;

    abstract void draw();
}

//矩形
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}