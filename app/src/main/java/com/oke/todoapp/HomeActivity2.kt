package com.oke.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {
    private lateinit var usernamedisplay:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        usernamedisplay = findViewById(R.id.usernamedispaly)

        usernamedisplay.text = "Hello human beings"
    }
}