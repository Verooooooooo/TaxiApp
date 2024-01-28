package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentDestinationUseCase

class DestinationPickerViewModel(
    private val updateRideIntentDestinationUseCase: UpdateRideIntentDestinationUseCase
) : ViewModel() {

    private val _destinationLocation = MutableLiveData<LatLng>()
    val destinationLocation: LiveData<LatLng> = _destinationLocation

    fun updateDestination(destination: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentDestinationUseCase(destination)
            _destinationLocation.value = destination.location
            afterUpdate?.invoke()
        }
    }
}