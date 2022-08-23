package com.blogspot.wasakamantap.ui.tradisibudaya.tradisi

import android.media.MediaPlayer
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.adapter.TradisiAdapter
import com.blogspot.wasakamantap.data.tradisi.TradisiModel
import com.blogspot.wasakamantap.databinding.ActivityTradisiScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar

class TradisiScreen : BaseActivity() {

    private lateinit var binding: ActivityTradisiScreenBinding

    private lateinit var tradisiAdapter: TradisiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradisiScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivTradisiBack)
        touchImageIntentListener(binding.ivTradisiSetting, SettingScreen(), true)

        // Bind the adapter
        tradisiAdapter = TradisiAdapter()
        tradisiAdapter.submitList(TradisiModel.getListData())

        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvTradisi.apply {
            layoutManager = LinearLayoutManager(this@TradisiScreen)
            adapter = tradisiAdapter
        }
    }

}