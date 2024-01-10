package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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


class Configuraciones : Screen {
    @Composable
    override fun Content() {
        ConfiguracionesContent()
    }
}

@Composable
fun ConfiguracionesContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Sandwich("CONFIGURACIONES")
            Button(
                onClick = { navigator.push(Numero()) },
            ) {

                Text(
                    "Cambiar de número",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(ModOscuro()) },
            ) {

                Text("Modo oscuro", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(Idioma()) },
            ) {
                Text("Idioma", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(Tiempo()) },
            ) {
                Text(
                    "Tiempo de espera máx.",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(TipoViaje()) },
            ) {
                Text("Tipo de viaje", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(SobreApp()) },
            ) {
                Text("Acerca de la app", style = TextStyle(fontSize = 16.sp))
            }
            Button(
                onClick = { navigator.push(CerrarSesion()) },
            ) {
                Text("Cerrar sesión", style = TextStyle(fontSize = 16.sp))

            }

        }
    }
}