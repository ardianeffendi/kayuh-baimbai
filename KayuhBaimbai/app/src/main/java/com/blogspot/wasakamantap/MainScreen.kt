package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.databinding.ActivityMainScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.utils.mediaPlayer
import com.blogspot.wasakamantap.utils.shrinkAndGrowAnim

@SuppressLint("ClickableViewAccessibility")
class MainScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainScreenBinding

    private lateinit var topAnim: Animation
    private lateinit var shakyAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideStatusBar(this)

        /**
         * Bind the animation
         */
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        shakyAnim = AnimationUtils.loadAnimation(this, R.anim.shaky_animation)

        binding.ivTitle.animation = topAnim

        /**
         * Shrink and Grow Animation
         */
        val leftInstrumental = shrinkAndGrowAnim(binding.ivLeftInstrumental)
        val rightInstrumental = shrinkAndGrowAnim(binding.ivRightInstrumental)
        leftInstrumental.start()
        rightInstrumental.start()

        /**
         * TODO: Have to refactor this repeated code!
         * TODO: Create CustomImageView and apply it to every image touch listener
         */
        binding.ivTradisi.setOnTouchListener { v, event ->
            val media = mediaPlayer(this, R.raw.click)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    val intent = Intent(this, TradisiScreen::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    media.stop()
                    media.release()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }

        binding.ivGame.setOnTouchListener { v, event ->
            val media = mediaPlayer(this, R.raw.click)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    val intent = Intent(this, GameScreen::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    media.stop()
                    media.release()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }

        binding.ivKomoditas.setOnTouchListener { v, event ->
            val media = mediaPlayer(this, R.raw.click)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    val intent = Intent(this, KomoditasScreen   ::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    media.stop()
                    media.release()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }
}