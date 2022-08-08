package com.technorapper.kotlindelegates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), AnalyticLogger by AnalyticLoggerImp(),
    DeeplinkHandler by DeeplinkHandlerImp() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerLifecycleOwner(this)

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleDeepLink(intent)
        handleDeepLink(this, intent)
    }
}
