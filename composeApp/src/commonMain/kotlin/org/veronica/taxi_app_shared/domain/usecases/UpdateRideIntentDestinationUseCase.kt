package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo


class UpdateRideIntentDestinationUseCase(
    private val rideIntentsRepo: RideIntentsRepo,
) {
    suspend operator fun invoke(destination: FullAddress) {
        val currentRideIntent =
            rideIntentsRepo.getUserRideIntent("test_user") ?: RideIntent.new("test_user")
        rideIntentsRepo.save(
            currentRideIntent.copy(
                destination = destination
            )
        )
    }
}