package org.veronica.taxi_app_shared.platform.di

import dev.icerock.moko.geo.LocationTracker
import dev.icerock.moko.permissions.PermissionsController
import org.koin.dsl.module
import org.veronica.taxi_app_shared.platform.db.DriverFactory


actual val platformModule = module {
    single {
        DriverFactory(get())
    }
    single {
        PermissionsController(
            applicationContext = get()
        )
    }
    single {
        LocationTracker(
            permissionsController = get(),
        )
    }
}