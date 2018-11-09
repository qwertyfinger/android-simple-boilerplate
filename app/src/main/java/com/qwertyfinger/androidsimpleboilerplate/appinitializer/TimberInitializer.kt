package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application
import com.qwertyfinger.androidsimpleboilerplate.BuildConfig
import com.qwertyfinger.androidsimpleboilerplate.util.TimberLogger
import javax.inject.Inject

class TimberInitializer @Inject constructor(
  private val timberLogger: TimberLogger
) : AppInitializer {
  override fun init(application: Application) = timberLogger.setup(BuildConfig.DEBUG)
}