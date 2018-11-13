/*
 * MIT License
 *
 * Copyright (c) 2018 Andrii Chubko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
