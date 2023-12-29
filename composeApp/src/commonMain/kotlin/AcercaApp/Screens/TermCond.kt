package AcercaApp.Screens

import Configuraciones.Screens.LetrasBlancas
import Configuraciones.Screens.Regresar
import Configuraciones.Screens.backgroundColor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Términos de Uso",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "VicoCar.Servicios Términos de Uso",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Reglas de servicio para los usuarios del servicio VicoCar.Servicios",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("VicoCar.Flete Términos de Uso", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Ciudad a Ciudad",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Ciudad a Ciudad",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Términos de uso VicoCar.Freight",
                    fontSize = TextUnit(7.0f, TextUnitType.Em),
                    color = LetrasBlancas
                )

            }

        }
    }
}