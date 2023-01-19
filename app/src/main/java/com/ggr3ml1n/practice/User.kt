package com.ggr3ml1n.practice

import java.time.LocalDateTime

class User(
    val id: Int,
    var name: String,
    var age: Int,
    val type: Type,
) {
    val startTime: LocalDateTime by lazy {
        LocalDateTime.now()
    }
    
    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age, type=$type)"
    }
    
    
}