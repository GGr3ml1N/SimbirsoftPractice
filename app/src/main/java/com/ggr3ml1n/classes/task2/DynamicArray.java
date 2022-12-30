package com.ggr3ml1n.classes.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/*
      Создать класс, содержащий динамический массив и количество элементов в нем.
      Добавить конструктор, который выделяет память под заданное количество элементов.
      Добавить методы, позволяющие заполнять массив случайными числами,
      переставлять в данном массиве элементы в случайном порядке, находить количество
      различных элементов в массиве, выводить массив на экран.
 */
public class DynamicArray {

    private ArrayList<Integer> dynamicArray;
    private int size;

    public DynamicArray(int size) {
        dynamicArray = new ArrayList<>(size);
        this.size = size;
    }

    public ArrayList<Integer> getDynamicArray() {
        return dynamicArray;
    }

    public void setDynamicArray(ArrayList<Integer> dynamicArray) {
        this.dynamicArray = dynamicArray;
    }

    public int getSize() {
        return dynamicArray.size();
    }

    public ArrayList<Integer> fillRandom(int min, int max) {
        if (!dynamicArray.isEmpty()) {
            dynamicArray.clear();
        }
        for (int i = 0; i < size; i++) {
            dynamicArray.add(i, random(min, max));
        }
        return dynamicArray;
    }

    private int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void rearrangeRandom() {
        Collections.shuffle(dynamicArray);
    }

    public void showArray() {
        System.out.print("[");
        for (int i = 0; i < dynamicArray.size() - 1; i++) {
            System.out.print(dynamicArray.get(i) + ", ");
        }
        System.out.println(dynamicArray.get(dynamicArray.size() - 1) + "]");
    }

    public int showDifference() {
        boolean flag = false;
        int x = 0;
        for (int i = 0; i < dynamicArray.size(); i++) {
            for (int j = i + 1; j < dynamicArray.size() - 1; j++) {
                if (!Objects.equals(dynamicArray.get(i), dynamicArray.get(j))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) x++;
        }
        return x;
    }
}
