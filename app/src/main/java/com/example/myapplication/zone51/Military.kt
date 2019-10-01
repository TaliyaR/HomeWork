package com.example.zone51

class Military(
    var name: String,
    var rank: String?,
    var gun: Boolean){

    fun shoot() = print("Bam-Bam")

    fun fight() = print("Fight!!!")
}