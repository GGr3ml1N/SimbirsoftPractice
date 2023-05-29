package com.ggr3ml1n.practice;

/*
  Circle - круг с одним свойством: диаметр круга
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        setRadius(radius);
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
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
