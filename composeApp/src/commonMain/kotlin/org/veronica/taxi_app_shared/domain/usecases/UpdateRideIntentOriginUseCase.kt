package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.OriginPickerViewModel


class UpdateRideIntentOriginUseCase(
    val rideIntentsRepo: RideIntentsRepo,
    private val originPickerViewModel: OriginPickerViewModel
) {
    var selectedOriginCoordinates: FullAddress? = null
        private set

    suspend operator fun invoke(origin: FullAddress) {
        val currentRideIntent =
            rideIntentsRepo.getUserRideIntent("test_user") ?: RideIntent.new("test_user")
        rideIntentsRepo.save(
            currentRideIntent.copy(
                origin = origin
            )
        )
        // Actualiza las coordenadas en el ViewModel
        originPickerViewModel.updateOrigin(origin)
    }
}