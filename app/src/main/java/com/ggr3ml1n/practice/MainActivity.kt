package com.ggr3ml1n.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val book = Book(40.7, 4000)
        val magazine = Magazine(70.3, 7500)
        Log.d("Info", "Book's values: $book")
        Log.d("Info", "Magazine's values: $magazine")
        val book2 = Book(40.7, 4000)
        Log.d("Info", "Result of compare by \"===\" is ${book === book2}")
        Log.d("Info", "Result of compare by overridden equals is ${book.equals(book2)}")
        val book3: Book? = null
        val book4: Book? = Book(42.4, 3000)
        book3?.let { buy(it) }
        book4?.let { buy(it) }
        
        val sum = { a: Int, b: Int -> a + b }
        Log.d("Info", "Result of sum is ${sum(4, 6)}")
    }
    
    private fun buy(element: Publication) {
        Log.d("Info", "The purchase is complete. The purchase amount was ${element.price}")
    }
}