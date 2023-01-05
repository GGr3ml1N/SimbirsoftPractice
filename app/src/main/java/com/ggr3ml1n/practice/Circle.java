package com.ggr3ml1n.practice;

/*
  Circle - круг с одним свойством: диаметр круга
 */
public class Circle implements Shape {

    private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0.0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}
