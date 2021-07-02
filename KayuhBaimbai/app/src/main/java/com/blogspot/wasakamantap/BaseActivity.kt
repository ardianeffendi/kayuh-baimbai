package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Base Activity Class
 * @author Ardian Maulana Effendi <b>ardian.effendi21@gmail.com</b>
 * @see AppCompatActivity
 */
@SuppressLint("ClickableViewAccessibility")
abstract class BaseActivity : AppCompatActivity() {

    protected var media: MediaPlayer? = null

    /**
     * Custom Image Touch Listener that provides
     * an intent to a called activity and sound effect.
     *
     * @param view a view to be clicked
     * @param activity activity destination
     */
    fun touchImageListener(view: View, activity: AppCompatActivity) {
        view.setOnTouchListener { _, event ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    stopMedia()
                    val intent = Intent(this, activity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    /**
     * Custom Touch Listener for going back to previous screen
     * @param view a view to be clicked
     */
    fun touchBackListener(view: View) {
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    stopMedia()
                    this.onBackPressed()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    fun destroyApp(view: View) {
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    stopMedia()
                    finish()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    private fun playMedia() {
        if (media == null) {
            media = MediaPlayer.create(this, R.raw.click)
            media?.setOnCompletionListener {
                stopMedia()
            }
        }
        media?.start()
    }

    private fun stopMedia() {
        media?.let {
            it.release()
            media = null
        }
    }

    override fun onStop() {
        super.onStop()
        stopMedia()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }

}