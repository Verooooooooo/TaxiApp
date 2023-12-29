package Rules.Screens

import AcercaApp.Screens.Volver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

class VerificacionPack : Screen {
    @Composable
    override fun Content() {
        VerificacionPackContent()
    }
}

@Composable
fun VerificacionPackContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver2("VERIFICACIÓN DE PAQUETES")
            }
            item {
                Text(
                    text = "Verificación de paquetes por parte del repartidor\n" +
                            "El repartidor puede solicitarte que le muestres el contenido del paquete. " +
                            "Tienes derecho a no aceptar un paquete si su contenido parece sospechoso. " +
                            "Si el repartidor sospecha que el contenido del paquete puede ser ilegal o " +
                            "infringir las reglas de nuestro servicio, nos lo hará saber",
                    fontSize = TextUnit(20.0f, TextUnitType.Sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}