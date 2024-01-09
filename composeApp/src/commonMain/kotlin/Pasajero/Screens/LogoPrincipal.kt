package Pasajero.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.icerock.moko.resources.compose.painterResource
import kotlinx.coroutines.delay
import org.veronica.taxi_app.resources.AppResources


@Composable
fun LogoPrincipal(parentNavigator: moe.tlaster.precompose.navigation.Navigator) {

    LaunchedEffect(true) {
        delay(3000) // Espera 3 segundos antes de navegar a la siguiente pantalla
        parentNavigator.navigate("/passenger")
    }

    Surface(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            modifier =
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