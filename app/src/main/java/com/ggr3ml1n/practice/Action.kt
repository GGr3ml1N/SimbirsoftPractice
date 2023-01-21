package com.ggr3ml1n.practice

sealed class Action (val user: User)  {
    class Registration (user: User) : Action(user)
    class Login (user: User) : Action(user)
    class Logout (user: User) : Action(user)
}
