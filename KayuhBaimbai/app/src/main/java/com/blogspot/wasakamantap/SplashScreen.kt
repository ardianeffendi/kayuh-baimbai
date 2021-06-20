package com.blogspot.wasakamantap

import android.animation.ObjectAnimator
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.RequiresApi
import com.blogspot.wasakamantap.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val activityScope = CoroutineScope(Dispatchers.Main)

    // Animation Variables
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var fadeAnim: Animation
    private lateinit var lateBottomAnim: Animation
    private lateinit var shakyAnimation: Animation

    companion object {
        private const val THREE_SECONDS = 3000L
        private const val TWO_SECONDS = 2000L
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Bind the animation
         */
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        lateBottomAnim = AnimationUtils.loadAnimation(this, R.anim.late_bottom_animation)
        fadeAnim = AnimationUtils.loadAnimation(this, R.anim.fading_animation)
        shakyAnimation = AnimationUtils.loadAnimation(this, R.anim.shaky_animation)

        /**
         * Hide the status bar
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        /**
         * Progress Bar Animation
         */
        binding.progressBar.max = 1000
        val currProgress = 1000
        ObjectAnimator.ofInt(binding.progressBar, "progress", currProgress)
            .setDuration(8000)
            .start()

        // Coroutines in activity scope
        activityScope.launch {
            // Create media player to play audio during splash screen
            val media: MediaPlayer = MediaPlayer.create(this@SplashScreen, R.raw.panting_sound)
            media.start()

            // animation for main part
            binding.apply {
                ivKayuh.animation = topAnim
                ivAcc.animation = topAnim
                ivBaimbai.animation = bottomAnim
            }
            delay(THREE_SECONDS)

            // animation after half duration of splash screen
            binding.apply {
                ivRakat.visibility = View.VISIBLE
                ivLeaves.visibility = View.VISIBLE
                ivWood.visibility = View.VISIBLE
                ivLeaves.animation = fadeAnim
                ivWood.animation = fadeAnim
                ivRakat.animation = lateBottomAnim
            }
            delay(THREE_SECONDS)

            binding.apply {
                ivLeaves.animation = shakyAnimation
            }
            delay(TWO_SECONDS)
            media.pause()

            // Intent to Main Activity
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}