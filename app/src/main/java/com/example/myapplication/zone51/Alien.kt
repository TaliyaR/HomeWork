package com.example.zone51

class Alien(
    var id: Long,
    var planet: String?,
    var year: Int): Noisable{

    override fun makeNoise() = print("Bam Clap Ding")

    override fun shout() = print("Shout to the door")

    fun sendSosSignal() = print("SOS I am from $planet")

    fun knock() = print("knock-knock")

    fun countYear(thisYear: Int): Int{
        var years = thisYear - year
        return years
    }
}