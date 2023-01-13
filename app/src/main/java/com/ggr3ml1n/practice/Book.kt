package com.ggr3ml1n.practice

import java.math.BigDecimal
import java.math.RoundingMode

class Book(price: Double, wordCount: Int) : Publication {
    
    override var price: BigDecimal = BigDecimal(price)
        set(value) {
            if (value < BigDecimal.ZERO) throw IllegalArgumentException()
            field = price.setScale(2, RoundingMode.HALF_UP)
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
    
    override fun getType(): String {
        return when {
            wordCount < 0 -> throw IllegalArgumentException()
            wordCount < 1000 -> "Flash Fiction"
            wordCount < 7500 -> "Short Story"
            else -> "Novel"
        }
    }
    
    override fun toString(): String {
        return "price = $price, wordCount = $wordCount"
    }
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        
        other as Book
        
        if (price != other.price) return false
        if (wordCount != other.wordCount) return false
        
        return true
    }
    
    override fun hashCode(): Int {
        var result = price.hashCode()
        result = 31 * result + wordCount
        return result
    }
    
    
}