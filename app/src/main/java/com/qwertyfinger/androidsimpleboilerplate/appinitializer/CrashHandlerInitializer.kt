package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.qwertyfinger.androidsimpleboilerplate.util.KEY_TIMESTAMP
import javax.inject.Inject

class CrashHandlerInitializer @Inject constructor() : AppInitializer {
  override fun init(application: Application) {
    val defaultHandler: Thread.UncaughtExceptionHandler =
      Thread.getDefaultUncaughtExceptionHandler()

    Thread.setDefaultUncaughtExceptionHandler { thread, exception ->
      try {
        // Log some relevant information to Crashlytics
        Crashlytics.setLong(KEY_TIMESTAMP, System.currentTimeMillis())
      } finally {
        defaultHandler.uncaughtException(thread, exception)
      }
    }
  }
}