package com.blogspot.wasakamantap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.blogspot.wasakamantap.databinding.ActivityMainScreenBinding

class MainScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainScreenBinding

    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var fadeAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Bind the animation
         */
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        fadeAnim = AnimationUtils.loadAnimation(this, R.anim.fading_animation)

        binding.apply {
            ivTitle.animation = topAnim
            ivTitle2.animation = bottomAnim
            ivRightInstrumental.animation = bottomAnim
            ivLeftInstrumental.animation = bottomAnim
            ivTradisi.animation = fadeAnim
            ivGame.animation = fadeAnim
            ivKomoditas.animation = fadeAnim
        }
    }
}