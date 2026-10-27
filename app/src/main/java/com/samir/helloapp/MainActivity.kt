package com.samir.helloapp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this)
        text.text = "Assalamualaikum Samir! Hello App chal gaya 🎉"
        text.textSize = 24f
        text.gravity = Gravity.CENTER
        text.setTextColor(Color.BLACK)
        setContentView(text)
    }
}
