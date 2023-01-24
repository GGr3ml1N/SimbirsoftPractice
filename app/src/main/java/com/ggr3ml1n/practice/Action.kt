package com.ggr3ml1n.practice

sealed class Action
class Registration : Action()
class Login(val user: User) : Action()
class Logout : Action()


