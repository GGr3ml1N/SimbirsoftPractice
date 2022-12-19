package com.ggr3ml1n.training;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     * (нумерация символов идет с нуля)
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        ArrayList<String> newText = new ArrayList<String>();
        for (int i = 1; i < text.length(); i = i + 2) {
            newText.add(String.valueOf(text.charAt(i)));
        }
        return String.join("", newText);
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        int size = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(text.length() - 1) == text.charAt(i)) {
                size++;
            }
        }
        int[] positions = new int[size];
        int i = 0;
        int j = 0;
        while (i < text.length() - 1) {
            if (text.charAt(text.length() - 1) == text.charAt(i)) {
                positions[j] = i;
                j++;
            }
            i++;
        }
        return positions;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        int number = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                number++;
            }
        }
        return number;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цифры заменены словами
     */
    public String replaceAllNumbers(String text) {
        char[] oldText = text.toCharArray();
        String[] newText = new String[text.length()];
        for (int i = 0; i < oldText.length; i++){
            newText[i] = Character.toString(oldText[i]);
        }
        for (int i = 0; i < newText.length; i++) {
                switch (newText[i].charAt(0)) {
                    case '0':
                        newText[i] = "zero";
                        break;
                    case '1' :
                        newText[i] = "one";
                        break;
                    case '2' :
                        newText[i] = "two";
                        break;
                    case '3':
                        newText[i] = "three";
                        break;
                    case '4':
                        newText[i] = "four";
                        break;
                    case '5':
                        newText[i] = "five";
                        break;
                    case '6':
                        newText[i] = "six";
                        break;
                    case '7':
                        newText[i] = "seven";
                        break;
                    case '8':
                        newText[i] = "eight";
                        break;
                    case '9':
                        newText[i] = "nine";
                        break;
                }
        }
        return String.join("", newText);
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        char[] oldText = text.toCharArray();
        char[] newText = new char[text.length()];
        for (int i = 0; i < oldText.length; i++) {
            if (Character.isLetter(oldText[i])) {
                if (Character.isUpperCase(oldText[i])) {
                    newText[i] = Character.toLowerCase(oldText[i]);
                }
                if (Character.isLowerCase(oldText[i])) {
                    newText[i] = Character.toUpperCase(oldText[i]);
                }
            } else {
                newText[i] = oldText[i];
            }
        }
        return new String(newText);
    }

}
