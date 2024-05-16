package com.example.doctorapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var getStartedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton = findViewById(R.id.getstarted)

        getStartedButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, DashboardActivity::class.java))
        }
    }
}
