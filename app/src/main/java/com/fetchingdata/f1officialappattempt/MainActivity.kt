package com.fetchingdata.f1officialappattempt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // HIDES ACTION BAR
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        // SPLASH SCREEN
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainScreen::class.java)  // Making intent and changing to the screen we want after
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}