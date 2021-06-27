package com.blogspot.wasakamantap

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.utils.mediaPlayer

/**
 * Base Activity Class
 * @author Ardian Maulana Effendi <b>ardian.effendi21@gmail.com</b>
 * @see AppCompatActivity
 */
@SuppressLint("ClickableViewAccessibility")
abstract class BaseActivity : AppCompatActivity() {

    /**
     * Custom Image Touch Listener that provides
     * an intent to a called activity and sound effect.
     *
     * @param view a view to be clicked
     * @param activity activity destination
     */
    fun touchImageListener(view: View, activity: AppCompatActivity) {
        val media = MediaPlayer.create(this, R.raw.click)
        view.setOnTouchListener { _, event ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    val intent = Intent(this, activity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    media.stop()
                    media.release()
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
            val media = mediaPlayer(this, R.raw.click)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    media.start()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    this.onBackPressed()
                    media.stop()
                    media.release()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}