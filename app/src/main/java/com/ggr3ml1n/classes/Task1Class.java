package com.ggr3ml1n.classes;

/*
  Создать класс с двумя переменными. Добавить функцию вывода на экран
  и функцию изменения этих переменных. Добавить функцию, которая находит
  сумму значений этих переменных, и функцию, которая находит наибольшее
  значение из этих двух переменных.
 */
public class Task1Class{

    //Две переменные
    private int variable1;
    private int variable2;

    //Геттеры и сеттеры
    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public void toStringVariables(){
        System.out.println("Variable 1: " + getVariable1() + "and Variable2: " + getVariable2());
    }

    //Функция нахождения суммы
    public int getSum() {
        return variable1 + variable2;
    }

    //Функция нахождения максимума из двух переменных
    public int getMax() {
        return Math.max(variable1, variable2);
    }
}
