package com.ggr3ml1n.practice

sealed class Action
object Registration : Action()
class Login(val user: User) : Action()
object Logout : Action()


