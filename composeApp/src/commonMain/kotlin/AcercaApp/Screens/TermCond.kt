package AcercaApp.Screens

import Configuraciones.Screens.LetrasBlancas
import Configuraciones.Screens.Regresar
import Configuraciones.Screens.backgroundColor
import Rules.Screens.BloqueoCuenta
import TerminosCondiciones.Screens.CondUsoCiudad
import TerminosCondiciones.Screens.CondUsoEntregas
import TerminosCondiciones.Screens.FleteTerminosUso
import TerminosCondiciones.Screens.ReglasServicioUsuarios
import TerminosCondiciones.Screens.ServiciosTermUso
import TerminosCondiciones.Screens.TermUsoFreight
import TerminosCondiciones.Screens.TerminoUso
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
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
                onClick = {navigator.push(TerminoUso())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Términos de Uso",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )
            }
            Button(
                onClick = {navigator.push(ServiciosTermUso())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "VicoCar.Servicios Términos de Uso",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {navigator.push(ReglasServicioUsuarios())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Reglas de servicio para los usuarios del servicio VicoCar.Servicios",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {navigator.push(FleteTerminosUso())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("VicoCar.Flete Términos de Uso",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(CondUsoCiudad())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Ciudad a Ciudad",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {navigator.push(CondUsoEntregas())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Condiciones de Uso de VicoCar.Entregas",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )

            }
            Button(
                onClick = {navigator.push(TermUsoFreight())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text(
                    "Términos de uso VicoCar.Freight",
                    style = TextStyle(fontSize = 16.sp),
                    color = LetrasBlancas
                )

            }

        }
    }
}