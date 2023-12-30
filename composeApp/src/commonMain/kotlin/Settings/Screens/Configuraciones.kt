package Settings.Screens

import Conductor.Screens.ListaPasajeros
import Configuraciones.Screens.CerrarSesion
import Configuraciones.Screens.Idioma
import Configuraciones.Screens.ModOscuro
import Configuraciones.Screens.Numero
import Configuraciones.Screens.SobreApp
import Configuraciones.Screens.Tiempo
import Configuraciones.Screens.TipoViaje
import Pasajero.Screens.BuscarViaje
import Pasajero.Screens.backgroundColorEmpezar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
var LetrasBlancas = Color(0xFFFFFFFF)
class Configuraciones : Screen {
    @Composable
    override fun Content() {
        ConfiguracionesContent()
    }
}
@Composable
fun ConfiguracionesContent(){
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Sandwich("CONFIGURACIONES")
            Button(
                onClick = { navigator.push(Numero())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {

                Text("Cambiar de número",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = { navigator.push(ModOscuro())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {

                Text("Modo oscuro",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = { navigator.push(Idioma())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Idioma",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = { navigator.push(Tiempo())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Tiempo de espera máx.",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = { navigator.push(TipoViaje())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Tipo de viaje",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }
            Button(
                onClick = { navigator.push(SobreApp())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Acerca de la app",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)
            }
            Button(
                onClick = {navigator.push(CerrarSesion())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Cerrar sesión",  style = TextStyle(fontSize = 16.sp), color = LetrasBlancas)

            }

        }
    }
}