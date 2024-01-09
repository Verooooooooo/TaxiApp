package Pasajero.Screens

import Composables.Map
import Settings.Screens.LetrasBlancas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import moe.tlaster.precompose.navigation.Navigator
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app.resources.AppResources.images.comentario
import org.veronica.taxi_app.resources.AppResources.images.ubicacion

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

@Composable
fun BuscarViaje(
    parentNavigator: Navigator
) {

    var isDialogOpen by remember { mutableStateOf(true) }

    var PrecioSi = remember { mutableStateOf(false) }

    var PrecioNo = remember { mutableStateOf(false) }

    var precioText by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                Map(Modifier.fillMaxWidth())

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
//                            .clickable { navigator.push(Opciones()) } // Ajusta el espaciado del icono según tus necesidades
                    ) {

                        // Agrega tu icono aquí
                        Image(
                            painter = painterResource(AppResources.images.iconHamburguer),
                            contentDescription = null,
                            modifier = Modifier.width(16.dp),
                        )


                    }
                    BarraDesafio()
                }

            }
            Column(
                Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {


                SimpleFilledTextFieldSample("Origen", icon = ubicacion, enabled = false,
                    onTextClick = {
                        // Navega a la pantalla deseada al hacer clic en el texto de origen
//                        navigator.push(LocationPicker())
                    })
                SimpleFilledTextFieldSample("Destino", icon = ubicacion,enabled = false,
                    onTextClick = {
                        // Navega a la pantalla deseada al hacer clic en el texto de origen
                        navigator.push(DestinyPicker())
                    })
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth().height(50.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        SimpleFilledTextFieldSample(
                            "Precio",
                            modifier = Modifier.fillMaxWidth().weight(1f),
                            icon = AppResources.images.precio,
                            enabled = PrecioSi.value,
                            value = precioText,
                            onValueChange = { precioText = it }


                        )
                        Row(
                            modifier = Modifier.weight(1f),
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Checkbox(
                                checked = PrecioSi.value,
                                onCheckedChange = {
                                    PrecioSi.value = it
                                    PrecioNo.value = !it // Desactiva el otro checkbox
                                },
                                modifier = Modifier,
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color.Yellow, // Cambia el color cuando está marcado
                                    uncheckedColor = Color.Yellow.copy(alpha = 0.5f) // Cambia el color cuando no está marcado
                                )
                            )
                            Text(
                                "Poner Precio",
                                style = TextStyle(fontSize = 16.sp),
                                color = LetrasBlancas
                            )
                        }
                    }


                }
                SimpleFilledTextFieldSample("Comentarios", icon = comentario)
                Button(
                    onClick = {
//                        navigator.push(ConductorEncontrado())
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorBuscar),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Buscar Auto", style = TextStyle(fontSize = 16.sp))
                }


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
fun SimpleFilledTextFieldSample(
    texto: String, modifier: Modifier = Modifier, icon: ImageResource, enabled: Boolean = true,
    value: String = "", onValueChange: (String) -> Unit = {},
    onTextClick: () -> Unit = {}
) {


//alt + enter = importa automaticamente
    OutlinedTextField(
        leadingIcon = {
            Icon(
                painter = painterResource(icon),
                modifier = Modifier.height(16.dp),
                contentDescription = "",
                tint = Color.White

            )
        },
        enabled = enabled,
        value = value, // Usar el valor proporcionado
        onValueChange = onValueChange,
        label = {
            Text(
                texto,
                style = TextStyle(fontSize = 16.sp),
                color = LetraBlancaAnuncio
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = LetraBlancaAnuncio,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White,
            disabledBorderColor = Color.Transparent
        ), modifier = modifier.fillMaxWidth().clickable { onTextClick.invoke() },
        singleLine = true
    )
}

@Composable
fun BarraDesafio() {
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {


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