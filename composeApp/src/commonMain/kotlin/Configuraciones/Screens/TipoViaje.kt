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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
//import dev.icerock.moko.graphics.Color
import androidx.compose.ui.graphics.Color


class TipoViaje: Screen {
    @Composable
    override fun Content() {
        TipoViajeContent()
    }
}
@Composable
fun TipoViajeContent(){
    var isProvincialChecked = remember { mutableStateOf(false) }
    var isUrbanoChecked = remember { mutableStateOf(false) }
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
                        checked = isProvincialChecked.value,
                        onCheckedChange = { isProvincialChecked.value = it },
                        modifier = Modifier
                            .fillMaxSize(),
                    )
                    Text(
                        "Provincial",
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
                        checked = isUrbanoChecked.value,
                        onCheckedChange = { isUrbanoChecked.value = it },
                        modifier = Modifier
                            .fillMaxSize(),
                    )
                    Text(
                        "Urbano",
                        fontSize = TextUnit(7.0f, TextUnitType.Em),
                        color = LetrasBlancas
                    )
                }
            }
        }
    }
}