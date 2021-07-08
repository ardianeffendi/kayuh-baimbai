package com.blogspot.wasakamantap.utils

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager

fun hideStatusBar(activity: Activity) {
    // Hide Status Bar
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        activity.window.insetsController?.hide(WindowInsets.Type.statusBars())
    } else {
        activity.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}

fun shrinkAndGrowAnim(view: View) : ObjectAnimator {
    val scaleDown = ObjectAnimator.ofPropertyValuesHolder(
        view,
        PropertyValuesHolder.ofFloat("scaleX", 0.5f),
        PropertyValuesHolder.ofFloat("scaleY", 0.5f)
    )
    scaleDown.duration = 2000
    scaleDown.repeatMode = ValueAnimator.REVERSE
    scaleDown.repeatCount = ValueAnimator.INFINITE

    return scaleDown
}