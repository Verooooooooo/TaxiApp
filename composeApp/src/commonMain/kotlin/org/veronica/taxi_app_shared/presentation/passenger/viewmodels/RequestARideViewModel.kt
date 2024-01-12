package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.usecases.GetUserRideIntentUseCase
import org.veronica.taxi_app_shared.domain.usecases.SaveUserRideIntentUseCase


data class RequestARideUiState(
    val origin: FullAddress?,
    val destination: FullAddress?,
    val price: Double = 0.0,
    val suggestedPrice: Double = 0.0,
    val useSuggestedPrice: Boolean = false,
    val comment: String = ""
)

class RequestARideViewModel(
    private val getUserRideIntentUseCase: GetUserRideIntentUseCase,
    private val saveUserRideIntentUseCase: SaveUserRideIntentUseCase
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
        println("intializing VM")
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
            _uiState.collect {
                println("saving user ride intent")
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

    fun setOrigin(origin: FullAddress) {
        viewModelScope.launch {
            println("setting origin")
            println(origin.toString())
            _uiState.value = _uiState.value.copy(origin = origin)
            println("origin set")
            println("waiting 1 second")
            delay(1000)
            println(uiState.value)
            println("1 second passed")
        }.start()
    }

    fun setDestination(destination: FullAddress) {
        _uiState.value = _uiState.value.copy(destination = destination)
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