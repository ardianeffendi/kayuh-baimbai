package com.blogspot.wasakamantap

import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.databinding.ActivitySettingScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

class SettingScreen : BaseActivity() {

    private lateinit var binding: ActivitySettingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)

        /**
         * Settings' menu buttons
         */
        touchImageListener(binding.ivSettingMainmenu, MainScreen())
        // TODO: Touch Listener to open Volume Setting and add finish when moving to MainScreen
        destroyApp(binding.ivSettingExit)

        touchBackListener(binding.ivSettingClose)
    }
}