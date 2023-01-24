package com.ggr3ml1n.practice

import java.time.LocalDateTime

data class User(
    val id: Int,
    var name: String,
    var age: Int,
    val type: Type,
) {
    val startTime: LocalDateTime by lazy {
        LocalDateTime.now()
    }
}