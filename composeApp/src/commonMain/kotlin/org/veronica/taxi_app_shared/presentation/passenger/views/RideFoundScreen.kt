package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.chofer
import org.veronica.taxi_app.resources.AppResources.images.precio
import org.veronica.taxi_app.resources.AppResources.images.reloj
import org.veronica.taxi_app_shared.platform.composables.Map
import org.veronica.taxi_app_shared.presentation.settings.views.Opciones
import org.veronica.taxi_app_shared.presentation.shared.composables.BarraDesafio
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample

var botonCancelar = Color(0xFFFF0000)

class RideFound : Screen {
    @Composable
    override fun Content() {
        RideFoundContent()
    }
}

@Composable
fun RideFoundContent() {
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
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp) // Ajusta el espaciado a la derecha según sea necesario
                    , verticalAlignment = Alignment.Top
                ) {
                    Box(modifier = Modifier.weight(1.5f))
                    {
                        Image(
                            painter = painterResource(AppResources.images.carrito),
                            modifier = Modifier.height(IntrinsicSize.Min),
                            contentDescription = null
                        )
                    }
                    Box(Modifier.weight(1.5f)) {
                        SimpleFilledTextFieldSample(
                            "Tiempo",
                            modifier = Modifier.fillMaxWidth(),
                            icon = reloj,
                            enabled = false
                        )
                    }

                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {


                    SimpleFilledTextFieldSample(
                        "Conductor",
                        modifier = Modifier.fillMaxWidth().weight(1f),
                        icon = chofer,
                        enabled = false
                    )


                    SimpleFilledTextFieldSample(
                        "Precio",
                        modifier = Modifier.fillMaxWidth().weight(1f),
                        icon = precio,
                        enabled = false
                    )

                }

                Button(
                    onClick = {
                        navigator.push(RequestARideScreen())
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.errorContainer,
                        contentColor = MaterialTheme.colorScheme.onErrorContainer
                    )
                ) {
                    Text("CANCELAR VIAJE", style = TextStyle(fontSize = 16.sp))
                }

            }


        }
    }
}