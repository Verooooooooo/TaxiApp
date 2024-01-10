package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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


class SobreApp : Screen {
    @Composable
    override fun Content() {
        SobreAppContent()
    }
}

@Composable
fun SobreAppContent() {

    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Regresar("ACERCA DE LA APP")
            Button(
                onClick = { navigator.push(Reglas()) },
            ) {
                Text("Reglas", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(PoliticaPriv()) },
            ) {
                Text(
                    "Política de privacidad",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(TermCond()) },
            ) {
                Text(
                    "Términos y condiciones",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(Licencias()) },
            ) {
                Text("Licencias", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = {},
            ) {
                Text("Versión", style = TextStyle(fontSize = 16.sp))

            }

        }
    }

}