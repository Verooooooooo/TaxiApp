package org.veronica.taxi_app_shared.presentation.splash

import androidx.compose.runtime.Composable
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import dev.icerock.moko.permissions.Permission
import dev.icerock.moko.permissions.PermissionsController
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch


data class SplashUiState(
    val permissionsGranted: Boolean = false,
    val splashDurationIsCompleted: Boolean = false
) {
    val shouldNavigateToNextScreen = permissionsGranted && splashDurationIsCompleted
}

class SplashViewModel(
    private val permissionsController: PermissionsController
) : ViewModel() {
    private val _uiState = MutableStateFlow(SplashUiState())
    val uiState = _uiState.asStateFlow()

    init {
        println("SplashViewModel init")
        viewModelScope.launch {
            delay(2500)
            _uiState.value = _uiState.value.copy(splashDurationIsCompleted = true)
        }
        viewModelScope.launch {
            val eachHalfASecond = flow {
                while (true) {
                    delay(500)
                    emit(Unit)
                }
            }

            eachHalfASecond.combine(uiState) { _, state ->
                println("try to provide permissions")
                val permissionsGranted = state.permissionsGranted
                println("permissionsGranted: $permissionsGranted")
                if (!permissionsGranted) {
                    try {
                        permissionsController.providePermission(Permission.LOCATION)
                        permissionsController.providePermission(Permission.COARSE_LOCATION)

                        _uiState.value = state.copy(permissionsGranted = true)

                    } catch (e: Throwable) {
                        println("permissions not granted")
                        println("e: $e")
                    }
                }
            }.collect()


        }
    }

    @Composable
    fun BindPermissionsWith(bindEffect: @Composable (PermissionsController) -> Unit) {
        bindEffect(permissionsController)
    }
}