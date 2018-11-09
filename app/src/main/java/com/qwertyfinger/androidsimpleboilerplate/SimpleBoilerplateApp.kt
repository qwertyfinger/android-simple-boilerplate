package com.qwertyfinger.androidsimpleboilerplate

import android.app.Application
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.AppInitializers
import com.qwertyfinger.androidsimpleboilerplate.inject.AppComponent
import com.qwertyfinger.androidsimpleboilerplate.inject.DaggerAppComponent
import javax.inject.Inject

lateinit var injector : AppComponent
  private set

class SimpleBoilerplateApp : Application() {
  @Inject lateinit var initializers: AppInitializers

  override fun onCreate() {
    super.onCreate()
    injectAppComponent()
    initializers.init(this)
  }

  private fun injectAppComponent() {
    injector = DaggerAppComponent
        .builder()
        .application(this)
        .build()
    injector.inject(this)
  }
}