package com.technorapper.kotlindelegates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

interface DeeplinkHandler {
    fun handleDeepLink(intent: Intent?)
    fun handleDeepLink(activity: AppCompatActivity, intent: Intent?)
}