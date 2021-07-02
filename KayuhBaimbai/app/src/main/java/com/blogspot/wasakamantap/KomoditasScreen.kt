package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.databinding.ActivityKomoditasScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.utils.mediaPlayer

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
        touchImageListener(binding.ivKomoditasSetting, SettingScreen())
    }

}