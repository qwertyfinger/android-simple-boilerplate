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
      val core = "1.0.0"
      val espresso = "3.1.0"
      val junit = "1.0.0"
      val rules = "1.1.0"
      val runner = "1.1.0"
      val truth = "1.0.0"
    }
  }

  object Gradle {
    val android = "3.2.1"
    val dexcount = "0.8.4"
    val fabric = "1.26.1"
    val google_services = "4.2.0"
    val play_publisher = "2.0.0-rc1"
  }

  val coroutines = "1.0.1"
  val crashlytics = "2.9.6"
  val dagger = "2.19"
  val firebase_core = "16.0.4"
  val firebase_perf = "16.2.0"
  val kotlin = "1.3.0"
  @Suppress("unused") val ktlint = "0.29.0"
  val leakcanary = "1.6.2"
  val material_design = "1.0.0"
  val mockito = "2.22.0" // Pinning this due to https://github.com/mockito/mockito/issues/1511
  val mockito_kotlin = "2.0.0"
  val robolectric = "4.0.1"
  val threetenabp = "1.1.1"
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
    val android =         "com.android.tools.build:gradle:${Versions.Gradle.android}"
    val dexcount =        "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${Versions.Gradle.dexcount}"
    val fabric =          "io.fabric.tools:gradle:${Versions.Gradle.fabric}"
    val google_services = "com.google.gms:google-services:${Versions.Gradle.google_services}"
    val kotlin =          "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val play_publisher =  "com.github.triplet.gradle:play-publisher:${Versions.Gradle.play_publisher}"
  }

  val coroutines =         "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
  val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
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
  val threetenabp =        "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"
  val timber =             "com.jakewharton.timber:timber:${Versions.timber}"
}