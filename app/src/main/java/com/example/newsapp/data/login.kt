package com.example.newsapp.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import com.example.newsapp.R
import com.example.newsapp.AuthenticationManager

class login : AppCompatActivity() {

    private val authManager = AuthenticationManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            authManager.loginUser(email, password) { success, message ->
                if (success) {
                    // Login successful
                    // You can navigate to the main activity or perform other actions
                } else {
                    // Login failed, show an error message
                    // You can display the error message using a TextView or Toast
                }
            }
        }
    }
}
