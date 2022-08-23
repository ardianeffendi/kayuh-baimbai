package com.blogspot.wasakamantap.ui.tradisibudaya.kesenian

import android.media.MediaPlayer
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.adapter.KesenianAdapter
import com.blogspot.wasakamantap.data.kesenian.KesenianModel
import com.blogspot.wasakamantap.databinding.ActivityKesenianScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar

class KesenianScreen : BaseActivity() {

    private lateinit var binding: ActivityKesenianScreenBinding
    private lateinit var kesenianAdapter: KesenianAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKesenianScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivKesenianBack)
        touchImageIntentListener(binding.ivSettingKesenian, SettingScreen(), true)

        // Bind the adapter
        kesenianAdapter = KesenianAdapter()
        kesenianAdapter.submitList(KesenianModel.getListData())

        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvKesenian.apply {
            layoutManager = LinearLayoutManager(this@KesenianScreen)
            adapter = kesenianAdapter
        }
    }
}