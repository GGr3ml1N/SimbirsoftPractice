package com.ggr3ml1n.practice

import java.math.BigDecimal

interface Publication {
    var price: BigDecimal
    var wordCount: Int
    
    fun getType(): String
}