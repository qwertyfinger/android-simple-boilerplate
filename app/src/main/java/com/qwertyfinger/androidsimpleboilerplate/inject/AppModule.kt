package com.qwertyfinger.androidsimpleboilerplate.inject

import com.qwertyfinger.androidsimpleboilerplate.inject.scope.PerApplication
import com.qwertyfinger.androidsimpleboilerplate.main.MainComponent
import com.qwertyfinger.androidsimpleboilerplate.util.AppCoroutineDispatchers
import com.qwertyfinger.androidsimpleboilerplate.util.AppRxSchedulers
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.rx2.asCoroutineDispatcher

@Module(includes = [(AppModuleBinds::class)], subcomponents = [(MainComponent::class)])
object AppModule {
  @JvmStatic
  @PerApplication
  @Provides
  fun provideRxSchedulers(): AppRxSchedulers = AppRxSchedulers(
      io = Schedulers.io(),
      computation = Schedulers.computation(),
      main = AndroidSchedulers.mainThread()
  )

  @JvmStatic
  @PerApplication
  @Provides
  fun provideCoroutineDispatchers(schedulers: AppRxSchedulers) = AppCoroutineDispatchers(
      io = schedulers.io.asCoroutineDispatcher(),
      computation = schedulers.computation.asCoroutineDispatcher(),
      main = Dispatchers.Main
  )
}