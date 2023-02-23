package com.ggr3ml1n.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.math.BigDecimal

/*
Необходимо создать интерфейс Publication, у которого должно быть свойства – price и wordCount,
а также метод getType, возвращающий строку. Создать два класса,
реализующих данный интерфейс – Book и Magazine.
В методе getType для класса Book возвращаем строку с зависимости от количества слов.
Если количество слов не превышает 1000, то вывести “Flash Fiction”, 7,500 –“Short Story”,
всё, что выше – “Novel”. Для класса Magazine возвращаем строку “Magazine”.

Создать два объекта класса Book и один объект Magazine. Вывести в лог для каждого объекта тип,
количество строк и цену в евро в отформатированном виде. У класса Book переопределить метод equals
и произвести сравнение сначала по ссылке, затем используя метод equals. Результаты сравнений вывести в лог.

Создать метод buy, который в качестве параметра принимает Publication
(notnull - значения) и выводит в лог “The purchase is complete. The purchase amount was [цена издания]”.
Создать две переменных класса Book, в которых могут находиться null значения.
Присвоить одной null, а второй любое notnull значение. Используя функцию let,
попробуйте вызвать метод buy с каждой из переменных.

Создать переменную sum и присвоить ей лямбда-выражение,
которое будет складывать два переданных ей числа и выводить результат в лог.
Вызвать данное лямбда-выражение с произвольными параметрами.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val book = Book(BigDecimal.valueOf(40.7), 4000)
        val magazine = Magazine(BigDecimal("70.3"), 7500)
        Log.d("Info", "Book's values: $book")
        Log.d("Info", "Magazine's values: $magazine")
        
        val book2 = Book(BigDecimal("40.7"), 4000)
        Log.d("Info", "Result of compare by \"===\" is ${book === book2}")
        Log.d("Info", "Result of compare by overridden equals is ${book.equals(book2)}")
        
        val book3: Book? = null
        val book4: Book? = Book(BigDecimal("42.4"), 3000)
        book3?.let { buy(it) }
        book4?.let { buy(it) }
        
        val sum = { a: Int, b: Int -> a + b }
        Log.d("Info", "Result of sum is ${sum(4, 6)}")
    }
    
    private fun buy(element: Publication) {
        Log.d("Info", "The purchase is complete. The purchase amount was ${element.price}")
    }
}