package com.example.zone51

class NarutoRunners(
    var name: String,
    var nickname: String?,
    var age: Int,
    var speed: Int): Runnable{

    override fun runFast() = print("Naruto Runner run fast")

    override fun runSlow() = print("Naruto Runner run slow")

    override fun narutoRun() = print("Naruto Runner run like Naruto")

    fun dodgeBullet() = print("Slow motion bullet dodge")



}