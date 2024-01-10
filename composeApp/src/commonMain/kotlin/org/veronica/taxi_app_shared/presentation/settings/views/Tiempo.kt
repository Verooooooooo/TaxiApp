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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class Tiempo : Screen {
    @Composable
    override fun Content() {
        TiempoContent()
    }
}

@Composable
fun TiempoContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("TIEMPO")
            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample4(
                        "Ingrese tiempo máx. de espera",
                        modifier = Modifier.fillMaxSize()

                    )
                }
            }
        }
    }

}

@Composable
fun SimpleFilledTextFieldSample4(texto: String, modifier: Modifier = Modifier) {
//alt + enter = importa automaticamente
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                style = TextStyle(fontSize = 16.sp),
            )
        }, modifier = modifier.fillMaxWidth()
    )
}