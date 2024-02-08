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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.platform.composables.WaitingMap
import org.veronica.taxi_app_shared.presentation.shared.composables.Atras
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample


class WaitingDriver : Screen {
    @Composable
    override fun Content() {
        WaitingDriverContent()
    }
}

@Composable
fun WaitingDriverContent() {
    val viewModel = VMFactories.rideViewModel("waiting-driver-screen")

    var originLatLng by remember { mutableStateOf<LatLng?>(null) }
    var destinationLatLng by remember { mutableStateOf<LatLng?>(null) }


    // Aca llamar a un viewmodel que tiene que tener las coordenadas de origen y destino
    // y ademas tiene que ser el encargado de llamar a un usecase que calcule la ruta
    //  el usecase tendria que hacer uso del ktor client para llamar al endpoint de ruta


    // Llamar a los use cases en el ViewModel
    LaunchedEffect(Unit) {

        // Puedes realizar cualquier lógica adicional después de obtener las coordenadas

        viewModel.updateOriginLocation("Origen", LatLng(0.0, 0.0)) // Aquí debes pasar las coordenadas reales
        viewModel.updateDestinationLocation("Destino", LatLng(0.0, 0.0)) // Aquí debes pasar las coordenadas reales
    }

    // todas las funciones y logica de Waiting map que no sean composables se deberian
    // preferiblemente realizar aca o en el nuevo viewmodel

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            GoogleMap(
                modifier = Modifier
                    .fillMaxSize(),
                cameraPositionState = rememberCameraPositionState {
                    position = CameraPosition.fromLatLngZoom(
                        originLatLng ?: destinationLatLng ?: LatLng(-8.162938650276201, -79.01217650462648),  // Posición de la cámara en función de las coordenadas disponibles
                        17.0f
                    )
                })

            Box(modifier = Modifier.weight(1f)) {


                // Contenido anterior omitido para mayor claridad

                // Llamar a WaitingMap y pasar las coordenadas de origen y destino
                // A waiting map lo mejor solo seria pasarle argumentos de origen, destino y ruta
                WaitingMap(
                    originAddress = "",
                    destinationAddress = "",
                    route = viewModel.route.value
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
