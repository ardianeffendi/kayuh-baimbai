package com.blogspot.wasakamantap

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

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        lateBottomAnim = AnimationUtils.loadAnimation(this, R.anim.late_bottom_animation)
        fadeAnim = AnimationUtils.loadAnimation(this, R.anim.fading_animation)
        shakyAnimation = AnimationUtils.loadAnimation(this, R.anim.shaky_animation)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

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
                ivWood.animation = shakyAnimation
            }
            delay(4000)

            // animation after half duration of splash screen
            binding.apply {
                ivRakat.visibility = View.VISIBLE
                ivLeaves.visibility = View.VISIBLE
                ivLeaves.animation = fadeAnim
                ivRakat.animation = lateBottomAnim
            }
            delay(4000)
            media.pause()

            // Intent to Main Activity
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}