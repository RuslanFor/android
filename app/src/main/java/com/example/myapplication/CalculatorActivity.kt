package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val num1 = findViewById<EditText>(R.id.editTextNumber1)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)

        val result = findViewById<TextView>(R.id.textViewResult)
        val operator = findViewById<TextView>(R.id.textOperator)

        val add = findViewById<Button>(R.id.buttonAdd)
        val sub = findViewById<Button>(R.id.buttonSub)
        val mul = findViewById<Button>(R.id.buttonMul)
        val div = findViewById<Button>(R.id.buttonDiv)

        val close = findViewById<Button>(R.id.buttonClose)

        fun getNumber(e: EditText): Double {
            val t = e.text.toString()
            return if (t.isEmpty()) 0.0 else t.toDouble()
        }

        add.setOnClickListener {
            operator.text = "+"
            val a = getNumber(num1)
            val b = getNumber(num2)
            result.text = "${a + b}"
        }

        sub.setOnClickListener {
            operator.text = "-"
            val a = getNumber(num1)
            val b = getNumber(num2)
            result.text = "${a - b}"
        }

        mul.setOnClickListener {
            operator.text = "*"
            val a = getNumber(num1)
            val b = getNumber(num2)
            result.text = "${a * b}"
        }

        div.setOnClickListener {
            operator.text = "/"
            val a = getNumber(num1)
            val b = getNumber(num2)

            result.text = if (b != 0.0) "${a / b}" else "∞"
        }

        close.setOnClickListener {
            finish()
        }
    }
}