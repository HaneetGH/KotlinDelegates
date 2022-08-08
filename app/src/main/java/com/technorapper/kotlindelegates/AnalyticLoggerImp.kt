package com.technorapper.kotlindelegates

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class AnalyticLoggerImp : AnalyticLogger, LifecycleEventObserver {
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_RESUME -> println("App Open")
            Lifecycle.Event.ON_PAUSE -> println("App Close")
            else -> println("App Other")

        }
    }
}