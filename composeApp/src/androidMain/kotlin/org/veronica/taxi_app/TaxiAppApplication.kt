package org.veronica.taxi_app

import android.app.Application
import core.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class TaxiAppApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@TaxiAppApplication)
        }
    }
}