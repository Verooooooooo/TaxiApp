package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.configuraciones
import org.veronica.taxi_app.resources.AppResources.images.usuario
import org.veronica.taxi_app_shared.presentation.driver.views.ListaPasajeros
import org.veronica.taxi_app_shared.presentation.passenger.views.RequestARideScreen


class Opciones : Screen {
    @Composable
    override fun Content() {
        OpcionesContent()
    }
}

@Composable
fun OpcionesContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = {},
            ) {
                Image(
                    painter = painterResource(AppResources.images.fotoPerfil),
                    modifier = Modifier.height(35.dp),
                    contentDescription = null
                )
                Text("Juan Perez", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(Cuenta()) },
            ) {
                Icon(
                    painter = painterResource(usuario),
                    modifier = Modifier.height(35.dp),
                    contentDescription = ""
                )
                Text("Mi cuenta", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(Configuraciones()) },
            ) {
                Icon(
                    painter = painterResource(configuraciones),
                    modifier = Modifier.height(35.dp),
                    contentDescription = ""
                )
                Text("Configuraciones", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = {
                    navigator.push(RequestARideScreen())
                },
            ) {
                Text("Modo pasajero", style = TextStyle(fontSize = 16.sp))
            }
            Button(
                onClick = { navigator.push(ListaPasajeros()) },
            ) {
                Text("Modo conductor", style = TextStyle(fontSize = 16.sp))

            }
        }


    }
}
