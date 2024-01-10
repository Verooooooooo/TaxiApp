package org.veronica.taxi_app_shared.presentation.passenger.viewmodels

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.RequestARideUseCase


data class RequestARideState(
    val origin: FullAddress?,
    val destination: FullAddress?,
    val price: Double?,
    val comment: String?
)

class RequestARideViewModel(
    private val requestARideUseCase: RequestARideUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(RequestARideState(null, null, null, null))
    val uiState = _uiState.asStateFlow()

    fun setOrigin(origin: FullAddress) {
        _uiState.value = _uiState.value.copy(origin = origin)
    }

    fun setDestination(destination: FullAddress) {
        _uiState.value = _uiState.value.copy(destination = destination)
    }

    fun setPrice(price: Double) {
        _uiState.value = _uiState.value.copy(price = price)
    }

    fun setComment(comment: String) {
        _uiState.value = _uiState.value.copy(comment = comment)
    }
}