package org.veronica.taxi_app_shared.core.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import org.veronica.taxi_app_shared.core.http.initHttpClient


val appModule = module {
    single { initHttpClient() }
}

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(appModule)
    }
}

fun initKoin() = initKoin {}