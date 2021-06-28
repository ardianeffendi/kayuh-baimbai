package com.blogspot.wasakamantap.opening

import android.animation.ObjectAnimator
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.MainScreen
import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.databinding.ActivitySplashScreenBinding
import com.blogspot.wasakamantap.utils.ConvenienceAnimationListener
import com.blogspot.wasakamantap.utils.hideStatusBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var media: MediaPlayer
    private lateinit var click: MediaPlayer

    // Animation Variables
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var fadeAnim: Animation
    private lateinit var fadeAnim2: Animation
    private lateinit var lateBottomAnim: Animation
    private lateinit var shakyAnimation: Animation

    companion object {
        private const val TEN_SECONDS = 10000L
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
        fadeAnim2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2)
        shakyAnimation = AnimationUtils.loadAnimation(this, R.anim.shaky_animation)

        hideStatusBar(this)

        /**
         * Progress Bar Animation
         */
        binding.progressBar.max = 1000
        val currProgress = 1000
        ObjectAnimator.ofInt(binding.progressBar, "progress", currProgress)
            .setDuration(TEN_SECONDS)
            .start()

        // Create media player to play audio during splash screen
        media = MediaPlayer.create(this, R.raw.panting)
        media.start()

        // animation for main part
        binding.apply {
            ivKayuh.animation = topAnim
            ivAcc.animation = topAnim
            ivBaimbai.animation = bottomAnim
        }

        topAnim.setAnimationListener(object : ConvenienceAnimationListener() {
            override fun onAnimationEnd(animation: Animation?) {
                // animation after half duration of splash screen
                binding.apply {
                    ivRakat.visibility = View.VISIBLE
                    ivLeaves.visibility = View.VISIBLE
                    ivWood.visibility = View.VISIBLE
                    ivLine.visibility = View.VISIBLE
                    ivLine.animation = fadeAnim
                    ivWood.animation = fadeAnim
                    ivLeaves.animation = fadeAnim
                    ivRakat.animation = lateBottomAnim
                }
            }
        })

        fadeAnim.setAnimationListener(object : ConvenienceAnimationListener() {
            override fun onAnimationEnd(animation: Animation?) {
                binding.ivLeaves.animation = shakyAnimation
                binding.button.visibility = View.VISIBLE
                binding.button.animation = fadeAnim2
            }
        })

        /**
         * Button "Mulai" is clicked
         */
        binding.button.setOnClickListener {
            click = MediaPlayer.create(this, R.raw.click)
            click.start()

            // Intent to Main Activity
            val intent = Intent(this@SplashScreen, MainScreen::class.java)
            startActivity(intent)

            media.release()
            finish()
        }
    }

    override fun onStop() {
        super.onStop()
        click.release()
        media.release()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        click.release()
        finish()
    }
}