package Configuraciones.Screens

import Pasajero.Screens.BuscarViaje
import Settings.Screens.Configuraciones
import Settings.Screens.LetrasBlancas
import Settings.Screens.Opciones
import Settings.Screens.backgroundColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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

class Idioma : Screen {
    @Composable
    override fun Content() {
        IdiomaContent()
    }
}
@Composable
fun IdiomaContent() {
    var isEspañolChecked = remember { mutableStateOf(false) }
    var isInglesChecked = remember { mutableStateOf(false) }
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("TIPO DE VIAJE")
            Row(
                modifier = Modifier.fillMaxWidth().height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(Modifier.weight(1f)) {
                    Checkbox(
                        checked = isEspañolChecked.value,
                        onCheckedChange = {
                            isEspañolChecked.value = it
                            isInglesChecked.value = !it // Desactiva el otro checkbox
                        },
                        modifier = Modifier.fillMaxSize(),
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.Yellow, // Cambia el color cuando está marcado
                            uncheckedColor = Color.Yellow.copy(alpha = 0.5f) // Cambia el color cuando no está marcado
                        )
                    )
                    Text(
                        "Español",
                        style = TextStyle(fontSize = 16.sp),
                        color = LetrasBlancas
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(Modifier.weight(1f)) {
                    Checkbox(
                        checked = isInglesChecked.value,
                        onCheckedChange = {
                            isInglesChecked.value = it
                            isEspañolChecked.value = !it // Desactiva el otro checkbox
                            },
                            modifier = Modifier.fillMaxSize(),
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.Yellow, // Cambia el color cuando está marcado
                            uncheckedColor = Color.Yellow.copy(alpha = 0.5f) // Cambia el color cuando no está marcado
                        )
                        )
                    Text(
                        "Inglés",
                        style = TextStyle(fontSize = 16.sp),
                        color = LetrasBlancas
                    )
                }
            }
        }
    }
}
@Composable
fun Regresar(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(Configuraciones()) } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.back),
                    contentDescription = null,
                    modifier = Modifier.width(20.dp)
                )

                Text(texto, color = LetrasBlancas)


            }

        }
    }
}