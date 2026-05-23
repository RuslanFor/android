package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CopyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_copy)

        val editText = findViewById<EditText>(R.id.editTextInput)
        val textView = findViewById<TextView>(R.id.textViewResult)

        val buttonCopy = findViewById<Button>(R.id.buttonCopy)
        val buttonClose = findViewById<Button>(R.id.buttonClose)

        buttonCopy.setOnClickListener {
            textView.text = editText.text.toString()
        }

        buttonClose.setOnClickListener {
            finish()
        }
    }
}