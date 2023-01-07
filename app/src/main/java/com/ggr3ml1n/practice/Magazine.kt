package com.ggr3ml1n.practice

import java.math.BigDecimal

class Magazine(price : Double, wordCount : Int) : Publication {
    
    override var price: BigDecimal = BigDecimal(price)
    set(value) {
        if (value < BigDecimal.ZERO) throw IllegalArgumentException()
        field = price
    }
    override var wordCount: Int = wordCount
        set(value) {
        if (value < 0) throw IllegalArgumentException()
        field = wordCount
    }
    
    init {
        this.price = BigDecimal(price)
        this.wordCount = wordCount
    }
    
    override fun getType(): String = "Magazine"
    override fun toString(): String {
        return "price = $price, wordCount = $wordCount"
    }
    
    
}