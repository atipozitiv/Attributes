package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonBlack: Button = findViewById(R.id.button_black);
        var buttonRed: Button = findViewById(R.id.button_red);
        var buttonSmall: Button = findViewById(R.id.button_small);
        var buttonBig: Button = findViewById(R.id.button_big);
        var buttonWhite: Button = findViewById(R.id.button_white);
        var buttonYellow: Button = findViewById(R.id.button_yellow);
        var editText: EditText = findViewById(R.id.EditText);
        buttonBlack.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        buttonRed.setOnClickListener {
            editText.setTextColor(Color.RED)
        }
        buttonSmall.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }
        buttonBig.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP,24F)
        }
        buttonWhite.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        buttonYellow.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}