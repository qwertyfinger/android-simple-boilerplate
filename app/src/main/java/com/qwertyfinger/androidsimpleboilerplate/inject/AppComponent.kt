package com.qwertyfinger.androidsimpleboilerplate.inject

import android.app.Application
import android.content.Context
import com.qwertyfinger.androidsimpleboilerplate.SimpleBoilerplateApp
import com.qwertyfinger.androidsimpleboilerplate.inject.scope.PerApplication
import com.qwertyfinger.androidsimpleboilerplate.main.MainComponent
import dagger.BindsInstance
import dagger.Component

@PerApplication
@Component(modules = [(AppModule::class)])
interface AppComponent {

  fun inject(application: SimpleBoilerplateApp)

  fun appContext(): Context

  fun mainComponentBuilder(): MainComponent.Builder

  @Component.Builder
  interface Builder {
    @BindsInstance fun application(application: Application): Builder
    fun build(): AppComponent
  }
}