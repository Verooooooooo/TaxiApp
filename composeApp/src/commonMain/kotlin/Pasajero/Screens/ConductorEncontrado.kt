package Pasajero.Screens

import Composables.Map
import Conductor.Screens.ListaPasajeros
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.chofer
import org.veronica.taxi_app.resources.AppResources.images.precio
import org.veronica.taxi_app.resources.AppResources.images.reloj

class ConductorEncontrado : Screen {
    @Composable
    override fun Content() {
        ConductorEncontradoContent()
    }
}

@Composable
fun ConductorEncontradoContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            BarraDesafio()
            Map(Modifier.height(300.dp).fillMaxWidth())


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp) // Ajusta el espaciado a la derecha según sea necesario
                , verticalAlignment = Alignment.Top
            ) {
                Image(
                    painter = painterResource(AppResources.images.carrito),
                    modifier = Modifier.height(200.dp).weight(1.5f),
                    contentDescription = null
                )
                Box(Modifier.weight(1.5f)) {
                    SimpleFilledTextFieldSample(
                        "Tiempo",
                        modifier = Modifier.fillMaxWidth(),
                        icon = reloj
                    )
                }

            }


            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample(
                        "Nombre conductor",
                        modifier = Modifier.fillMaxSize(),
                        icon = chofer
                    )
                }
                Box(
                    Modifier
                        .weight(0.7f)
                    //.width(500.dp)
                ) {
                    SimpleFilledTextFieldSample(
                        "Precio",
                        modifier = Modifier.fillMaxSize(),
                        icon = precio
                    )
                }
            }

            Button(
                onClick = { navigator.push(ListaPasajeros()) },
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorBuscar),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Aceptar Conductor", fontSize = TextUnit(8.5f, TextUnitType.Em))
            }
        }
    }
}