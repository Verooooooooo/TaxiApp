package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.presentation.shared.composables.LocationPicker

class OriginPickerScreen : Screen {
    @Composable
    override fun Content() {
        OriginPickerScreenContent()
    }
}

@Composable
fun OriginPickerScreenContent() {
    val viewModel = VMFactories.originPickerViewModel("origin-picker-screen")
    val navigator = LocalNavigator.currentOrThrow

    LocationPicker("Origen", onComplete = {
        if (it != null)
            viewModel.updateOrigin(origin = it, afterUpdate = {
                navigator.pop()
            })
    })
}