package com.blogspot.wasakamantap.ui.opening

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivityOpeningScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
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

        hideStatusBar(this)

        activityScope.launch {
            delay(3000)
            val intent = Intent(this@OpeningScreen, BlankScreen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            finish()
        }
    }
}