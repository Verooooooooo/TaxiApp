package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.DestinationPickerViewModel


class UpdateRideIntentDestinationUseCase(
    private val rideIntentsRepo: RideIntentsRepo,
    private val destinationPickerViewModel: DestinationPickerViewModel

) {

    // Variable para almacenar las coordenadas de destino
    var selectedDestinationCoordinates: FullAddress? = null
        private set
    suspend operator fun invoke(destination: FullAddress) {
        val currentRideIntent =
            rideIntentsRepo.getUserRideIntent("test_user") ?: RideIntent.new("test_user")
        rideIntentsRepo.save(
            currentRideIntent.copy(
                destination = destination
            )
        )
        // Actualiza las coordenadas en el ViewModel
        destinationPickerViewModel.updateDestination(destination)
    }
}