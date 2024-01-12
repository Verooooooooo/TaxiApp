package org.veronica.taxi_app_shared.platform.db

import app.cash.sqldelight.db.SqlDriver
import org.veronica.taxiapp.db.AppDatabase


expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): AppDatabase {
    val driver = driverFactory.createDriver()

    return AppDatabase(
        driver = driver,
    );
}