package com.blogspot.wasakamantap.ui.komoditas

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.adapter.KomoditasAdapter
import com.blogspot.wasakamantap.databinding.ActivityKomoditasScreenBinding
import com.blogspot.wasakamantap.ui.BaseActivity
import com.blogspot.wasakamantap.ui.SettingScreen
import com.blogspot.wasakamantap.utils.hideStatusBar
import com.blogspot.wasakamantap.viewmodel.KomoditasViewModel

@SuppressLint("ClickableViewAccessibility")
class KomoditasScreen : BaseActivity() {
    private lateinit var binding: ActivityKomoditasScreenBinding

    private lateinit var komoditasAdapter: KomoditasAdapter
    private lateinit var viewModel: KomoditasViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKomoditasScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideStatusBar(this)

        // Bind the click sound
        media = MediaPlayer.create(this, R.raw.click)

        /**
         * Touch Listener
         */
        touchBackListener(binding.ivKomoditasBack)
        touchImageIntentListener(binding.ivKomoditasSetting, SettingScreen(), true)

        // Instantiate the view model
        viewModel = ViewModelProvider(this).get(KomoditasViewModel::class.java)

        // Bind the adapter
        komoditasAdapter = KomoditasAdapter(this)
        komoditasAdapter.submitList(viewModel.getMasakanKhas())

        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvKomoditas.apply {
            layoutManager = LinearLayoutManager(this@KomoditasScreen)
            adapter = komoditasAdapter
        }
    }
}