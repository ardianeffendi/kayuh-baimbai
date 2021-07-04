package com.blogspot.wasakamantap.tradisibudaya

import android.media.MediaPlayer
import android.os.Bundle
import com.blogspot.wasakamantap.BaseActivity
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.SettingScreen
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
         * Touch Listener to Tradisi, Kesenian, Permainan Tradisional and Setting Screen.
         * @see BaseActivity.touchImageIntentListener
         */
        touchImageIntentListener(binding.ivTradisiBalloon, TradisiScreen(), true)
        touchImageIntentListener(binding.ivKesenianBalloon, KesenianScreen(), true)
        touchImageIntentListener(binding.ivTraditionalGameBalloon, PermainanTradisionalScreen(), true)
        touchImageIntentListener(binding.ivSettingTradisiBudaya, SettingScreen(), true)

    }

}