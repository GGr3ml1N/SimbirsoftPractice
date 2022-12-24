package com.ggr3ml1n.classes;

/*
      III

      Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
      вычисления площади, периметра и точки пересечения медиан.
      Описать свойства для получения состояния объекта.
     */
public class Task3Class {
    private double a;
    private double b;
    private double c;
    private Coordinate a1;
    private Coordinate b1;
    private Coordinate c1;

    public Task3Class(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public Task3Class(Coordinate a, Coordinate b, Coordinate c) {
        a1 = a;
        b1 = b;
        c1 = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            System.out.println("A negative number or 0 is entered");
        } else {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b <= 0) {
            System.out.println("A negative number or 0 is entered");
        } else {
            this.b = b;
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c <= 0) {
            System.out.println("A negative number or 0 is entered");
        } else {
            this.c = c;
        }
    }

    public Coordinate getA1() {
        return a1;
    }

    public void setA1(Coordinate a1) {
        this.a1 = a1;
    }

    public Coordinate getB1() {
        return b1;
    }

    public void setB1(Coordinate b1) {
        this.b1 = b1;
    }

    public Coordinate getC1() {
        return c1;
    }

    public void setC1(Coordinate c1) {
        this.c1 = c1;
    }

    public double perimeter() {
        return a + b + c;
    }

    private double halfPerimeter() {
        return (a + b + c) / 2;
    }

    public double area() {
        return Math.sqrt(halfPerimeter() * (halfPerimeter() - a) * (halfPerimeter() - b) * (halfPerimeter() - c));
    }


    public Coordinate medianIntersPoint() {
        int x = a1.x + b1.x + c1.x;
        int y = a1.y + b1.y + c1.y;
        return new Coordinate(x,y);
    }
}
