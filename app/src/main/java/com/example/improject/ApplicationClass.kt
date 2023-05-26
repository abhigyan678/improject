package com.example.improject

import android.app.Application
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel.VERBOSE
import com.moengage.core.MoEngage
import com.moengage.core.config.LogConfig
import com.moengage.core.config.NotificationConfig
import com.moengage.core.enableAdIdTracking

class ApplicationClass:Application() {
    override fun onCreate() {
        super.onCreate()
        // Required initialization logic here!
        val moEngage = MoEngage.Builder(this, "1SCFO3OHU33EZUMDATWHJO36", DataCenter.DATA_CENTER_1)
            .configureNotificationMetaData(NotificationConfig(R.drawable.small_icon, R.drawable.small_icon))
            .configureLogs(LogConfig(level = VERBOSE))
            .build()
        MoEngage.initialiseDefaultInstance(moEngage)

        enableAdIdTracking(this)

    }


}