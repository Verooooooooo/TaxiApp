package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentOriginUseCase

class OriginPickerViewModel(
    private val updateRideIntentOriginUseCase: UpdateRideIntentOriginUseCase
) : ViewModel() {

    private val _originLocation = MutableLiveData<LatLng>()
    val originLocation: LiveData<LatLng> = _originLocation

    fun updateOrigin(origin: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentOriginUseCase(origin)
            _originLocation.value = origin.location
            afterUpdate?.invoke()
        }
    }
}