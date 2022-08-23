package com.blogspot.wasakamantap.ui.game

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivityGameScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar

/**
 * Screen for Game
 * This class extendes BaseActivity
 * @author Ardian Maulana Effendi <b>ardian.effendi21@gmail.com</b>
 * @see BaseActivity
 */
@SuppressLint("ClickableViewAccessibility")
class GameScreen : BaseActivity() {
    private lateinit var binding: ActivityGameScreenBinding
    private lateinit var blinkAnimation: Animation
    private lateinit var rotateAnimation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        touchBackListener(binding.ivGameBack)
        touchImageIntentListener(binding.ivGameSetting, SettingScreen(), true)
        touchImageIntentListener(binding.ivGamePlayButton, GamePlayScreen(), true)

        // Bind the animation with its resource file
        blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation)
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_indefinitely)

        // Attach the animation to the views which use it
        binding.ivGameUpperLeft.animation = blinkAnimation
        binding.ivGameUpperRight.animation = blinkAnimation
        binding.ivGameDiamondLeft.animation = blinkAnimation
        binding.ivGameLeafRight.animation = blinkAnimation
        binding.ivGamePlayButton.animation = rotateAnimation

    }

}