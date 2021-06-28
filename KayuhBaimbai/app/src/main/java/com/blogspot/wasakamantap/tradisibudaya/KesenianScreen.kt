package com.blogspot.wasakamantap.tradisibudaya

import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.BaseActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivityKesenianScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

class KesenianScreen : BaseActivity() {

    private lateinit var binding: ActivityKesenianScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKesenianScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivKesenianBack)
    }
}