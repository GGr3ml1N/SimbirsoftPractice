package com.ggr3ml1n.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var book = Book(40.7, 4000)
        var magazine = Magazine(70.3, 7500)
        Log.d("Info", "$book and $magazine")
    }
}