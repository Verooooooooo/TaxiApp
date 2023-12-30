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

class BloqueoCuenta : Screen {
    @Composable
    override fun Content() {
        BloqueoCuentaContent()
    }
}

@Composable
fun BloqueoCuentaContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver2("BLOQUEO DE CUENTA")
            }
            item {
                Text(
                    text = "Bloquear una cuenta\n" +
                            "Cuando la calificación de un pasajero cae a 3 estrellas, el perfil del " +
                            "pasajero se pintará de negro o se bloqueará automáticamente. La calificación " +
                            "de un pasajero descenderá si:\n" +
                            "- Recibe quejas de los conductores\n" +
                            "- Cancela solicitudes de viaje que ya han sido aceptadas por los " +
                            "conductores\n" +
                            "- Se demora en llegar al punto de recogida o no aparece\n" +
                            "- No acepta, ignora o cancela las propuestas del conductor sobre el precio " +
                            "inicial\n" +
                            "\n" +
                            "Te enviaremos una notificación push con antelación si tu cuenta tiene riesgo " +
                            "de bloqueo. El período de bloqueo puede variar desde una hora hasta varios " +
                            "días. En ciertas circunstancias, un perfil puede quedar bloqueado en forma " +
                            "permanente.",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}