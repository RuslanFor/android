package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ButtonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        val buttonAllow = findViewById<Button>(R.id.buttonAllow)
        val buttonShow = findViewById<Button>(R.id.buttonShow)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        buttonAllow.setOnClickListener {
            buttonShow.isEnabled = true
        }

        buttonShow.setOnClickListener {
            buttonExit.visibility = View.VISIBLE
        }

        buttonExit.setOnClickListener {
            finish()
        }
    }
}