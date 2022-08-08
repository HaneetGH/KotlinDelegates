package com.technorapper.kotlindelegates

import androidx.lifecycle.LifecycleOwner

interface AnalyticLogger {
    fun registerLifecycleOwner(owner: LifecycleOwner)
}