package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.blogspot.wasakamantap.databinding.ActivityTradisiScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

@SuppressLint("ClickableViewAccessibility")
class TradisiScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTradisiScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideStatusBar(this)

        binding.ivTradisiBack.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> return@setOnTouchListener true
                MotionEvent.ACTION_UP -> {
                    this.onBackPressed()
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