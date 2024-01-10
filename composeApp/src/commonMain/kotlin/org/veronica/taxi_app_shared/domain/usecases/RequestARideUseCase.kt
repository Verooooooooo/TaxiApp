package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.RideRequest

class RequestARideUseCase {
    suspend operator fun invoke(
        request: RideRequest
    ) {
        println("Request a ride use case invoked")
        println(request)
    }
}