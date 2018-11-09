package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application
import android.os.Looper
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

// Used to improve UI performance when using AndroidSchedulers.
// See https://medium.com/@sweers/rxandroids-new-async-api-4ab5b3ad3e93
class RxAndroidInitializer @Inject constructor() : AppInitializer {
    override fun init(application: Application) {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler {
            AndroidSchedulers.from(Looper.getMainLooper(), true)
        }
    }
}