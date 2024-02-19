package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.screen.Screen
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.platform.composables.WaitingMap


class WaitingDriver : Screen {
    @Composable
    override fun Content() {
        WaitingDriverContent()
    }
}

@Composable
fun WaitingDriverContent() {
    val viewModel = VMFactories.rideViewModel("waiting-driver-screen")
    val uiState by viewModel.uiState.collectAsState()

    if (uiState.origin != null && uiState.destination != null) {
        WaitingMap(
            origin = uiState.origin!!,
            destination = uiState.destination!!,
            route = uiState.route ?: listOf()
        )
    } else {
        // A CAMBIAR
        Text("No se encontraron datos")
    }
}
