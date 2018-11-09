package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application

interface AppInitializer {
  fun init(application: Application)
}