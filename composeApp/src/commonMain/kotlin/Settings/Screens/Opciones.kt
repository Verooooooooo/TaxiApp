package Settings.Screens

import Conductor.Screens.Cuadro
import Conductor.Screens.LetraBlanca
import Conductor.Screens.ListaPasajeros
import Conductor.Screens.ListaPasajerosContent
import Pasajero.Screens.BuscarViaje
import Pasajero.Screens.LetraNegraLabel
import Pasajero.Screens.backgroundColorCuadroTexto
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.configuraciones
import org.veronica.taxi_app.resources.AppResources.images.fotoPerfil
import org.veronica.taxi_app.resources.AppResources.images.usuario

var LetraBlanca = Color(0xFFFFFFFF)
var backgroundColor = Color(0xFF3C4142)
class Opciones: Screen {
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
                onClick = { navigator.push(BuscarViaje())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Image(
                    painter = painterResource(AppResources.images.fotoPerfil),
                    modifier = Modifier.height(35.dp),
                    contentDescription = null
                )
                Text("Juan Perez", fontSize = TextUnit(7.0f, TextUnitType.Em))

            }
            Button(
                onClick = { navigator.push(Cuenta())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Icon(
                    painter = painterResource(usuario),
                    modifier = Modifier.height(35.dp),
                    contentDescription = ""
                )
                Text("Mi cuenta", fontSize = TextUnit(7.0f, TextUnitType.Em))

            }
            Button(
                onClick = { navigator.push(Configuraciones())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Icon(
                    painter = painterResource(configuraciones),
                    modifier = Modifier.height(35.dp),
                    contentDescription = ""
                )
                Text("Configuraciones", fontSize = TextUnit(7.0f, TextUnitType.Em))

            }
            Button(
                onClick = { navigator.push(BuscarViaje())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
            ) {
                Text("Modo pasajero", fontSize = TextUnit(7.0f, TextUnitType.Em))
            }
            Button(
                onClick = { navigator.push(ListaPasajeros())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
            ) {
                Text("Modo conductor", fontSize = TextUnit(7.0f, TextUnitType.Em))

            }
        }


    }
}
@Composable
fun SimpleFilledTextFieldSample(texto: String, modifier: Modifier = Modifier, icon: ImageResource) {


//alt + enter = importa automaticamente
    TextField(
        leadingIcon = {
            Icon(
                painter = painterResource(icon),
                modifier = Modifier.height(35.dp),
                contentDescription = ""
            )
        },
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                fontSize = TextUnit(7.0f, TextUnitType.Em),
                color = LetraBlanca
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = LetraBlanca
        ), modifier = modifier.fillMaxWidth()
    )
}
@Composable
fun SimpleFilledTextFieldSample2(texto: String, modifier: Modifier = Modifier, image: ImageResource) {
    TextField(
        leadingIcon = {
                // Utiliza painterResource para cargar la imagen desde el recurso local
                Image(
                    painter = painterResource(image),
                    contentDescription = "",
                    modifier = Modifier.height(25.dp)
                )

        },
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                fontSize = TextUnit(7.0f, TextUnitType.Em),
                color = LetraBlanca
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = LetraBlanca
        ),
        modifier = modifier.fillMaxWidth()
    )
}