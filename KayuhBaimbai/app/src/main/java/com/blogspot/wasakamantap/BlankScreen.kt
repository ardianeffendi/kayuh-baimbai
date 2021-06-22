package com.blogspot.wasakamantap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.databinding.ActivityBlankScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BlankScreen : AppCompatActivity() {
    private lateinit var binding: ActivityBlankScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlankScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideStatusBar(this)

        CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            val intent = Intent(this@BlankScreen, SplashScreen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            finish()
        }
    }
}