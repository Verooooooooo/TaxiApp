package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class NoPermitido : Screen {
    @Composable
    override fun Content() {
        NoPermitidoContent()
    }
}

@Composable
fun NoPermitidoContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver2("COSAS NO ADMITIDAS")
            }
            item {
                Text(
                    text = "Los repartidores no aceptan:\n" +
                            "- Alcohol\n" +
                            "- Metales preciosos, piedras preciosas, joyas\n" +
                            "- Armas y munición\n" +
                            "- Equipo militar o cualquiera de sus partes o accesorios\n" +
                            "- Explosivos\n" +
                            "- Pólvora, uranio o veneno\n" +
                            "- Sustancias narcóticas o psicotrópicas\n" +
                            "- Medicinas\n" +
                            "- Artículos y bienes cuya venta esté restringida o que " +
                            "hayan sido quitados de circulación\n" +
                            "\n" +
                            "Los clientes y repartidores tienen prohibido publicar mensajes " +
                            "de cualquier tipo en vez de solicitudes de repartidores.",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}