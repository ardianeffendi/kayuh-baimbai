package com.blogspot.wasakamantap.ui

import android.annotation.SuppressLint
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.SeekBar
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivitySettingScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

@SuppressLint("ClickableViewAccessibility")
class SettingScreen : BaseActivity() {

    private lateinit var binding: ActivitySettingScreenBinding
    private lateinit var audioManager: AudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)

        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        //val audioManager = audioManager.getStreamMaxVolume()

        /**
         * Settings' menu buttons
         */
        touchImageIntentListener(binding.ivSettingMainmenu, MainScreen(), false)
        binding.ivSettingVolume.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    stopMedia()
                    binding.layoutVolume.root.visibility = View.VISIBLE
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
        binding.layoutVolume.ivVolumeExit.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    stopMedia()
                    binding.layoutVolume.root.visibility = View.INVISIBLE
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
        destroyApp(binding.ivSettingExit)
        touchBackListener(binding.ivSettingClose)

        /**
         * Seekbar volume adjuster code's block
         */
        binding.layoutVolume.apply {
            volumeSeekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                   // audioManager.setStreamVolume()
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {

                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {

                }

            })
        }

    }
}