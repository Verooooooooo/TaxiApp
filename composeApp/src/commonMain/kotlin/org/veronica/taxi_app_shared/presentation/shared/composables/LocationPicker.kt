package org.veronica.taxi_app_shared.presentation.shared.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.platform.composables.InteractiveMap

@Composable
fun LocationPicker(
    locationLabel: String,
    onComplete: (FullAddress?) -> Unit
) {
    val navigator = LocalNavigator.currentOrThrow
    val viewModel = VMFactories.locationPickerViewModel("location-picker-screen")
    val state by viewModel.state.collectAsState()

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {

        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier) {
                Atras("Location Picker")
            }
            Box(
                Modifier.padding(vertical = 2.dp),
                contentAlignment = (Alignment.CenterStart)
            )
            {

                Box(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    SimpleFilledTextFieldSample(
                        locationLabel, icon = AppResources.images.ubicacion,
                        enabled = true, value = state.selectedLocationName ?: "",
                    )
                }
            }
            Box(modifier = Modifier.weight(1f)) {



                InteractiveMap(
                    onLocationSelected = { location ->
                        viewModel.selectLocation(location)
                        print(location.toString())
                    }
                )


            }
            Button(
                onClick = {
                    onComplete(
                        if (state.selectedLocation != null)
                            FullAddress(
                                location = state.selectedLocation!!,
                                address = state.selectedLocationName ?: ""
                            )
                        else null
                    )

                },
                enabled = state.selectedLocation != null,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("CONFIRMAR", style = TextStyle(fontSize = 16.sp))
            }

        }
    }

}

@Composable
fun Atras(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 7.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 15.dp)
                .clickable {
                    navigator.pop()
                } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.back),
                    contentDescription = null,
                    modifier = Modifier.width(20.dp)
                )
                Text(texto)
            }

        }
    }
}


