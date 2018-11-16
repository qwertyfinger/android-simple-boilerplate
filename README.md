# Android Simple Boilerplate
Provides a convenient **basic start-off point** for all your new Android projects.

Tries to employ the best tools and practices.  
It **does not** contain any architectural patterns or solutions.

It draws inspiration from Chris Banes's [Tivi](https://github.com/chrisbanes/tivi) but adds many customizations and optimizations.

>***Note:*** the project is Kotlin-based and is not designed to be Java-friendly.

### Things included
- **Gradle setup** with all its little quirks
- buildSrc module with Gradle Kotlin DSL. It provides autocomplete and other niceties in managing Gradle dependencies
- **CI/CD** with automated Unit/Robolectric tests, Firebase Test Lab integration, and Play Store publishing
- **Static code analysis**
- **Crash reporting** via Crashlytics
- Firebase Performance Monitoring
- Simple Dagger2 setup

## Usage
For detailed instructions on how to configure this template project for you, see [Wiki](https://github.com/qwertyfinger/android-simple-boilerplate/wiki).

## Tools that are used
### Build process
- [CircleCI](https://circleci.com/product/) for continuous integration
- [Gradle Play Publisher](https://github.com/Triple-T/gradle-play-publisher) for continuous delivery
- [Spotless](https://github.com/diffplug/spotless/tree/master/plugin-gradle) + [ktlint](https://github.com/shyiko/ktlint) to enforce code formatting and styling
- [Gradle Versions Plugin](https://github.com/ben-manes/gradle-versions-plugin) to automatically check for new versions of your dependencies
- [Dexcount Gradle Plugin](https://github.com/KeepSafe/dexcount-gradle-plugin) to keep track of app's method count

### Integrations
- [Crashlytics](https://firebase.google.com/docs/crashlytics/) for crash reporting
- [Firebase Performance Monitoring](https://firebase.google.com/docs/perf-mon/) to gain insights into your app's performance

### Testing
- [Espresso](https://developer.android.com/training/testing/espresso/) for UI tests
- [Robolectric](https://github.com/robolectric/robolectric) to run all tests (including Espresso-based) on a local JVM

### Libraries
- [LeakCanary](https://github.com/square/leakcanary) to detect memory leaks
- [Dagger2](https://github.com/google/dagger) for dependency injection
- [RxJava](https://github.com/ReactiveX/RxJava) + [RxKotlin](https://github.com/ReactiveX/RxKotlin/) + [RxAndroid](https://github.com/ReactiveX/RxAndroid/) + [Coroutines](https://github.com/kotlin/kotlinx.coroutines/) for asynchronous programming
- [rxlint](https://bitbucket.org/littlerobots/rxlint) for Lint-checking RxJava code
- [Timber](https://github.com/JakeWharton/timber) for logging
- [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP) + [ThreeTenBP](https://github.com/ThreeTen/threetenbp) to use Java 8 Time and Data API

### Included but not used
- [Android KTX](https://developer.android.com/kotlin/ktx) for more pleasant usage of Android APIs with Kotlin extension functions
- [Material Design](https://github.com/material-components/material-components-android) to use components from Material Design guidance
- [Mockito](https://github.com/mockito/mockito) to mock dependencies
- [Mockito-Kotlin](https://github.com/nhaarman/mockito-kotlin) to provide more idiomatic usage of Mockito in Kotlin
- [Lifecycles](https://developer.android.com/topic/libraries/architecture/lifecycle) from Android Jetpack to manage Activity and Fragment lifecycles

## Contributing
All contributions in form of issues or pull requests are welcome.  
You should create an issue first if you want to introduce a significant change.

## License
### Project License
```
MIT License

Copyright (c) 2018 Andrii Chubko

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

### Third-party Licenses
Third-party licenses are included in [LICENSE-3RD-PARTY](https://github.com/qwertyfinger/android-simple-boilerplate/blob/master/LICENSE-3RD-PARTY).
