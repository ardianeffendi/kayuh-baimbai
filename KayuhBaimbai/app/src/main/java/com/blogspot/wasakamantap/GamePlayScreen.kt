package com.blogspot.wasakamantap

import android.content.pm.ActivityInfo
import android.os.Bundle
import com.blogspot.wasakamantap.databinding.ActivityGamePlayScreenBinding

class GamePlayScreen : BaseActivity() {

    private lateinit var binding: ActivityGamePlayScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamePlayScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Set the orientation to be landscape
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        touchBackListener(binding.ivGamePlayBack)
        touchImageIntentListener(binding.ivGamePlaySetting, SettingScreen(), true)
    }
}