package com.technorapper.kotlindelegates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), AnalyticLogger by AnalyticLoggerImp(),
    DeeplinkHandler by DeeplinkHandlerImp() {

    private val obj by lazy {
        println("Hello")
        3
    }

    private val obj1 by MyLazy {
        println("Hello")
        4
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerLifecycleOwner(this)
        println(obj)
        println(obj1)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleDeepLink(intent)
        handleDeepLink(this, intent)
    }
}
