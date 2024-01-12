package org.veronica.taxi_app_shared.platform.di

import org.koin.dsl.module
import org.veronica.taxi_app_shared.platform.db.DriverFactory


actual val platformModule = module {
    single {
        DriverFactory(get())
    }
}