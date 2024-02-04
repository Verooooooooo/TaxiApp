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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
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


    // Aca llamar a un viewmodel que tiene que tener las coordenadas de origen y destino
    // y ademas tiene que ser el encargado de llamar a un usecase que calcule la ruta
    //  el usecase tendria que hacer uso del ktor client para llamar al endpoint de ruta


    // Llamar a los use cases en el ViewModel
    LaunchedEffect(Unit) {

        // Puedes realizar cualquier lógica adicional después de obtener las coordenadas
    }

    // todas las funciones y logica de Waiting map que no sean composables se deberian
    // preferiblemente realizar aca o en el nuevo viewmodel

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                // Contenido anterior omitido para mayor claridad

                // Llamar a WaitingMap y pasar las coordenadas de origen y destino
                // A waiting map lo mejor solo seria pasarle argumentos de origen, destino y ruta
                WaitingMap(
                    originAddress = "",
                    destinationAddress = ""
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
