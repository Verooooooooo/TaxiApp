package Settings.Screens

import Conductor.Screens.ListaPasajerosContent
import Pasajero.Screens.LetraNegraLabel
import Pasajero.Screens.backgroundColorCuadroTexto
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

class Cuenta : Screen {
    @Composable
    override fun Content() {
        CuentaContent()
    }
}
@Composable
fun SimpleFilledTextFieldSample3(texto: String, modifier: Modifier = Modifier) {
//alt + enter = importa automaticamente
    TextField(
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
        ), modifier = modifier.fillMaxWidth()
    )
}
@Composable
fun CuentaContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Sandwich("MI CUENTA")
            Image(
                painter = painterResource(AppResources.images.fotoPerfil),
                modifier = Modifier.height(150.dp),
                contentDescription = null
            )

            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "Nombres",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    Modifier
                        .weight(0.7f))
                {
                    SimpleFilledTextFieldSample3(
                        "Apellidos",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "DNI/Carnet Ext.",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    Modifier
                        .weight(0.7f)
                    //.width(500.dp)
                ) {
                    SimpleFilledTextFieldSample3(
                        "Telefono",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(Modifier.weight(1f)) {
                    SimpleFilledTextFieldSample3(
                        "Edad",
                        modifier = Modifier.fillMaxSize()
                    )
                }

            }

        }
    }

}
@Composable
fun Sandwich(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(Opciones()) } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

            // Agrega tu icono aquí
            Image(
                painter = painterResource(AppResources.images.iconHamburguer),
                contentDescription = null,
                modifier = Modifier.width(16.dp)
            )

                Text(texto, color = LetrasBlancas)


            }

        }
    }
}


