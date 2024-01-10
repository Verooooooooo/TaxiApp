package org.veronica.taxi_app_shared.presentation.settings.views

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
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

class Reglas : Screen {
    @Composable
    override fun Content() {
        ReglasContent()
    }
}

@Composable
fun ReglasContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Volver("REGLAS")
            Button(
                onClick = { navigator.push(Normas()) },
            ) {
                Text(
                    "Normas para pasajeros",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(VerificacionPack()) },
            ) {
                Text(
                    "Verificación de paquetes",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(NoPermitido()) },
            ) {
                Text(
                    "Cosas no admitidas por los repartidores",
                    style = TextStyle(fontSize = 16.sp),
                )

            }
            Button(
                onClick = { navigator.push(Flete()) },
            ) {
                Text("Flete", style = TextStyle(fontSize = 16.sp))

            }
            Button(
                onClick = { navigator.push(BloqueoCuenta()) },
            ) {
                Text(
                    "Bloqueo de cuenta",
                    style = TextStyle(fontSize = 16.sp),
                )

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

                Text(texto)


            }

        }
    }
}