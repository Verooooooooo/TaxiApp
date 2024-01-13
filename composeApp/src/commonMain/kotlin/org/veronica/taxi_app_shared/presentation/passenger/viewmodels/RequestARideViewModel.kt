package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.usecases.GetUserLocationUseCase
import org.veronica.taxi_app_shared.domain.usecases.GetUserRideIntentUseCase
import org.veronica.taxi_app_shared.domain.usecases.SaveUserRideIntentUseCase


data class RequestARideUiState(
    val origin: FullAddress?,
    val destination: FullAddress?,
    val price: Double = 0.0,
    val suggestedPrice: Double = 0.0,
    val useSuggestedPrice: Boolean = false,
    val comment: String = "",
    val userLocation: LatLng? = null
)

class RequestARideViewModel(
    private val getUserRideIntentUseCase: GetUserRideIntentUseCase,
    private val saveUserRideIntentUseCase: SaveUserRideIntentUseCase,
    private val getUserLocationUseCase: GetUserLocationUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(
        RequestARideUiState(
            origin = null,
            destination = null
        )
    )
    val uiState = _uiState.asStateFlow()

    override fun onCleared() {
        println("clearing")
        super.onCleared()

    }


    init {
        viewModelScope.launch {
            val rideIntent = getUserRideIntentUseCase()
            _uiState.value = _uiState.value.copy(
                origin = rideIntent.origin,
                destination = rideIntent.destination,
                price = rideIntent.price,
                suggestedPrice = rideIntent.suggestedPrice,
                useSuggestedPrice = rideIntent.useSuggestedPrice,
                comment = rideIntent.comment
            )
        }

        viewModelScope.launch {
            getUserLocationUseCase().collect {
                _uiState.value =
                    _uiState.value.copy(userLocation = LatLng(it.latitude, it.longitude))
            }
        }

        viewModelScope.launch {
            _uiState.collect {
                saveUserRideIntentUseCase(
                    rideIntent = RideIntent(
                        id = "test_user",
                        origin = it.origin,
                        destination = it.destination,
                        price = it.price,
                        suggestedPrice = it.suggestedPrice,
                        useSuggestedPrice = it.useSuggestedPrice,
                        comment = it.comment
                    )
                )
            }
        }
    }

    fun setPrice(price: Double) {
        _uiState.value = _uiState.value.copy(price = price)
    }

    fun setUseSuggestedPrice(useSuggestedPrice: Boolean) {
        _uiState.value = _uiState.value.copy(useSuggestedPrice = useSuggestedPrice)
    }


    fun setComment(comment: String) {
        _uiState.value = _uiState.value.copy(comment = comment)
    }
}