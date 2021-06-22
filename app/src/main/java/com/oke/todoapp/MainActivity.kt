package com.oke.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val username: String = "admin"
    val password: String = "okeihub"


    private lateinit var usernameinput: EditText
    private lateinit var passwordinput: EditText
    private lateinit var submitbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameinput = findViewById(R.id.usernamedispaly)
        passwordinput = findViewById(R.id.passwordinput)
        submitbutton = findViewById(R.id.submitbutton)

        submitbutton.setOnClickListener {

            val validusername = usernameinput.text.toString()
            val validpassword = passwordinput.text.toString()

            login(username, password)
        }
    }

    fun login(username: String, password: String) {
        if (isvalidCredentials(username, password)) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Login unsuccessful", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isvalidCredentials(username: String, password: String): Boolean {
        return ( password == validpassword)

    }

}