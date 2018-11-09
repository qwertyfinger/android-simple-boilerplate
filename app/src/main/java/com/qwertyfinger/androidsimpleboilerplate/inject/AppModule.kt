package com.qwertyfinger.androidsimpleboilerplate.inject

import android.app.Application
import android.content.Context
import com.qwertyfinger.androidsimpleboilerplate.main.MainComponent
import dagger.Binds
import dagger.Module

@Module(subcomponents = [(MainComponent::class)])
abstract class AppModule {
  @Binds
  abstract fun provideContext(application: Application): Context
}