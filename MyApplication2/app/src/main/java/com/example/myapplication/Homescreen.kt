package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val profileButton = findViewById<Button>(R.id.buttonProfile)

        profileButton.setOnClickListener {
            val intent = Intent(this, Userprofile::class.java)
            startActivity(intent)
        }

        val AppointmentsButton = findViewById<Button>(R.id.buttonAppointments)

        AppointmentsButton.setOnClickListener {
            val intent = Intent(this, Date::class.java)
            startActivity(intent)
        }



        val logoutButton = findViewById<Button>(R.id.buttonLogout)

        logoutButton.setOnClickListener { val PatientsButton = findViewById<Button>(R.id.buttonPatients)

            PatientsButton.setOnClickListener {
                val intent = Intent(this, Patients::class.java)
                startActivity(intent)
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val doctorButton = findViewById<Button>(R.id.buttonDoctors)

        doctorButton.setOnClickListener {
            val intent = Intent(this, Doctors::class.java)
            startActivity(intent)
        }
    }
}