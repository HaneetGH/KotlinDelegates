package com.technorapper.kotlindelegates

import android.content.Intent

interface DeeplinkHandler {
    fun handleDeepLink(intent: Intent?)
}