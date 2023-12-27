import Pasajero.Screens.BuscarViaje
import Pasajero.Screens.LogoPrincipal
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator


var backgroundColor = Color(0xFF3C4142)


@Composable
fun App() {
    MaterialTheme(colors = MaterialTheme.colors.copy(surface = backgroundColor)) {
        Navigator(LogoPrincipal())

    }
}

