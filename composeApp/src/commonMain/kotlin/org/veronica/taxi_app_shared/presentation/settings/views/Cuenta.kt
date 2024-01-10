package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

var LetraBlancaAnuncio = Color(0xFFFFFFFF)

class Cuenta : Screen {
    @Composable
    override fun Content() {
        CuentaContent()
    }
}

@Composable
fun SimpleFilledTextFieldSample3(texto: String, modifier: Modifier = Modifier, isEnabled: Boolean) {
//alt + enter = importa automaticamente
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                style = TextStyle(fontSize = 16.sp),
            )
        }, modifier = modifier.fillMaxWidth(),
        enabled = isEnabled
    )
}

@Composable
fun CuentaContent() {
    val navigator = LocalNavigator.currentOrThrow
    var isEditingEnabled by remember { mutableStateOf(false) }
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Sandwich("MI CUENTA")
            Image(
                painter = painterResource(AppResources.images.fotoPerfil),
                modifier = Modifier.height(150.dp),
                contentDescription = null
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {


                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "Nombres",
                        modifier = Modifier,
                        isEnabled = isEditingEnabled
                    )
                }
                Box(
                    Modifier
                        .weight(0.7f)
                )
                {
                    SimpleFilledTextFieldSample3(
                        "Apellidos",
                        modifier = Modifier,
                        isEnabled = isEditingEnabled
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {

                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "DNI/Carnet Ext.",
                        modifier = Modifier,
                        isEnabled = isEditingEnabled
                    )
                }
                Box(
                    Modifier
                        .weight(0.7f)
                    //.width(500.dp)
                ) {
                    SimpleFilledTextFieldSample3(
                        "Telefono",
                        modifier = Modifier,
                        isEnabled = isEditingEnabled
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {

                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "Edad",
                        modifier = Modifier,
                        isEnabled = isEditingEnabled
                    )
                }

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {

                Box(Modifier.weight(1f)) {
                    Button(
                        onClick = { isEditingEnabled = true },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Editar Datos", style = TextStyle(fontSize = 16.sp))
                    }
                }
                Box(
                    Modifier
                        .weight(0.7f)
                    //.width(500.dp)
                ) {
                    Button(
                        onClick = { isEditingEnabled = false },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Aceptar", style = TextStyle(fontSize = 16.sp))
                    }
                }
            }

        }
    }

}

@Composable
fun Sandwich(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(Opciones()) } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.iconHamburguer),
                    contentDescription = null,
                    modifier = Modifier.width(16.dp)
                )

                Text(texto)


            }

        }
    }
}


