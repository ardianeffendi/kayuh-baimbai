package com.blogspot.wasakamantap

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.blogspot.wasakamantap.databinding.ActivityOpeningScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OpeningScreen : AppCompatActivity() {

    private lateinit var binding: ActivityOpeningScreenBinding
    private val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOpeningScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hide Status Bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        activityScope.launch {
            delay(3000)
            val intent = Intent(this@OpeningScreen, SplashScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}