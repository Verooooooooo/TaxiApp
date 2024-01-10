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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.presentation.settings.views.Opciones
import org.veronica.taxi_app_shared.presentation.shared.composables.BarraDesafio

var Cuadro = Color(0xFF121212)
var LetraBlanca = Color(0xFFFFFFFF)

class ListaPasajeros : Screen {
    @Composable
    override fun Content() {
        ListaPasajerosContent()
    }
}


@Composable
fun ListaPasajerosContent() {
    val navigator = LocalNavigator.currentOrThrow

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Box(modifier = Modifier.clickable { navigator.push(Opciones()) } // Ajusta el espaciado del icono según tus necesidades
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


            Column(
                Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                Box() {

                    Surface(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp))

                    ) {
                        Column(
                            modifier = Modifier.padding(15.dp),
                            verticalArrangement = Arrangement.spacedBy(15.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "Nombre chofer", modifier = Modifier.weight(1.0f)
                                )
                                Text(
                                    "Precio", modifier = Modifier.weight(1.0f)
                                )
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "Origen: direccion", modifier = Modifier.weight(1.0f)
                                )
                                Text(
                                    "Kilometros", modifier = Modifier.weight(1.0f)
                                )

                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "Destino: direccion", modifier = Modifier.weight(1.0f)
                                )
                                Button(
                                    onClick = { navigator.push(AceptarCliente()) },
                                ) {
                                    Text("VER")
                                }

                            }

                        }

                    }
                }
                Image(
                    painter = painterResource(AppResources.images.cargando),
                    modifier = Modifier.fillMaxWidth().weight(0.1f),
                    contentDescription = null
                )
                Text(
                    "Buscando pasajeros...", color = LetraBlanca, modifier = Modifier.weight(0.5f)
                )
                Button(
                    onClick = {},
                ) {
                    Text("next")
                }

            }


        }

    }

}





