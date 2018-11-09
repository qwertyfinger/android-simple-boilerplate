package com.qwertyfinger.androidsimpleboilerplate

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.qwertyfinger.androidsimpleboilerplate.util.KEY_TIMESTAMP
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

class SimpleBoilerplateApp : Application() {

  override fun onCreate() {
    super.onCreate()
    setupLeakCanary()
    setupTimber()
    setupUncaughtExceptionInterceptor()
  }

  private fun setupLeakCanary() {
    if (LeakCanary.isInAnalyzerProcess(this)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return
    }
    LeakCanary.install(this)
  }

  private fun setupTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(Timber.DebugTree())
    }
  }

  private fun setupUncaughtExceptionInterceptor() {
    val defaultHandler: Thread.UncaughtExceptionHandler =
      Thread.getDefaultUncaughtExceptionHandler()

    Thread.setDefaultUncaughtExceptionHandler { thread, exception ->
      try {
        Crashlytics.setLong(KEY_TIMESTAMP, System.currentTimeMillis())
      } finally {
        defaultHandler.uncaughtException(thread, exception)
      }
    }
  }
}