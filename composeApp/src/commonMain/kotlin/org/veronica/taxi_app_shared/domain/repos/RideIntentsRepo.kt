package org.veronica.taxi_app_shared.domain.repos

import org.veronica.taxi_app_shared.domain.models.RideIntent

interface RideIntentsRepo {
    fun getUserRideIntent(userId: String): RideIntent?
    fun save(rideIntent: RideIntent)
}