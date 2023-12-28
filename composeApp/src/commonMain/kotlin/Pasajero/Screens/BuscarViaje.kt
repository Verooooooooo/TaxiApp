package Pasajero.Screens

import Composables.Map
import Settings.Screens.Opciones
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.comentario
import org.veronica.taxi_app.resources.AppResources.images.ubicacion
import kotlin.math.round

//usar 0xFF para colores

var backgroundColorCuadroTexto = Color(0xFFFFFFFF)
var backgroundColorBuscar = Color(0xFFCC9900)
var LetraNegraLabel = Color(0xFF121212)
var FondoBarra = Color(0xFFFFFFFF)
var BarraRoja = Color(0xFFba1a0f)
var Barrita = Color(0xFFFFFFFF)
var Modal = Color(0xFF121212)
var LetraBlancaAnuncio = Color(0xFFFFFFFF)
var backgroundColorEmpezar = Color(0xFFCC9900)

class BuscarViaje : Screen {
    @Composable
    override fun Content() {
        BuscarViajeContent()
    }
}

@Composable
fun BuscarViajeContent() {
    val navigator = LocalNavigator.currentOrThrow

    var isDialogOpen by remember { mutableStateOf(true) }

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            BarraDesafio()
            Map(Modifier.height(400.dp).fillMaxWidth())

            SimpleFilledTextFieldSample("Origen", icon = ubicacion)
            SimpleFilledTextFieldSample("Destino", icon = ubicacion)
            SimpleFilledTextFieldSample("Comentarios", icon = comentario)
            Button(
                onClick = { navigator.push(ConductorEncontrado()) },
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorBuscar),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Buscar Auto", fontSize = TextUnit(8.5f, TextUnitType.Em))
            }


        }

        if (isDialogOpen) {
            Dialog(onDismissRequest = { isDialogOpen = false }, properties = DialogProperties()) {
                Surface(
                    color = Modal,
                    modifier = Modifier.clip(RoundedCornerShape(16.dp))

                ) {
                    Column(
                        modifier = Modifier.padding(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("PREMIUM DRIVE EXPERIENCE", color = LetraBlancaAnuncio)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "Potencia tu viaje con las mejores rutas y precios",
                                color = LetraBlancaAnuncio, modifier = Modifier.weight(1.0f)
                            )

                            Image(
                                painter = painterResource(AppResources.images.carroBlancoAnuncio),
                                modifier = Modifier.fillMaxWidth().weight(1.0f),
                                contentDescription = null
                            )
                        }

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
                        ) {
                            Text("Empezar")
                        }
                    }

                }
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
                modifier = Modifier.height(30.dp),
                contentDescription = ""
            )
        },
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                fontSize = TextUnit(7.0f, TextUnitType.Em),
                color = LetraNegraLabel
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = backgroundColorCuadroTexto,
            textColor = LetraNegraLabel
        ), modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun BarraDesafio() {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp).clickable { navigator.push(Opciones())} // Ajusta el espaciado del icono según tus necesidades
        ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.iconHamburguer),
                    contentDescription = null,
                    modifier = Modifier.width(16.dp),
                )


        }
        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 250.dp).background(color = Barrita)
        )
        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 150.dp).background(color = Barrita)
        )
        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 356.dp).background(color = Barrita)
        )

        Box(
            Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(color = FondoBarra)
                .height(13.dp)
        )
        {

            Box(
                Modifier.clip(RoundedCornerShape(16.dp)).background(color = BarraRoja).height(13.dp)
                    .width(300.dp)
            )
        }

    }


}