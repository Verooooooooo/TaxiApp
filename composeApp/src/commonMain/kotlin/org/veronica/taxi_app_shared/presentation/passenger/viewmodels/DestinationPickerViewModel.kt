package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentDestinationUseCase

class DestinationPickerViewModel(
    private val updateRideIntentDestinationUseCase: UpdateRideIntentDestinationUseCase
) : ViewModel() {
    fun updateDestination(destination: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentDestinationUseCase(
                destination = destination
            )
            afterUpdate?.invoke()
        }
    }
}