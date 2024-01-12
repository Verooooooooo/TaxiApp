package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo

class SaveUserRideIntentUseCase(
    private val rideIntentsRepo: RideIntentsRepo
) {
    suspend operator fun invoke(rideIntent: RideIntent) {
        rideIntentsRepo.save(rideIntent)
    }
}