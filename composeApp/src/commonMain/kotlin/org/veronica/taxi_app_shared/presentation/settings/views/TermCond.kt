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

class TermCond : Screen {
    @Composable
    override fun Content() {
        TermCondContent()
    }
}

@Composable
fun TermCondContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Volver("TÉRMINOS Y CONDICIONES")
            Button(
                onClick = { navigator.push(TerminoUso()) },
            ) {
                Text(
                    "Términos de Uso",
                    style = TextStyle(fontSize = 16.sp),
                )
            }
            Button(
                onClick = { navigator.push(ServiciosTermUso()) },
            ) {
                Text(
                    "VicoCar.Servicios Términos de Uso",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(ReglasServicioUsuarios()) },
            ) {
                Text(
                    "Reglas de servicio para los usuarios del servicio VicoCar.Servicios",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(FleteTerminosUso()) },
            ) {
                Text(
                    "VicoCar.Flete Términos de Uso",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(CondUsoCiudad()) },
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Ciudad a Ciudad",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(CondUsoEntregas()) },
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Entregas",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(TermUsoFreight()) },
            ) {
                Text(
                    "Términos de uso VicoCar.Freight",
                    style = TextStyle(fontSize = 16.sp),
                )

            }

        }
    }
}