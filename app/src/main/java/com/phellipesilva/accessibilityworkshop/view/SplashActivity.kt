package com.phellipesilva.accessibilityworkshop.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.phellipesilva.accessibilityworkshop.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 4000
        )
    }
}
