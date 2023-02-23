package com.ggr3ml1n.practice

import java.math.BigDecimal
import java.math.RoundingMode

class Magazine(override var price: BigDecimal, override var wordCount: Int) : Publication {
    
    override fun getType(): String = "Magazine"
    
    override fun toString(): String {
        return "price = $price, wordCount = $wordCount"
    }
}