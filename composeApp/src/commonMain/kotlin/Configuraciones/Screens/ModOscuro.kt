package Configuraciones.Screens

import Settings.Screens.LetrasBlancas
import Settings.Screens.backgroundColor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
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

class ModOscuro : Screen {
    @Composable
    override fun Content() {
        ModOscuroContent()
    }
}
@Composable
fun ModOscuroContent(){
    var isActivadoChecked = remember { mutableStateOf(false) }
    var isDesactivadoChecked = remember { mutableStateOf(false) }
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("MODO OSCURO")
            Row(
                modifier = Modifier.fillMaxWidth().height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(Modifier.weight(1f)) {
                    Checkbox(
                        checked = isActivadoChecked.value,
                        onCheckedChange = {
                            isActivadoChecked.value = it
                            isDesactivadoChecked.value = !it // Desactiva el otro checkbox
                        },
                        modifier = Modifier.fillMaxSize(),
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.Yellow, // Cambia el color cuando está marcado
                            uncheckedColor = Color.Yellow.copy(alpha = 0.5f) // Cambia el color cuando no está marcado
                        )
                    )
                    Text(
                        "Activado",
                        fontSize = TextUnit(7.0f, TextUnitType.Em),
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
                        checked = isDesactivadoChecked.value,
                        onCheckedChange = {
                            isDesactivadoChecked.value = it
                            isActivadoChecked.value = !it // Desactiva el otro checkbox
                        },
                        modifier = Modifier.fillMaxSize(),
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.Yellow, // Cambia el color cuando está marcado
                            uncheckedColor = Color.Yellow.copy(alpha = 0.5f) // Cambia el color cuando no está marcado
                        )
                    )
                    Text(
                        "Desactivado",
                        fontSize = TextUnit(7.0f, TextUnitType.Em),
                        color = LetrasBlancas
                    )
                }
            }
        }
    }
}