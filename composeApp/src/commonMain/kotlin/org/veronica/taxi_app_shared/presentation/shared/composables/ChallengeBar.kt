package org.veronica.taxi_app_shared.presentation.shared.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

var FondoBarra = Color(0xFFFFFFFF)
var BarraRoja = Color(0xFFba1a0f)
var Barrita = Color(0xFFFFFFFF)

@Composable
fun BarraDesafio() {
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    ) {


        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 250.dp).background(color = Barrita)
        )
        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 150.dp).background(color = Barrita)
        )
        Box(
            Modifier.width(5.dp).height(20.dp).offset(x = 356.dp).background(color = Barrita)
        )

        Box(
            Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(color = FondoBarra)
                .height(13.dp)
        ) {

            Box(
                Modifier.clip(RoundedCornerShape(16.dp)).background(color = BarraRoja).height(13.dp)
                    .width(300.dp)
            )
        }

    }
}