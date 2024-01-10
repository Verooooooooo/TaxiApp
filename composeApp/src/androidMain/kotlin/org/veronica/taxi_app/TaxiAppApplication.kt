package org.veronica.taxi_app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.veronica.taxi_app_shared.core.di.initKoin

class TaxiAppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@TaxiAppApplication)
        }
    }
}