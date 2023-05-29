package com.ggr3ml1n.practice;

/*
  Написать простое лямбда-выражение в переменной myClosure,
  лямбда-выражение должно выводить в консоль фразу "I love Java".
  Вызвать это лямбда-выражение. Далее написать функцию, которая
  будет запускать заданное лямбда-выражение заданное количество раз.
  Объявить функцию так: public void repeatTask (int times, Runnable task).
  Функция должна запускать times раз лямбда-выражение task .
  Используйте эту функцию для печати "I love Java" 10 раз.
 */
public class Lambda {

    public void repeatTask(int times, Operationable fun){
        for (int i = 0; i < times; i++) {
            fun.print();
        }
    }

    interface Operationable {
        void print();
    }
}
