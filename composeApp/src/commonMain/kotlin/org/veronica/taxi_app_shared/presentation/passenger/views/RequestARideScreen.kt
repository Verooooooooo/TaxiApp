package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.platform.composables.Map
import org.veronica.taxi_app_shared.presentation.settings.views.Opciones
import org.veronica.taxi_app_shared.presentation.shared.composables.BarraDesafio
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample

class RequestARideScreen : Screen {
    @Composable
    override fun Content() {
        RequestARideScreenContent()
    }
}

@Composable
fun RequestARideScreenContent() {
    val navigator = LocalNavigator.currentOrThrow
    val viewModel = VMFactories.requestARideViewModel("request-a-ride-screen")
    val uiState by viewModel.uiState.collectAsState()

    var isDialogOpen by remember { mutableStateOf(true) }

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                Map(Modifier.fillMaxWidth())

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clickable { navigator.push(Opciones()) } // Ajusta el espaciado del icono según tus necesidades
                    ) {

                        // Agrega tu icono aquí
                        Image(
                            painter = painterResource(AppResources.images.iconHamburguer),
                            contentDescription = null,
                            modifier = Modifier.width(16.dp),
                        )


                    }
                    BarraDesafio()
                }

            }
            Column(
                Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                SimpleFilledTextFieldSample(
                    "Origen",
                    icon = AppResources.images.ubicacion,
                    enabled = false,
                    value = uiState.origin?.address ?: ""
                ) {
                    // Navega a la pantalla deseada al hacer clic en el texto de origen
                    navigator.push(
                        OriginPickerScreen()
                    )
                }
                SimpleFilledTextFieldSample(
                    "Destino",
                    icon = AppResources.images.ubicacion,
                    enabled = false,
                    value = uiState.destination?.address ?: ""
                ) {
                    // Navega a la pantalla deseada al hacer clic en el texto de origen
                    navigator.push(
                        DestinationPickerScreen()
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SimpleFilledTextFieldSample("Precio",
                            modifier = Modifier.fillMaxWidth().weight(1f),
                            icon = AppResources.images.precio,
                            enabled = !uiState.useSuggestedPrice,
                            value = if (uiState.useSuggestedPrice) uiState.suggestedPrice.toString() else uiState.price.toString(),
                            onValueChange = {
                                viewModel.setPrice(it.toDoubleOrNull() ?: 0.0)
                            }


                        )
                        Row(
                            modifier = Modifier.weight(1f),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = !uiState.useSuggestedPrice,
                                onCheckedChange = {
                                    viewModel.setUseSuggestedPrice(!it)
                                },
                            )
                            Text(
                                "Poner Precio",
                                style = TextStyle(fontSize = 16.sp),
                            )
                        }
                    }


                }
                SimpleFilledTextFieldSample("Comentarios",
                    icon = AppResources.images.comentario,
                    value = uiState.comment ?: "",
                    onValueChange = {
                        viewModel.setComment(it)
                    })
                Button(
                    onClick = {
                        navigator.push(WaitingDriver())
                    },

                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Buscar Auto", style = TextStyle(fontSize = 16.sp))
                }


            }
        }


        if (isDialogOpen) {
            Dialog(onDismissRequest = { isDialogOpen = false }, properties = DialogProperties()) {
                Surface(
                    modifier = Modifier.clip(RoundedCornerShape(16.dp))

                ) {
                    Column(
                        modifier = Modifier.padding(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("PREMIUM DRIVE EXPERIENCE")
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "Potencia tu viaje con las mejores rutas y precios",
                                modifier = Modifier.weight(1.0f)
                            )

                            Image(
                                painter = painterResource(AppResources.images.carroBlancoAnuncio),
                                modifier = Modifier.fillMaxWidth().weight(1.0f),
                                contentDescription = null
                            )
                        }

                        Button(
                            onClick = {},
                        ) {
                            Text("Empezar")
                        }
                    }

                }
            }
        }

    }
}

