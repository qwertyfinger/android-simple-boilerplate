package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import javax.inject.Inject

class LeakCanaryInitializer @Inject constructor() : AppInitializer {
  override fun init(application: Application) {
    if (LeakCanary.isInAnalyzerProcess(application)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return
    }
    LeakCanary.install(application)
  }
}