package com.example.calc

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import com.calc.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            btnClear.setOnClickListener(this@MainActivity)
            btnDivide.setOnClickListener(this@MainActivity)
            btnMinus.setOnClickListener(this@MainActivity)
            btnPlus.setOnClickListener(this@MainActivity)
            btnMultiply.setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(v: View?) {
        val firstNum = binding.edtFirstNumber.text.toString()
        val secondNum = binding.edtSecondNumber.text.toString()
        when (v) {
            binding.btnClear -> {
                binding.edtFirstNumber.text.clear()
                binding.edtSecondNumber.text.clear()
                binding.tvResult.text = ""
            }

            binding.btnPlus -> {
                if (checkValidation(firstNum, secondNum)) {
                    binding.tvResult.text = getString(
                        R.string.result_text,
                        String.format("%.2f", (firstNum.toDouble() + secondNum.toDouble()))
                    )
                }
            }

            binding.btnMinus -> {
                if (checkValidation(firstNum, secondNum)) {
                    binding.tvResult.text = getString(
                        R.string.result_text,
                        String.format("%.2f", (firstNum.toDouble() - secondNum.toDouble()))
                    )
                }
            }

            binding.btnMultiply -> {
                if (checkValidation(firstNum, secondNum)) {
                    binding.tvResult.text = getString(
                        R.string.result_text,
                        String.format("%.2f", (firstNum.toDouble() * secondNum.toDouble()))
                    )
                }
            }

            binding.btnDivide -> {
                if (checkValidation(firstNum, secondNum)) {
                    binding.tvResult.text = getString(
                        R.string.result_text,
                        String.format("%.2f", (firstNum.toDouble() / secondNum.toDouble()))
                    )
                }
            }
        }
    }

    private fun checkValidation(firstNum: String, secondNum: String): Boolean {
        if (firstNum.isEmpty()) {
            binding.edtFirstNumber.error = getString(R.string.enter_first_number)
            return false
        } else if (!isNumeric(firstNum)) {
            binding.edtFirstNumber.error = getString(R.string.enter_valid_number)
            return false
        } else binding.edtFirstNumber.error = null

        if (secondNum.isEmpty()) {
            binding.edtSecondNumber.error = getString(R.string.enter_second_number)
            return false
        } else if (!isNumeric(secondNum)) {
            binding.edtSecondNumber.error = getString(R.string.enter_valid_number)
            return false
        } else binding.edtSecondNumber.error = null

        return true
    }

    private fun isNumeric(s: String): Boolean {
        return s.chars().allMatch { Character.isDigit(it) }
    }
}