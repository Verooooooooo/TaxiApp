package org.veronica.taxi_app_shared.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.presentation.passenger.views.RequestARideScreen

class SplashScreen : Screen {
    @Composable
    override fun Content() {
        SplashScreenContent()
    }
}

@Composable
fun SplashScreenContent() {
    val navigator = LocalNavigator.currentOrThrow
    val viewModel = VMFactories.splashViewModel("splash-screen")
    val uiState = viewModel.uiState.collectAsState()

    LaunchedEffect(uiState.value.shouldNavigateToNextScreen) {
        if (uiState.value.shouldNavigateToNextScreen) {
            navigator.push(RequestARideScreen())
        }
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