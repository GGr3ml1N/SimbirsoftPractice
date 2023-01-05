package com.ggr3ml1n.practice;

class Coordinate {
    private double x;
    private double y;

    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x:" + x +
                ", y:" + y +
                '}';
    }

    /*
      Сделаны те же самые методы, но только (как мне показалось) с более удобной реализацией ¯\_(ツ)_/¯
     */
    public void move(Directions direction){
        direction.move(this);
    }

    public void move(Directions... direction){
        for (Directions directions : direction) {
            directions.move(this);
        }
    }
}