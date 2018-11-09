package com.qwertyfinger.androidsimpleboilerplate.appinitializer

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.qwertyfinger.androidsimpleboilerplate.util.AppCoroutineDispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.threeten.bp.zone.ZoneRulesProvider
import javax.inject.Inject

class ThreeTenBpInitializer @Inject constructor(
    private val dispatchers: AppCoroutineDispatchers
) : AppInitializer {
    override fun init(application: Application) {
        // Init ThreeTenABP
        AndroidThreeTen.init(application)

        // Query the ZoneRulesProvider so that it is loaded on a background coroutine
        GlobalScope.launch(dispatchers.io) {
            ZoneRulesProvider.getAvailableZoneIds()
        }
    }
}