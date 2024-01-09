package Settings.Screens

import Conductor.Screens.LetraBlanca
import Conductor.Screens.ListaPasajeros
import Pasajero.Screens.backgroundColorEmpezar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
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
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.configuraciones
import org.veronica.taxi_app.resources.AppResources.images.usuario

var LetraBlanca = Color(0xFFFFFFFF)
var backgroundColor = Color(0xFF3C4142)

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
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
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
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
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
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
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
//                    navigator.push(BuscarViaje())
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
            ) {
                Text("Modo pasajero", style = TextStyle(fontSize = 16.sp))
            }
            Button(
                onClick = { navigator.push(ListaPasajeros()) },
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
            ) {
                Text("Modo conductor", style = TextStyle(fontSize = 16.sp))

            }
        }


    }
}

@Composable
fun SimpleFilledTextFieldSample(texto: String, modifier: Modifier = Modifier, icon: ImageResource) {


//alt + enter = importa automaticamente
    OutlinedTextField(
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
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = LetraBlanca,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White,
            disabledBorderColor = Color.Transparent
        ), modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleFilledTextFieldSample2(
    texto: String,
    modifier: Modifier = Modifier,
    image: ImageResource
) {
    OutlinedTextField(
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
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = LetraBlanca,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White,
            disabledBorderColor = Color.Transparent
        ),
        modifier = modifier.fillMaxWidth()
    )
}