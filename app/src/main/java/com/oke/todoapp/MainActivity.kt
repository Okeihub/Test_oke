package com.oke.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val username:String="admin"
    val password:String="okeihub"


    private lateinit var usernameiput: EditText
    private lateinit var passwordinput:EditText
    private lateinit var submitbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}