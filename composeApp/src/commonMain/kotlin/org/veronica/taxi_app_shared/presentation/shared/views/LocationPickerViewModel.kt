package org.veronica.taxi_app_shared.presentation.shared.views

import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.usecases.ReverseGeocodeLocationUseCase


data class LocationPickerState(
    val selectedLocation: LatLng? = null, val selectedLocationName: String? = null
)

class LocationPickerViewModel(
    private val reverseGeocodeLocationUseCase: ReverseGeocodeLocationUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(LocationPickerState())
    val state = _state.asStateFlow()


    fun selectLocation(
        location: LatLng
    ) {
        viewModelScope.launch {
            val address = reverseGeocodeLocationUseCase.invoke(location)

            _state.update {
                it.copy(
                    selectedLocation = location,
                    selectedLocationName = address ?: "Direccion desconocida"
                )
            }
        }


    }


}

