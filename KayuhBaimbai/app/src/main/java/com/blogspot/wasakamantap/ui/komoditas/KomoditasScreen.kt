package com.blogspot.wasakamantap.ui.komoditas

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
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

        /**
         * Listener for an image view that acts as a button.
         * When clicked, it navigates to the previous screen (fragment).
         */
        binding.btnPrev.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    clickPrevious()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }

        /**
         * Listener for an image view that acts as a button.
         * When clicked, it navigates to the next screen (fragment).
         */
        binding.btnNext.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    clickNext()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }

        /**
         * The Pager Adapter, which provides the pages to the view pager widget.
         */
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

        /**
         * Register a callback to notify what page we are currently at.
         * Useful for Button Nav's state.
         */
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> {
                        binding.btnPrev.visibility = View.INVISIBLE
                        binding.btnNext.visibility = View.VISIBLE
                    }
                    1 -> {
                        binding.btnPrev.visibility = View.VISIBLE
                        binding.btnNext.visibility = View.VISIBLE
                    }
                    2 -> {
                        binding.btnPrev.visibility = View.VISIBLE
                        binding.btnNext.visibility = View.VISIBLE
                    }
                    3 -> {
                        binding.btnPrev.visibility = View.VISIBLE
                        binding.btnNext.visibility = View.VISIBLE
                    }
                    4 -> {
                        binding.btnPrev.visibility = View.VISIBLE
                        binding.btnNext.visibility = View.INVISIBLE
                    }
                }
            }
        })

    }

    /**
     * When clicked, it will navigate to the next item that is hooked up with ViewPager2.
     */
    private fun clickNext() {
        binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1, true)
    }

    /**
     * When clicked, it will navigate to the previous item that is hooked up with ViewPager2.
     */
    private fun clickPrevious() {
        binding.viewPager.setCurrentItem(binding.viewPager.currentItem - 1, true)
    }

}