package com.blogspot.wasakamantap.tradisibudaya

import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.BaseActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.SettingScreen
import com.blogspot.wasakamantap.databinding.ActivityPermainanTradisionalScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

class PermainanTradisionalScreen : BaseActivity() {

    private lateinit var binding: ActivityPermainanTradisionalScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPermainanTradisionalScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivPermainanBack)
        touchImageIntentListener(binding.ivPermainanSetting, SettingScreen(), true)
    }

}