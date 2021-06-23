package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.databinding.ActivityTradisiScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.utils.mediaPlayer

@SuppressLint("ClickableViewAccessibility")
class TradisiScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTradisiScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideStatusBar(this)

        binding.ivTradisiBack.setOnTouchListener { v, event ->
            val media = mediaPlayer(this, R.raw.click)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    this.onBackPressed()
                    media.stop()
                    media.release()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}