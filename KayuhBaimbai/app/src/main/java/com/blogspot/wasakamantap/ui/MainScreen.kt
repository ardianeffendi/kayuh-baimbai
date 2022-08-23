package com.blogspot.wasakamantap.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivityMainScreenBinding
import com.blogspot.wasakamantap.ui.game.GameScreen
import com.blogspot.wasakamantap.ui.komoditas.KomoditasScreen
import com.blogspot.wasakamantap.ui.tradisibudaya.TradisiBudayaScreen
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
         * @see BaseActivity.touchImageIntentListener
         */
        touchImageIntentListener(binding.ivTradisi, TradisiBudayaScreen(), true)
        touchImageIntentListener(binding.ivGame, GameScreen(), true)
        touchImageIntentListener(binding.ivKomoditas, KomoditasScreen(), true)
        touchImageIntentListener(binding.ivSetting, SettingScreen(), true)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}