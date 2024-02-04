package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentDestinationUseCase
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentOriginUseCase

import org.veronica.taxi_app_shared.platform.composables.Route
import org.veronica.taxi_app_shared.platform.composables.calculateRoute

class RideViewModel(
    val updateRideIntentOriginUseCase: UpdateRideIntentOriginUseCase,
    val updateRideIntentDestinationUseCase: UpdateRideIntentDestinationUseCase,

    ) : ViewModel() {

    private val _originLocation: MutableStateFlow<LatLng?> = MutableStateFlow(null)
    val originLocation: StateFlow<LatLng?> = _originLocation.asStateFlow()

    private val _destinationLocation: MutableStateFlow<LatLng?> = MutableStateFlow(null)
    val destinationLocation: StateFlow<LatLng?> = _destinationLocation.asStateFlow()

    private val _route: MutableStateFlow<Route?> = MutableStateFlow(null)
    val route = _route.asStateFlow()

    fun updateOrigin(origin: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentOriginUseCase(origin)
            _originLocation.value = origin.location
            afterUpdate?.invoke()
            calculateRouteIfBothLocationsSelected()
        }
    }

    fun updateDestination(destination: FullAddress, afterUpdate: (() -> Unit)? = null) {
        viewModelScope.launch {
            updateRideIntentDestinationUseCase(destination)
            _destinationLocation.value = destination.location
            afterUpdate?.invoke()
            calculateRouteIfBothLocationsSelected()
        }
    }

    private fun calculateRouteIfBothLocationsSelected() {
        val origin = _originLocation.value
        val destination = _destinationLocation.value
        if (origin != null && destination != null) {
            viewModelScope.launch {
                val route = calculateRoute(
                    origin,
                    destination
                ) // Llama a la función calculateRoute del composable WaitingMap
                _route.value = route
            }
        }
    }

    // Esta función te permite calcular la ruta utilizando las coordenadas de origen y destino
    /*fun calculateRoute(origin: LatLng, destination: LatLng) {
        viewModelScope.launch {
            val route = calculateRouteUseCase.calculateRoute(origin, destination)
            _route.value = route
        }
    }*/


}
