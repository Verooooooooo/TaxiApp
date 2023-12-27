package Pasajero.Screens

import Composables.Map
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import kotlinx.coroutines.delay
import org.veronica.taxi_app.resources.AppResources


class LogoPrincipal : Screen {
    @Composable
    override fun Content() {
        LogoPrincipalContent()
    }

}
@Composable
fun LogoPrincipalContent() {

    val navigator = LocalNavigator.currentOrThrow
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(true) {
        delay(3000) // Espera 3 segundos antes de navegar a la siguiente pantalla
        navigator.push(BuscarViaje())
    }
    Surface(modifier =Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier =
            Modifier.fillMaxWidth().padding(horizontal = 0.5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(0.5.dp),
        ) {


                Image(
                    painter = painterResource(AppResources.images.CorarviLogo),
                    modifier = Modifier.fillMaxWidth().weight(1.0f),
                    contentDescription = null
                )
            }

    }
}