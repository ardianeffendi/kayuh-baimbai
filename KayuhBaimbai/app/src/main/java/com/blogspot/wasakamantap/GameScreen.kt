package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.databinding.ActivityGameScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.utils.mediaPlayer

@SuppressLint("ClickableViewAccessibility")
class GameScreen : AppCompatActivity() {
    private lateinit var binding: ActivityGameScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideStatusBar(this)

        binding.ivGameBack.setOnTouchListener { v, event ->
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