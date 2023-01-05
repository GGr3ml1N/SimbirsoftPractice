package com.ggr3ml1n.practice;

import android.util.Log;

public enum Directions {
    UP {
        @Override
        Coordinate move(Coordinate coordinate) {
            coordinate.setY(coordinate.getY() + 1.0);
            return coordinate;
        }
    },
    DOWN{
        @Override
        Coordinate move(Coordinate coordinate) {
            coordinate.setY(coordinate.getY() - 1.0);
            return coordinate;
        }
    },
    LEFT{
        @Override
        Coordinate move(Coordinate coordinate) {
            coordinate.setX(coordinate.getX() - 1.0);
            return coordinate;
        }
    },
    RIGHT{
        @Override
        Coordinate move(Coordinate coordinate) {
            coordinate.setX(coordinate.getX() + 1.0);
            return coordinate;
        }
    };

    abstract Coordinate move(Coordinate coordinate);

    /*
    Два статическим метода, для изменения координаты. Сделано, как указано в задании

    Создать метод, принимающий координаты и одно из
    направлений и возвращающий координаты после перехода по направлению
     */
    public static Coordinate move(Coordinate coordinate, Directions direction){
        direction.move(coordinate);
        return coordinate;
    }

    /*
    Создать метод, осуществляющий несколько переходов от
    первоначальных координат и выводящий координаты после каждого перехода.
     */
    public static void move(Directions... direction){
        Coordinate location = new Coordinate(0.0, 0.0);
        for (Directions directions : direction) {
            directions.move(location);
            Log.d("Direction", location.toString());
        }
    }

}
