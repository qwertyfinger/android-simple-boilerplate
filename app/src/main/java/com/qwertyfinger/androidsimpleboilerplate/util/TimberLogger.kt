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

package com.qwertyfinger.androidsimpleboilerplate.util

import timber.log.Timber
import javax.inject.Inject

class TimberLogger @Inject constructor() : Logger {
    fun setup(debugMode: Boolean) {
        if (debugMode) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun v(message: String, vararg args: Any) = Timber.v(message, args)

    override fun v(t: Throwable, message: String, vararg args: Any) = Timber.v(t, message, args)

    override fun v(t: Throwable) = Timber.v(t)

    override fun d(message: String, vararg args: Any) = Timber.d(message, args)

    override fun d(t: Throwable, message: String, vararg args: Any) = Timber.d(t, message, args)

    override fun d(t: Throwable) = Timber.d(t)

    override fun i(message: String, vararg args: Any) = Timber.i(message, args)

    override fun i(t: Throwable, message: String, vararg args: Any) = Timber.i(t, message, args)

    override fun i(t: Throwable) = Timber.i(t)

    override fun w(message: String, vararg args: Any) = Timber.w(message, args)

    override fun w(t: Throwable, message: String, vararg args: Any) = Timber.w(t, message, args)

    override fun w(t: Throwable) = Timber.w(t)

    override fun e(message: String, vararg args: Any) = Timber.e(message, args)

    override fun e(t: Throwable, message: String, vararg args: Any) = Timber.e(t, message, args)

    override fun e(t: Throwable) = Timber.e(t)

    override fun wtf(message: String, vararg args: Any) = Timber.wtf(message, args)

    override fun wtf(t: Throwable, message: String, vararg args: Any) = Timber.wtf(t, message, args)

    override fun wtf(t: Throwable) = Timber.wtf(t)
}