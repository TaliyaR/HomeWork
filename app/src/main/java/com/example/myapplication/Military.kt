package com.example.myapplication

class Military (
        var name: String,
        var rank: String?,
        var gun: Boolean){

    fun shoot() = print("Bam-Bam")

    fun fight() = print("Fight!!!")
}