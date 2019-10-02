package com.example.myapplication

class Kyles (
        var name: String,
        var nickname: String?,
        var age: Int,
        var power: Int): Runnable, Noisable{

    override fun makeNoise() = print("tear down the walls")

    override fun shout()  = print("AAAAAAAAAAAA")

    override fun runFast() = print("Kyle run fast")

    override fun runSlow() = print("Kyle run slow")

    override fun narutoRun() = print("Kyle run like Naruto")

    fun drink() = print("Drink Monster Energy")
}