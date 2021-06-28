package com.blogspot.wasakamantap.tradisibudaya

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.blogspot.wasakamantap.BaseActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivityTradisiBudayaScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

/**
 * Screen for Tradisi and Budaya
 * This class extendes BaseActivity
 * @author Ardian Maulana Effendi <b>ardian.effendi21@gmail.com</b>
 * @see BaseActivity
 */
class TradisiBudayaScreen : BaseActivity() {

    private lateinit var binding: ActivityTradisiBudayaScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiBudayaScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)

        /**
         * Touch Listener for Back Button
         * @see BaseActivity.touchBackListener
         */
        touchBackListener(binding.ivTradisiBudayaBack)

        /**
         * Touch Listener to Tradisi, Kesenian, and Permainan Tradisional.
         * @see BaseActivity.touchImageListener
         */
        touchImageListener(binding.ivTradisiBalloon, TradisiScreen())
        touchImageListener(binding.ivKesenianBalloon, KesenianScreen())
        touchImageListener(binding.ivTraditionalGameBalloon, PermainanTradisionalScreen())

    }

}