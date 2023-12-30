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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class Flete : Screen {
    @Composable
    override fun Content() {
        FleteContent()
    }
}

@Composable
fun FleteContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver2("FLETE")
            }
            item {
                Text(
                    text = "Cómo solicitar un Flete\n" +
                            "1. ¿Cómo creo una solicitud de flete?\n" +
                            "Llena todos los campos obligatorios y describe el envío con el mayor " +
                            "detalle posible. Ofrece un precio justo. También puedes añadir una foto de " +
                            "la carga. Luego de hacer clic en el botón “Ordenar”, espera las ofertas de " +
                            "los transportistas.\n" +
                            "\n" +
                            "2. ¿Es seguro enviar carga mediante inDriver?\n" +
                            "Para tener acceso a las solicitudes, los conductores deben someterse a una " +
                            "comprobación obligatoria de sus documentos. Igualmente, el sistema monitorea " +
                            "y registra todas las órdenes.\n" +
                            "\n" +
                            "3. ¿Hay alguna restricción?\n" +
                            "Mediante inDriver no se puede transportar carga que esté prohibida por las " +
                            "leyes del país.\n" +
                            "\n" +
                            "4. Normas de conducta del servicio de flete.\n" +
                            "Nos reservamos el derecho a bloquear tu cuenta en caso de que haya ." +
                            "cancelaciones repetidas o creación de órdenes fraudulentas. También se " +
                            "prohíbe incluir números telefónicos y cargar imágenes de cargas que no " +
                            "correspondan con lo enviado.",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}