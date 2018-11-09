package com.qwertyfinger.androidsimpleboilerplate.main

import com.qwertyfinger.androidsimpleboilerplate.inject.scope.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [(MainModule::class)])
interface MainComponent {

  fun inject(activity: MainActivity)

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance fun activity(activity: MainActivity): Builder
    fun build(): MainComponent
  }

}