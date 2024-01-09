package Share.Screens

import Pasajero.Screens.BuscarViaje
import Pasajero.Screens.SimpleFilledTextFieldSample
import Platform.InteractiveMap
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.veronica.taxi_app.resources.AppResources



class DestinyPicker : Screen {
    @Composable
    override fun Content() {
        DestinyPickerContent()
    }
}


@Composable
fun DestinyPickerContent() {
    val navigator = LocalNavigator.currentOrThrow
    val (selectedLocation, setSelectedLocation) = remember { mutableStateOf<LatLng?>(null) }
    val viewModel = getViewModel(Unit, viewModelFactory {
        DestinyPickerViewModel()
    })

    val state by viewModel.state.collectAsState()


    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {

        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier) {

                Atras("Destiny Picker")
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
                        "Destino", icon = AppResources.images.ubicacion,
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
