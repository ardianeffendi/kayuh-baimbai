package com.blogspot.wasakamantap.tradisibudaya

import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.BaseActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.SettingScreen
import com.blogspot.wasakamantap.databinding.ActivityTradisiScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

class TradisiScreen : BaseActivity() {

    private lateinit var binding: ActivityTradisiScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivTradisiBack)
        touchImageIntentListener(binding.ivTradisiSetting, SettingScreen(), true)
    }

}