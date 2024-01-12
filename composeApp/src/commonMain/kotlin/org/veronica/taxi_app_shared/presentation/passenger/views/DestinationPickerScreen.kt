package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.presentation.shared.composables.LocationPicker

class DestinationPickerScreen : Screen {
    @Composable
    override fun Content() {
        DestinationPickerScreenContent()
    }
}

@Composable
fun DestinationPickerScreenContent() {
    val viewModel = VMFactories.destinationPickerViewModel("destination-picker-screen")
    val navigator = LocalNavigator.currentOrThrow

    LocationPicker("Destino", onComplete = {
        if (it != null)
            viewModel.updateDestination(destination = it, afterUpdate = {
                navigator.pop()
            })
    })
}
