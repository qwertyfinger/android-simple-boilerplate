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

package com.qwertyfinger.androidsimpleboilerplate

import android.app.Application
import com.qwertyfinger.androidsimpleboilerplate.appinitializer.AppInitializers
import com.qwertyfinger.androidsimpleboilerplate.inject.AppComponent
import com.qwertyfinger.androidsimpleboilerplate.inject.DaggerAppComponent
import com.qwertyfinger.androidsimpleboilerplate.util.isRobolectricBuild
import com.squareup.leakcanary.LeakCanary
import javax.inject.Inject

lateinit var injector: AppComponent
  private set

class SimpleBoilerplateApp : Application() {
  @Inject lateinit var initializers: AppInitializers

  override fun onCreate() {
    super.onCreate()
    if (!isRobolectricBuild() && LeakCanary.isInAnalyzerProcess(this)) return
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
