package com.blogspot.wasakamantap.ui.komoditas

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
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

        // The pager adapter, which provides the pages to the view pager widget.
        binding.viewPager.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount(): Int {
                return 5
            }

            override fun createFragment(position: Int): Fragment {
                var fragment: Fragment? = null
                when (position) {
                    0 -> fragment = MasakanKhasFragment()
                    1 -> fragment = KueBasahFragment()
                    2 -> fragment = SayuranBuahIkanFragment()
                    3 -> fragment = WadaiKaringFragment()
                    4 -> fragment = MakananDiawetkanFragment()
                }
                return fragment as Fragment
            }

        }
    }

    override fun onBackPressed() {
        if (binding.viewPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            binding.viewPager.currentItem = binding.viewPager.currentItem - 1
        }
    }
}