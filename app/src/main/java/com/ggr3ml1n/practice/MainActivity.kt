package com.ggr3ml1n.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/*
Создать enum Type с константами DEMO и FULL.

Реализовать класс данных User с полями id, name, age и type.
У класса User создать ленивое свойство startTime, в котором
получаем текущее время.

Создать объект класса User, вывести в лог startTime
данного юзера, после вызвать Thread.sleep(1000) и
повторно вывести в лог startTime.

Создать список пользователей, содержащий в себе один
объект класса User. Используя функцию apply, добавить
ещё несколько объектов класса User в список пользователей.

Получить список пользователей, у которых имеется полный
доступ (поле type имеет значение FULL).

Преобразовать список User в список имен пользователей.
Получить первый и последний элементы списка и вывести их в лог.

Создать функцию-расширение класса User, которая проверяет,
что юзер старше 18 лет, и в случае успеха выводит в лог, а
в случае неуспеха возвращает ошибку.

Создать интерфейс AuthCallback с методами authSuccess,
authFailed и реализовать анонимный объект данного интерфейса.
В методах необходимо вывести в лог информацию о статусе авторизации.

Реализовать inline функцию auth, принимающую в качестве параметра
функцию updateCache. Функция updateCache должна
выводить в лог информацию об обновлении кэша.

Внутри функции auth вызвать метод коллбека authSuccess
и переданный updateCache, если проверка возраста
пользователя произошла без ошибки. В случае получения
ошибки вызвать authFailed.

Реализовать изолированный класс Action и его
наследников – Registration, Login и Logout. Login должен
принимать в качестве параметра экземпляр класса User.

Реализовать метод doAction, принимающий экземпляр класса Action.
В зависимости от переданного действия выводить в лог текст,
к примеру “Auth started”. Для действия Login вызывать метод auth.
 */

class MainActivity : AppCompatActivity() {
    
    private val user = User(1, "Dinar", 22, Type.FULL)
    private val user1 = User(2, "Oleg", 20, Type.FULL)
    private val user2 = User(3, "Misha", 18, Type.DEMO)
    private val user3 = User(4, "Dima", 25, Type.DEMO)
    private val user4 = User(5, "Sasha", 24, Type.FULL)
    private val user5 = User(6, "Ura", 16, Type.DEMO)
    private val userList = mutableListOf(user, user1, user2, user3)
    
    private val authCheck = object : AuthCallback {
        override fun authSuccess() {
            Log.d("Info", "Пользователь авторизован")
        }
        
        override fun authFailed() {
            Log.d("Info", "Ошибка! Пользователь неавторизован")
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Log.d("Info", "Time: ${user.startTime}")
        Thread.sleep(1000)
        Log.d("Info", "Time: ${user.startTime}")
        
        userList.apply {
            add(user4)
            add(user5)
        }
        
        val newList = userList.filter { it.type == Type.FULL }
        Log.d("Info", "$newList")
        val nameList = userList.map { it.name }
        Log.d("Info", "$nameList")
        Log.d("Info", "${nameList.first()} и ${nameList.last()}")
        
        user5.check()
        
        auth {
            if (user.age > 18) authCheck.authSuccess() else authCheck.authFailed()
            updateCache()
        }
        
        doAction(Action.Registration(user))
        doAction(Action.Login(user))
        doAction(Action.Logout(user))
    }
    
    private fun doAction(action: Action) {
        when (action) {
            is Action.Registration -> Log.d("Info", "Registration...")
            is Action.Login -> auth {
                if (user.age > 18) authCheck.authSuccess() else authCheck.authFailed()
                updateCache()
            }
            else -> Log.d("Info", "Logout...")
            
        }
    }
    
    private fun User.check() {
        if (this.age < 18)
            Log.d("Info", "${this.name} очень молод")
    }
    
    private inline fun auth(updateCache: () -> Unit) {
        updateCache()
    }
    
    private fun updateCache() {
        Log.d("Info", "Кэш обновлен")
    }
}