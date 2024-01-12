package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentOriginUseCase

class OriginPickerViewModel(
    private val updateRideIntentOriginUseCase: UpdateRideIntentOriginUseCase
) : ViewModel() {
    fun updateOrigin(origin: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentOriginUseCase(
                origin = origin
            )
            afterUpdate?.invoke()
        }
    }
}