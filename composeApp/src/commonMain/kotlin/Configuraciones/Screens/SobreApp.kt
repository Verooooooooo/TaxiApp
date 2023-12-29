package Configuraciones.Screens

import AcercaApp.Screens.Licencias
import AcercaApp.Screens.PoliticaPriv
import AcercaApp.Screens.Reglas
import AcercaApp.Screens.TermCond
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


var backgroundColor = Color(0xFF3C4142)
var LetrasBlancas = Color(0xFFFFFFFF)
class SobreApp : Screen {
    @Composable
    override fun Content() {
        SobreAppContent()
    }
}
@Composable
fun SobreAppContent(){

    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("ACERCA DE LA APP")
            Button(
                onClick = {navigator.push(Reglas())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Reglas", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(PoliticaPriv())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Política de privacidad", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(TermCond())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Términos y condiciones", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {navigator.push(Licencias())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Licencias", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Versión", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }

        }
    }

}