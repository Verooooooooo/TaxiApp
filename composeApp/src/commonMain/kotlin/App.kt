import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Colors
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

//usar 0xFF para colores
var backgroundColor = Color(0xFF3C4142)
var backgroundColorCuadroTexto = Color(0xFFFFFFFF)
var backgroundColorBuscar = Color(0xFFCC9900)
var LetraNegraLabel = Color(0xFF121212)
var FondoBarra = Color(0xFFFFFFFF)
var BarraRoja = Color(0xFFba1a0f)
var Barrita = Color(0xFFFFFFFF)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme(colors = MaterialTheme.colors.copy(surface = backgroundColor)) {
        var showContent by remember { mutableStateOf(false) }
        val greeting = remember { Greeting().greet() }
        Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
            Column(
                Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                BarraDesafio()
                Box(Modifier.height(510.dp).fillMaxWidth())

                SimpleFilledTextFieldSample("Origen")
                SimpleFilledTextFieldSample("Destino")
                SimpleFilledTextFieldSample("Comentarios")
                Button(
                    onClick = { showContent = !showContent },
                    colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorBuscar),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Buscar Auto", fontSize = TextUnit(8.5f, TextUnitType.Em))
                }


            }
        }
    }
}

@Composable
fun SimpleFilledTextFieldSample(texto: String) {

//alt + enter = importa automaticamente
    TextField(
        leadingIcon = { Icon(Icons.Filled.Add, "") },
        value = "",
        onValueChange = {},
        label = {
            Text(
                texto,
                fontSize = TextUnit(7.0f, TextUnitType.Em),
                color = LetraNegraLabel
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = backgroundColorCuadroTexto,
            textColor = LetraNegraLabel
        ), modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun BarraDesafio() {

    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {
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
        )
        {

            Box(
                Modifier.clip(RoundedCornerShape(16.dp)).background(color = BarraRoja).height(13.dp)
                    .width(300.dp)
            )
        }

    }


}