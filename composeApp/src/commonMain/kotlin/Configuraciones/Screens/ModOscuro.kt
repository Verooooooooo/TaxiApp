package Configuraciones.Screens

import Settings.Screens.LetrasBlancas
import Settings.Screens.backgroundColor
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class ModOscuro : Screen {
    @Composable
    override fun Content() {
        ModOscuroContent()
    }
}
@Composable
fun ModOscuroContent(){
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("MODO OSCURO")
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Activado", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
            ) {
                Text("Desactivado", fontSize = TextUnit(7.0f, TextUnitType.Em), color = LetrasBlancas)
            }
        }
    }
}