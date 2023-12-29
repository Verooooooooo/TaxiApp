package AcercaApp.Screens

import Configuraciones.Screens.LetrasBlancas
import Configuraciones.Screens.Regresar
import Configuraciones.Screens.SobreApp
import Configuraciones.Screens.backgroundColor
import Rules.Screens.BloqueoCuenta
import Rules.Screens.Flete
import Rules.Screens.NoPermitido
import Rules.Screens.Normas
import Rules.Screens.VerificacionPack
import Settings.Screens.Configuraciones
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
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

class Reglas : Screen {
    @Composable
    override fun Content() {
        ReglasContent()
    }
}
@Composable
fun ReglasContent(){
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Volver("REGLAS")
            Button(
                onClick = {navigator.push(Normas())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Normas para pasajeros", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(VerificacionPack())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Verificación de paquetes", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(NoPermitido())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Cosas no admitidas por los repartidores", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(Flete())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Flete", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(BloqueoCuenta())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Bloqueo de cuenta", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }

        }
    }
}
@Composable
fun Volver(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(SobreApp()) } // Ajusta el espaciado del icono según tus necesidades
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

                Text(texto, color = Settings.Screens.LetrasBlancas)


            }

        }
    }
}