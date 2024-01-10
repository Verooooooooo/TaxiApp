import Pasajero.Screens.BuscarViaje
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import org.koin.compose.KoinContext


var backgroundColor = Color(0xFF3C4142)


@Composable
fun App() {
    KoinContext {
        MaterialTheme(
            colors = MaterialTheme.colors.copy(
                surface = backgroundColor, primary = Color.White
            )
        ) {
            Navigator(BuscarViaje())
        }
    }
}

