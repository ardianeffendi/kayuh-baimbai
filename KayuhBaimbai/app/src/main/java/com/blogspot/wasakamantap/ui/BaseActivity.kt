package com.blogspot.wasakamantap.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.wasakamantap.R

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
    fun touchImageIntentListener(view: View, activity: AppCompatActivity, backStack: Boolean) {
        view.setOnTouchListener { _, event ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    val intent = Intent(this, activity::class.java)
                    if (backStack) {
                        startActivity(intent)
                    } else {
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intent)
                        finish()
                    }
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
                    this.onBackPressed()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    /**
     * Custom touch view listener that destroys the app completely.
     * @param view a view to be clicked
     */
    fun destroyApp(view: View) {
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    playMedia()
                    return@setOnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    this.finishAffinity()
                    return@setOnTouchListener true
                }
                else -> return@setOnTouchListener false
            }
        }
    }

    fun playMedia() {
        if (media == null) {
            media = MediaPlayer.create(this, R.raw.click)
            media?.setOnCompletionListener {
                stopMedia()
            }
        }
        media?.start()
    }

    fun stopMedia() {
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