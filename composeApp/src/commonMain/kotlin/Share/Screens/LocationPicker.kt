package Share.Screens

import Pasajero.Screens.SimpleFilledTextFieldSample
import Platform.InteractiveMap
import Settings.Screens.LetrasBlancas
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
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import dev.icerock.moko.resources.compose.painterResource
import io.ktor.client.HttpClient
import org.koin.compose.koinInject
import org.veronica.taxi_app.resources.AppResources


var backgroundBotonConfirmar = Color(0xFFCC9900)

class LocationPicker : Screen {
    @Composable
    override fun Content() {
        LocationPickerContent()
    }
}


@Composable
fun LocationPickerContent() {
    val hc = koinInject<HttpClient>()
    val navigator = LocalNavigator.currentOrThrow
    val (selectedLocation, setSelectedLocation) = remember { mutableStateOf<LatLng?>(null) }
    val viewModel = getViewModel(Unit, viewModelFactory {
        LocationPickerViewModel(httpClient = hc)
    })

    val state by viewModel.state.collectAsState()


    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {

        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier) {

                Atras("Location Picker")
            }
            Box(
                Modifier.padding(vertical = 2.dp),
                contentAlignment = (Alignment.CenterStart)
            )
            {

                Box(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    SimpleFilledTextFieldSample(
                        "Origen", icon = AppResources.images.ubicacion,
                        enabled = true, value = state.selectedLocationName ?: "",
                    )
                }
            }
            Box(modifier = Modifier.weight(1f)) {

                InteractiveMap(
                    onLocationSelected = { location ->
                        viewModel.selectLocation(location)
                        print(location.toString())
                    }
                )

            }
            Button(
                onClick = {navigator.push(BuscarViaje())},
                colors = ButtonDefaults.buttonColors(backgroundColor = backgroundBotonConfirmar),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("CONFIRMAR", style = TextStyle(fontSize = 16.sp))
            }

        }
    }

}

@Composable
fun Atras(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 7.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 15.dp)
                .clickable {
//                    navigator.push(BuscarViaje())
                } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.back),
                    contentDescription = null,
                    modifier = Modifier.width(20.dp)
                )

                Text(texto, color = LetrasBlancas)


            }

        }
    }
}