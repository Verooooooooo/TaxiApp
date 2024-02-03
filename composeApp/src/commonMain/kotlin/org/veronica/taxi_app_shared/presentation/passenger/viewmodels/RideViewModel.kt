package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
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

    private val _originLocation = MutableLiveData<LatLng>()
    val originLocation: LiveData<LatLng> = _originLocation

    private val _destinationLocation = MutableLiveData<LatLng>()
    val destinationLocation: LiveData<LatLng> = _destinationLocation

    private val _route = MutableLiveData<Route>()
    val route: LiveData<Route> = _route

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
                val route = calculateRoute(origin, destination) // Llama a la función calculateRoute del composable WaitingMap
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
