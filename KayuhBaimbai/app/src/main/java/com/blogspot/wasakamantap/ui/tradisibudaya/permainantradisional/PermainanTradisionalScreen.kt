package com.blogspot.wasakamantap.ui.tradisibudaya.permainantradisional

import android.media.MediaPlayer
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.adapter.PermainanTradisionalAdapter
import com.blogspot.wasakamantap.data.permainantradisional.PermainanModel
import com.blogspot.wasakamantap.databinding.ActivityPermainanTradisionalScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar

class PermainanTradisionalScreen : BaseActivity() {

    private lateinit var binding: ActivityPermainanTradisionalScreenBinding
    private lateinit var permainanAdapter: PermainanTradisionalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPermainanTradisionalScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)
        media = MediaPlayer.create(this, R.raw.click)
        touchBackListener(binding.ivPermainanBack)
        touchImageIntentListener(binding.ivPermainanSetting, SettingScreen(), true)

        // Bind the adapter
        permainanAdapter = PermainanTradisionalAdapter()
        permainanAdapter.submitList(PermainanModel.getListData())

        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvPermainanTradisional.apply {
            layoutManager = LinearLayoutManager(this@PermainanTradisionalScreen)
            adapter = permainanAdapter
        }
    }

}