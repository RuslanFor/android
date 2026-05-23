package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTask1 = findViewById<Button>(R.id.buttonTask1)
        val buttonTask2 = findViewById<Button>(R.id.buttonTask2)
        val buttonTask3 = findViewById<Button>(R.id.buttonTask3)

        buttonTask1.setOnClickListener {
            startActivity(Intent(this, CopyActivity::class.java))
        }

        buttonTask2.setOnClickListener {
            startActivity(Intent(this, ButtonsActivity::class.java))
        }

        buttonTask3.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }
    }
}