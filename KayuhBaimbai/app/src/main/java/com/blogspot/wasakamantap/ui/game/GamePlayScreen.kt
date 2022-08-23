package com.blogspot.wasakamantap.ui.game

import android.content.pm.ActivityInfo
import android.os.Bundle
import com.blogspot.wasakamantap.databinding.ActivityGamePlayScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar

class GamePlayScreen : BaseActivity() {

    private lateinit var binding: ActivityGamePlayScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamePlayScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        // Set the orientation to be landscape
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        touchBackListener(binding.ivGamePlayBack)
        touchImageIntentListener(binding.ivGamePlaySetting, SettingScreen(), true)
    }
}