package com.ggr3ml1n.practice;

/*
  Square - квадрат с одним свойством: длина стороны
 */
public class Square implements Shape {

    private double length;

    public Square(double length){
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0) throw new IllegalArgumentException();
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
