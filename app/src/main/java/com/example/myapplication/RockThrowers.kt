package com.example.myapplication

class RockThrowers(
        var name: String,
        var nickname: String?,
        var age: Int,
        var countRock: Int = 100): Runnable{

    override fun runFast() = print("Rock Thrower run fast")

    override fun runSlow() = print("Rock Thrower run slow")

    override fun narutoRun() = print("Rock Thrower run like Naruto")

    fun throwRock() = print("Catch the rock")
}