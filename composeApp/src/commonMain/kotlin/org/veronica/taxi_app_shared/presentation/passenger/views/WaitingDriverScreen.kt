package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentDestinationUseCase
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentOriginUseCase
import org.veronica.taxi_app_shared.platform.composables.WaitingMap
import org.veronica.taxi_app_shared.presentation.shared.composables.Atras
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample


class WaitingDriver(
    private val updateRideIntentOriginUseCase: UpdateRideIntentOriginUseCase,
    private val updateRideIntentDestinationUseCase: UpdateRideIntentDestinationUseCase
) : Screen {
    @Composable
    override fun Content() {
        val originAddress = remember { mutableStateOf<FullAddress?>(null) }
        val destinationAddress = remember { mutableStateOf<FullAddress?>(null) }

        LaunchedEffect(Unit) {
            originAddress.value = updateRideIntentOriginUseCase.selectedOriginCoordinates
            destinationAddress.value = updateRideIntentDestinationUseCase.selectedDestinationCoordinates
        }
        WaitingDriverContent(
            originAddress = originAddress.value,
            destinationAddress = destinationAddress.value
        )

    }
}
/*
class WaitingDriver : Screen {
    @Composable
    override fun Content() {
        WaitingDriverContent()
    }
}*/
@Composable
fun WaitingDriverContent(
    originAddress: FullAddress?,
    destinationAddress: FullAddress?
) {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                // Contenido anterior omitido para mayor claridad

                // Llamar a WaitingMap y pasar las coordenadas de origen y destino
                WaitingMap(
                    originAddress = originAddress.toString(),
                    destinationAddress = destinationAddress.toString()
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                    ) {
                        Atras("Waiting")

                    }
                }

            }
            Box(Modifier) {
                SimpleFilledTextFieldSample(
                    "Esperando conductor",
                    modifier = Modifier.fillMaxWidth(),
                    icon = AppResources.images.reloj,
                    enabled = false
                )
            }

        }
    }
}
/*

@Composable
fun WaitingDriverContent() {
    var originCoordinates by remember { mutableStateOf<LatLng?>(null) }
    var destinationCoordinates by remember { mutableStateOf<LatLng?>(null) }

    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {



                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                    ) {
                        Atras("Waiting")

                    }
                }

            }
            Box(Modifier) {
                SimpleFilledTextFieldSample(
                    "Esperando conductor",
                    modifier = Modifier.fillMaxWidth(),
                    icon = AppResources.images.reloj,
                    enabled = false
                )
            }
        }


    }


}
*/