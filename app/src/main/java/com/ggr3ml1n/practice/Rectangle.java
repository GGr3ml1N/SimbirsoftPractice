package com.ggr3ml1n.practice;

/*
  Rectangle - прямоугольник с двумя свойствами: ширина и длина
 */
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double a, double b) {
        setLength(a);
        setWidth(b);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0) throw new IllegalArgumentException();
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0) throw new IllegalArgumentException();
        this.width = width;
    }


    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}
