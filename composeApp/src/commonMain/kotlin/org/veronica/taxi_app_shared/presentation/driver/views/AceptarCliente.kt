package org.veronica.taxi_app_shared.presentation.driver.views

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
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.platform.composables.Map
import org.veronica.taxi_app_shared.presentation.settings.views.Opciones
import org.veronica.taxi_app_shared.presentation.shared.composables.BarraDesafio
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample

class AceptarCliente : Screen {
    @Composable
    override fun Content() {
        AceptarClienteContent()
    }
}

@Composable
fun AceptarClienteContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                Map(
                    Modifier.fillMaxWidth(),
                    userLocation = LatLng(-8.162938650276201, -79.01217650462648)
                )

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


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {


                    SimpleFilledTextFieldSample(
                        "Ubicacion pasajero",
                        modifier = Modifier.fillMaxWidth().weight(1f),
                        icon = AppResources.images.chofer,
                        enabled = false
                    )


                    SimpleFilledTextFieldSample(
                        "Destino pasajero",
                        modifier = Modifier.fillMaxWidth().weight(1f),
                        icon = AppResources.images.precio,
                        enabled = false
                    )

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Box(Modifier.weight(1f)) {
                        Button(
                            onClick = {},
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("ACEPTAR VIAJE", style = TextStyle(fontSize = 16.sp))
                        }
                    }
                    Box(
                        Modifier
                            .weight(1f)
                        //.width(500.dp)
                    ) {
                        Button(
                            onClick = { navigator.push(ListaPasajeros()) },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("VOLVER", style = TextStyle(fontSize = 16.sp))
                        }
                    }
                }


            }


        }
    }
}