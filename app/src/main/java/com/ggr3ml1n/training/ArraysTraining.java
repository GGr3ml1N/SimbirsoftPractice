package com.ggr3ml1n.training;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        if (valuesArray.length > 0) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < valuesArray.length - 1; i++) {
                    if (valuesArray[i] > valuesArray[i + 1]) {
                        isSorted = false;
                        buf = valuesArray[i];
                        valuesArray[i] = valuesArray[i + 1];
                        valuesArray[i + 1] = buf;
                    }
                }
            }
            return valuesArray;
        }
        return new int[]{};
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if (values.length > 0) {
            int max = values[0];
            for (int value : values) {
                if (max < value) {
                    max = value;
                }
            }
            return max;
        }
        return 0;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if (numbersCount < 0) {
            return new int[]{};
        }
        int[] fib = new int[numbersCount];
        if (numbersCount == 0) {
            return fib;
        }
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < numbersCount; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];

        }
        return fib;
    }


    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int maxCount = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    maxCount++;
                }
            }
            newArray[i] = maxCount;
            maxCount = 0;
        }
        if (newArray.length > 0) {
            int max = newArray[0];
            for (int value : newArray) {
                if (max < value) {
                    max = value;
                }
            }
            return max;
        }
        return 0;
    }
}
