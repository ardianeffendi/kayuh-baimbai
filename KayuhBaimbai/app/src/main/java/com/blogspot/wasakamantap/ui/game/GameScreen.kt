package com.blogspot.wasakamantap.ui.game

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        touchBackListener(binding.ivGameBack)
        touchImageIntentListener(binding.ivGameSetting, SettingScreen(), true)
        touchImageIntentListener(binding.ivGamePlayButton, GamePlayScreen(), true)
    }

}