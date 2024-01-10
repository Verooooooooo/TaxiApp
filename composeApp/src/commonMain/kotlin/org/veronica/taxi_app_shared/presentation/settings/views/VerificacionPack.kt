package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}