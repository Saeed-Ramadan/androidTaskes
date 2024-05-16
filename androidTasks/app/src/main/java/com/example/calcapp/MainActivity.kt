package com.example.calcapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var firstNumberEditText: EditText
    private lateinit var secondNumberEditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberEditText = findViewById(R.id.firstNumber)
        secondNumberEditText = findViewById(R.id.secondNumber)
        resultTextView = findViewById(R.id.result)
    }


    fun onOperationButtonClick(view: View) {
        val firstNumber = firstNumberEditText.text.toString().toDouble()
        val secondNumber = secondNumberEditText.text.toString().toDouble()
        val result: Double

        when (view.id) {
            R.id.Addition -> {
                result = firstNumber + secondNumber
            }
            R.id.Subtract -> {
                result = firstNumber - secondNumber
            }
            R.id.Multiply -> {
                result = firstNumber * secondNumber
            }
            R.id.Divide -> {
                if (secondNumber != 0.0) {
                    result = firstNumber / secondNumber
                } else {
                    resultTextView.text = "Cannot divide by zero"
                    return
                }
            }
            R.id.clear -> {
                firstNumberEditText.text.clear()
                secondNumberEditText.text.clear()
                resultTextView.text = "0.0"
                return
            }
            else -> return
        }

        resultTextView.text = result.toString()
    }
}
