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

interface Logger {
    /** Log a verbose message with optional format args.  */
    fun v(message: String, vararg args: Any)

    /** Log a verbose exception and a message with optional format args.  */
    fun v(t: Throwable, message: String, vararg args: Any)

    /** Log a verbose exception.  */
    fun v(t: Throwable)

    /** Log a debug message with optional format args.  */
    fun d(message: String, vararg args: Any)

    /** Log a debug exception and a message with optional format args.  */
    fun d(t: Throwable, message: String, vararg args: Any)

    /** Log a debug exception.  */
    fun d(t: Throwable)

    /** Log an info message with optional format args.  */
    fun i(message: String, vararg args: Any)

    /** Log an info exception and a message with optional format args.  */
    fun i(t: Throwable, message: String, vararg args: Any)

    /** Log an info exception.  */
    fun i(t: Throwable)

    /** Log a warning message with optional format args.  */
    fun w(message: String, vararg args: Any)

    /** Log a warning exception and a message with optional format args.  */
    fun w(t: Throwable, message: String, vararg args: Any)

    /** Log a warning exception.  */
    fun w(t: Throwable)

    /** Log an error message with optional format args.  */
    fun e(message: String, vararg args: Any)

    /** Log an error exception and a message with optional format args.  */
    fun e(t: Throwable, message: String, vararg args: Any)

    /** Log an error exception.  */
    fun e(t: Throwable)

    /** Log an assert message with optional format args.  */
    fun wtf(message: String, vararg args: Any)

    /** Log an assert exception and a message with optional format args.  */
    fun wtf(t: Throwable, message: String, vararg args: Any)

    /** Log an assert exception.  */
    fun wtf(t: Throwable)
}
