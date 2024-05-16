package com.example.books

import android.os.Bundle
import androidx.activity.ComponentActivity

import android.content.Intent
import android.net.Uri
//import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x1 = findViewById<ImageView>(R.id.img1)
        x1.setOnClickListener {
            var y = Intent(Intent.ACTION_VIEW)
            y.data = Uri.parse("https://google.com")
            startActivity(y)
        }

        var x2 = findViewById<ImageView>(R.id.img2)
        x2.setOnClickListener {
            var y = Intent(Intent.ACTION_VIEW)
            y.data = Uri.parse("https://facebook.com")
            startActivity(y)
        }

        var x3 = findViewById<ImageView>(R.id.img3)
        x3.setOnClickListener {
            var y = Intent(Intent.ACTION_VIEW)
            y.data = Uri.parse("https://instagram.com")
            startActivity(y)
        }


    }
}




