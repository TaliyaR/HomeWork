package com.example.zone51

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG : String = "Log"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alien = Alien(1L, "Terlon", 2001)
        Log.e(TAG, "create $alien")

        val military = Military("Dan", "Captain", true)
        Log.e(TAG, "create $military")

        val narutoRunner = NarutoRunners("K", "451DD", 21, 32211)
        Log.e(TAG, "create $narutoRunner")

        val rockThrower = RockThrowers("M", "NK", 54)
        Log.e(TAG, "create $rockThrower")

        val kyle = Kyles("L", "Rgdf", 19, 400)
        Log.e(TAG, "create $kyle")

        myLog("create $alien")

    }

    inline fun myLog(message: String){
        val tag = "mLog"
        Log.e(tag, message)
    }
}
