package com.example.newsapp.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    private val authManager = AuthenticationManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            authManager.registerUser(email, password) { success, message ->
                if (success) {
                    // Registration successful
                    // You can navigate to the main activity or perform other actions
                } else {
                    // Registration failed, show an error message
                    // You can display the error message using a TextView or Toast
                }
            }
        }
    }
}
