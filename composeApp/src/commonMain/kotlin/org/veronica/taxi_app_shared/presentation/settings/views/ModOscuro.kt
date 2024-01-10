package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class ModOscuro : Screen {
    @Composable
    override fun Content() {
        ModOscuroContent()
    }
}

@Composable
fun ModOscuroContent() {
    val isActivadoChecked = remember { mutableStateOf(false) }
    val isDesactivadoChecked = remember { mutableStateOf(false) }
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
                    )
                    Text(
                        "Activado",
                        style = TextStyle(fontSize = 16.sp),
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
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        "Desactivado",
                        style = TextStyle(fontSize = 16.sp),
                    )
                }
            }
        }
    }
}