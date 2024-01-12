package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo

class GetUserRideIntentUseCase(
    private val rideIntentsRepo: RideIntentsRepo
) {
    suspend operator fun invoke(): RideIntent {
        val testUser = "test_user"

        return rideIntentsRepo.getUserRideIntent(testUser) ?: RideIntent(
            id = testUser,
            origin = null,
            destination = null,
            price = 0.0,
            useSuggestedPrice = false,
            suggestedPrice = 0.0,
            comment = ""
        );
    }
}