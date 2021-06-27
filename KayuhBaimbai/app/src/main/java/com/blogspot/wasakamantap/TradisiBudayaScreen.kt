package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.os.Bundle
import com.blogspot.wasakamantap.databinding.ActivityTradisiBudayaScreenBinding
import com.blogspot.wasakamantap.utils.hideStatusBar

/**
 * Screen for Tradisi and Budaya
 * This class extendes BaseActivity
 * @author Ardian Maulana Effendi <b>ardian.effendi21@gmail.com</b>
 * @see BaseActivity
 */
@SuppressLint("ClickableViewAccessibility")
class TradisiBudayaScreen : BaseActivity() {
    private lateinit var binding: ActivityTradisiBudayaScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiBudayaScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        touchBackListener(binding.ivTradisiBack)
    }

}