package com.ggr3ml1n.training;

import java.util.Arrays;

/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        return ((double) firstValue + (double) secondValue) / 2;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        return firstValue * 2 + (secondValue - 3) + thirdValue * thirdValue;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        return (value > 3) ? value + 10 : value - 10;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    public int swapNumbers(int value) {
        if (value < 10) {
            return value;
        }
        if (value <= 99999) {
            String number = String.valueOf(value);
            number = number.substring(number.length()-1) + number.substring(1, number.length() -1) + number.substring(0,1);
            int newValue = Integer.parseInt(number);
            return newValue;
        } else {
            return 0;
        }
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */
    public int zeroEvenNumber(int value) {
        if (value < 10) {
            return value;
        }
        if (value <= 99999) {
            char[] number = String.valueOf(value).toCharArray();
            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 == 0) {
                    number[i] = '0';
                }
            }
            String newValue = String.valueOf(number);
            return Integer.parseInt(newValue);
        } else {
            return 0;
        }
    }
}
