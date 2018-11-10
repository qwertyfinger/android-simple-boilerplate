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

import android.app.Application
import android.content.Context
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.AppInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.CrashHandlerInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.LeakCanaryInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.RxAndroidInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.ThreeTenBpInitializer
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.TimberInitializer
import com.qwertyfinger.androidsimpleboilerplate.util.Logger
import com.qwertyfinger.androidsimpleboilerplate.util.TimberLogger
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.multibindings.IntoSet

@Module
abstract class AppModuleBinds {
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
  abstract fun provideRxAndroidInitializer(bind: RxAndroidInitializer): AppInitializer

  @Binds
  @IntoSet
  abstract fun provideThreeTenBpInitializer(bind: ThreeTenBpInitializer): AppInitializer

  @Binds
  @IntoSet
  abstract fun provideTimberInitializer(bind: TimberInitializer): AppInitializer
}