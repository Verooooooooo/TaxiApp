package org.veronica.taxi_app_shared.core.db.adapters

import app.cash.sqldelight.ColumnAdapter


val doubleToFloatAdapter = object : ColumnAdapter<Float, Double> {
    override fun decode(databaseValue: Double): Float {
        return databaseValue.toFloat()
    }

    override fun encode(value: Float): Double {
        return value.toDouble()
    }
}