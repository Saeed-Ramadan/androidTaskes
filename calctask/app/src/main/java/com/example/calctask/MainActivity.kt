package com.example.calctask
//import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.EditText
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.plus)
        var b2 = findViewById<Button>(R.id.minus)
        var b3 = findViewById<Button>(R.id.multiply)
        var b4 = findViewById<Button>(R.id.division)
        var b5 = findViewById<Button>(R.id.clear)

        var e1 = findViewById<EditText>(R.id.n1)
        var e2 = findViewById<EditText>(R.id.n2)
        var e3 = findViewById<EditText>(R.id.result)


        b1.setOnClickListener {
            var num1 = e1.text.toString().toDouble()
            var num2 = e2.text.toString().toDouble()

            var Res = num1 + num2
            e3.setText(Res.toString())
        }


        b2.setOnClickListener {
            var num1 = e1.text.toString().toDouble()
            var num2 = e2.text.toString().toDouble()

            var Res = num1 - num2
            e3.setText(Res.toString())

        }


        b3.setOnClickListener {
            var num1 = e1.text.toString().toDouble()
            var num2 = e2.text.toString().toDouble()

            var Res = num1 * num2
            e3.setText(Res.toString())
        }


        b4.setOnClickListener {
            var num1 = e1.text.toString().toDouble()
            var num2 = e2.text.toString().toDouble()

            var Res = num1 / num2
            e3.setText(Res.toString())
        }

        b5.setOnClickListener {
            e1.setText(" ")
            e2.setText(" ")
            e3.setText(" ")
        }

    }
}

