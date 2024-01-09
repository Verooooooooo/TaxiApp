import Pasajero.Screens.BuscarViaje
import Pasajero.Screens.LogoPrincipal
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.koin.compose.KoinContext


var backgroundColor = Color(0xFF3C4142)


@Composable
fun App() {
    PreComposeApp {
        KoinContext {
            val navigator = rememberNavigator()

            MaterialTheme(
                colors = MaterialTheme.colors.copy(
                    surface = backgroundColor, primary = Color.White
                )
            ) {
                NavHost(
                    navigator = navigator, navTransition = NavTransition(
                        createTransition = slideInVertically(initialOffsetY = { it }),
                        destroyTransition = slideOutVertically(targetOffsetY = { it }),
                        pauseTransition = scaleOut(targetScale = 0.9f),
                        resumeTransition = scaleIn(initialScale = 0.9f),
                        exitTargetContentZIndex = 1f,
                    ), initialRoute = "/splash"
                ) {
                    scene("/splash") {
                        LogoPrincipal(parentNavigator = navigator)
                    }

                    scene("/passenger") {
                        BuscarViaje(parentNavigator = navigator)
                    }

                    scene("/driver") {
                        Text(text = "Driver")
                    }

                    scene("/settings") {
                        Text(text = "Settings")
                    }
                }
//            Navigator(LogoPrincipal())
            }
        }
    }
}

