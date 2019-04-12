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

@file:Suppress("MayBeConstant")

package buildsrc

@Suppress("unused")
object BuildConfig {
  val buildTools = "28.0.3"
  val minSdk = 17
  val targetSdk = 28
  val compileSdk = 28
}

object Versions {

  object AndroidX {
    val appcompat = "1.0.2"
    val constraint_layout = "1.1.3"
    val core_ktx = "1.0.1"
    val lifecycle = "2.0.0"
    val recyclerview = "1.0.0"

    object Test {
      val core = "1.1.0"
      val espresso = "3.1.1"
      val junit = "1.1.0"
      val rules = "1.1.1"
      val runner = "1.1.1"
      val truth = "1.1.0"
    }
  }

  object Gradle {
    val android = "3.4.0-rc03"
    val dexcount = "0.8.6"
    val fabric = "1.28.1"
    val firebase_plugins = "1.2.0"
    val google_services = "4.2.0"
  }

  val coroutines = "1.1.1"
  val crashlytics = "2.9.9"
  val dagger = "2.22.1"
  val firebase_core = "16.0.8"
  val firebase_perf = "16.2.4"
  val kotlin = "1.3.30"
  @Suppress("unused") val ktlint = "0.31.0"
  val leakcanary = "1.6.3"
  val material_design = "1.0.0"
  val mockito = "2.22.0" // Pinning this due to https://github.com/mockito/mockito/issues/1511
  val mockito_kotlin = "2.1.0"
  val robolectric = "4.2.1"
  val rxandroid = "2.1.1"
  val rxjava = "2.2.7"
  val rxkotlin = "2.3.0"
  val rxlint = "1.7.3"
  val threetenabp = "1.2.0"
  val threetenbp = "1.3.8"
  val timber = "4.7.1"
}

@Suppress("unused")
object Libraries {

  object AndroidX {
    val appcompat =            "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    val constraint_layout =    "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraint_layout}"
    val core_ktx =             "androidx.core:core-ktx:${Versions.AndroidX.core_ktx}"
    val lifecycle_compiler =   "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifecycle}"
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.lifecycle}"
    val lifecycle_test =       "androidx.arch.core:core-testing:${Versions.AndroidX.lifecycle}"
    val recyclerview =         "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"

    object Test {
      val core =          "androidx.test:core:${Versions.AndroidX.Test.core}"
      val espresso_core = "androidx.test.espresso:espresso-core:${Versions.AndroidX.Test.espresso}"
      val junit =         "androidx.test.ext:junit:${Versions.AndroidX.Test.junit}"
      val rules =         "androidx.test:rules:${Versions.AndroidX.Test.rules}"
      val runner =        "androidx.test:runner:${Versions.AndroidX.Test.runner}"
      val truth =         "androidx.test.ext:truth:${Versions.AndroidX.Test.truth}"
    }
  }

  object Gradle {
    val android =          "com.android.tools.build:gradle:${Versions.Gradle.android}"
    val dexcount =         "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${Versions.Gradle.dexcount}"
    val fabric =           "io.fabric.tools:gradle:${Versions.Gradle.fabric}"
    val firebase_plugins = "com.google.firebase:firebase-plugins:${Versions.Gradle.firebase_plugins}"
    val google_services =  "com.google.gms:google-services:${Versions.Gradle.google_services}"
    val kotlin =           "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  }

  val coroutines =         "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
  val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
  val coroutines_rx =      "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.coroutines}"
  val crashlytics =        "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
  val dagger =             "com.google.dagger:dagger:${Versions.dagger}"
  val dagger_compiler =    "com.google.dagger:dagger-compiler:${Versions.dagger}"
  val firebase_core =      "com.google.firebase:firebase-core:${Versions.firebase_core}"
  val firebase_perf =      "com.google.firebase:firebase-perf:${Versions.firebase_perf}"
  val kotlin =             "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  val leakcanary =         "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"
  val leakcanary_no_op =   "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakcanary}"
  val material_design =    "com.google.android.material:material:${Versions.material_design}"
  val mockito =            "org.mockito:mockito-core:${Versions.mockito}"
  val mockito_android =    "org.mockito:mockito-android:${Versions.mockito}"
  val mockito_kotlin =     "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockito_kotlin}"
  val robolectric =        "org.robolectric:robolectric:${Versions.robolectric}"
  val rxandroid =          "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
  val rxjava =             "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
  val rxkotlin =           "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
  val rxlint =             "nl.littlerobots.rxlint:rxlint:${Versions.rxlint}"
  val threetenabp =        "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"
  val threetenbp =         "org.threeten:threetenbp:${Versions.threetenbp}:no-tzdb"
  val timber =             "com.jakewharton.timber:timber:${Versions.timber}"
}