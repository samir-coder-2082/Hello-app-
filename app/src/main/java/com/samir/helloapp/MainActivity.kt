package com.samir.helloapp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var count = 0

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER

        val text = TextView(this)
        text.text = "Bismillah! Abhi tak 0 baar dabaya"
        text.textSize = 22f
        text.gravity = Gravity.CENTER
        text.setTextColor(Color.BLACK)

        val button = Button(this)
        button.text = "Mujhe dabao"
        button.setOnClickListener {
            count++
            text.text = "Mashallah! $count baar dabaya"
        }

        layout.addView(text)
        layout.addView(button)
        setContentView(layout)
    }
}
