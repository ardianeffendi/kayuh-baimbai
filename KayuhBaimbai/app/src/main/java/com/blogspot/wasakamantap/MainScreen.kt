package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.blogspot.wasakamantap.databinding.ActivityMainScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.utils.shrinkAndGrowAnim

@SuppressLint("ClickableViewAccessibility")
class MainScreen : BaseActivity() {
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
         * Touch Listener to specific screen
         * @see BaseActivity.touchImageListener
         */
        touchImageListener(binding.ivTradisi, TradisiBudayaScreen())

        touchImageListener(binding.ivGame, GameScreen())

        touchImageListener(binding.ivKomoditas, KomoditasScreen())
    }
}