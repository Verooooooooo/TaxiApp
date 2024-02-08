package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
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

    private val _destinationLocation: MutableStateFlow<LatLng?> = MutableStateFlow(null)

    private val _route: MutableStateFlow<Route?> = MutableStateFlow(null)
    val route = _route.asStateFlow()

    // Método para actualizar la ubicación de origen
    fun updateOriginLocation(latitude: String, longitude: LatLng) {
        _destinationLocation.value = longitude // Se asigna el valor de longitud directamente
        viewModelScope.launch {
            val origin = FullAddress(latitude, longitude)
            updateRideIntentOriginUseCase(origin) // Llama al método invoke de UpdateRideIntentDestinationUseCase para pasar las coordenadas de destino
        }
        calculateRouteAndUpdate()
    }

    // Método para actualizar la ubicación de destino
    fun updateDestinationLocation(latitude: String, longitude: LatLng) {
        _destinationLocation.value = longitude // Se asigna el valor de longitud directamente
        viewModelScope.launch {
            val destination = FullAddress(latitude, longitude)
            updateRideIntentDestinationUseCase(destination) // Llama al método invoke de UpdateRideIntentDestinationUseCase para pasar las coordenadas de destino
        }
        calculateRouteAndUpdate()
    }


    // Método para calcular y actualizar la ruta
    private fun calculateRouteAndUpdate() {
        val origin = _originLocation.value
        val destination = _destinationLocation.value
        if (origin != null && destination != null) {
            viewModelScope.launch {
                val route = calculateRoute(origin, destination) // Suponiendo que tienes una función llamada calculateRoute que calcula la ruta
                _route.value = route
            }

        }
    }
}
/*
init {
        observeDestinationLocation()
        observeOriginLocation()
    }

    private fun observeDestinationLocation() {
        destinationPickerViewModel.destinationLocation.observeForever { destinationLocation ->
            // Actualiza las coordenadas de destino en RideViewModel
            _destinationLocation.value = destinationLocation
            calculateRouteIfBothLocationsSelected()
        }
    }

    private fun observeOriginLocation() {
        originPickerViewModel.originLocation.observeForever { originLocation ->
            // Actualiza las coordenadas de origen en RideViewModel
            _originLocation.value = originLocation
            calculateRouteIfBothLocationsSelected()
        }
    }


    private val _originLocation: MutableStateFlow<LatLng?> = MutableStateFlow(null)
    val originLocation: StateFlow<LatLng?> = _originLocation.asStateFlow()

    private val _destinationLocation: MutableStateFlow<LatLng?> = MutableStateFlow(null)
    val destinationLocation: StateFlow<LatLng?> = _destinationLocation.asStateFlow()

    private val _route: MutableStateFlow<Route?> = MutableStateFlow(null)
    val route = _route.asStateFlow()

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
 */