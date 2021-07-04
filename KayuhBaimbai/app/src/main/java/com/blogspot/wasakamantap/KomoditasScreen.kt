package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.databinding.ActivityKomoditasScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

@SuppressLint("ClickableViewAccessibility")
class KomoditasScreen : BaseActivity() {
    private lateinit var binding: ActivityKomoditasScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKomoditasScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivKomoditasBack)
        touchImageIntentListener(binding.ivKomoditasSetting, SettingScreen(), true)
    }

}