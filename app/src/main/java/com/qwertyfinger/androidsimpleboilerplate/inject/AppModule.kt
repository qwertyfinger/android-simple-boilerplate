package com.qwertyfinger.androidsimpleboilerplate.inject

import android.app.Application
import android.content.Context
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.AppInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.CrashHandlerInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.LeakCanaryInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.TimberInitializer
import com.qwertyfinger.androidsimpleboilerplate.main.MainComponent
import com.qwertyfinger.androidsimpleboilerplate.util.Logger
import com.qwertyfinger.androidsimpleboilerplate.util.TimberLogger
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.multibindings.IntoSet

@Module(subcomponents = [(MainComponent::class)])
abstract class AppModule {
  @Binds
  abstract fun provideContext(application: Application): Context

  @Reusable
  @Binds
  abstract fun provideLogger(bind: TimberLogger): Logger

  @Binds
  @IntoSet
  abstract fun provideCrashHandlerInitializer(bind: CrashHandlerInitializer): AppInitializer

  @Binds
  @IntoSet
  abstract fun provideLeakCanaryInitializer(bind: LeakCanaryInitializer): AppInitializer

  @Binds
  @IntoSet
  abstract fun provideTimberInitializer(bind: TimberInitializer): AppInitializer
}