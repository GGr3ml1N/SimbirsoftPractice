package com.ggr3ml1n.practice

import java.time.LocalDateTime

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val type: Type,
) {
    val startTime: LocalDateTime by lazy {
        LocalDateTime.now()
    }
}