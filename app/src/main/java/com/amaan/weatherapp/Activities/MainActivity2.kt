package com.amaan.weatherapp.Activities

import android.os.Bundle
import android.content.Intent;
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amaan.weatherapp.R

class MainActivity2 : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener(View.OnClickListener
        {
            if (username.getText().toString() == "amaan" && password.getText().toString() == "1234"
            )
            {
                Toast.makeText(this@MainActivity2, "Login Successful!", Toast.LENGTH_SHORT).show()
               var intent =  Intent(this,MainActivity::class.java)
                startActivity(intent);

            } else
            {
                Toast.makeText(this@MainActivity2, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })

    }

}