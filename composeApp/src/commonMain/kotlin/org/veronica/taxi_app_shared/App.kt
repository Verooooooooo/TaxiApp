package org.veronica.taxi_app_shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import org.koin.compose.KoinContext
import org.veronica.taxi_app_shared.presentation.shared.theme.AppTheme
import org.veronica.taxi_app_shared.presentation.splash.SplashScreen


var backgroundColor = Color(0xFF3C4142)


@Composable
fun App() {
    KoinContext {
        AppTheme(
            useDarkTheme = true
        ) {
            Navigator(SplashScreen())
        }
    }
}

