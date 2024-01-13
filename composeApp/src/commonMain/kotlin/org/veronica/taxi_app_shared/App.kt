package org.veronica.taxi_app_shared

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.Navigator
import dev.icerock.moko.geo.LocationTracker
import dev.icerock.moko.geo.compose.BindLocationTrackerEffect
import dev.icerock.moko.permissions.PermissionsController
import dev.icerock.moko.permissions.compose.BindEffect
import org.koin.compose.KoinContext
import org.koin.compose.koinInject
import org.veronica.taxi_app_shared.presentation.shared.theme.AppTheme
import org.veronica.taxi_app_shared.presentation.splash.SplashScreen


@Composable
fun App() {
    KoinContext {
        val permissionsController = koinInject<PermissionsController>()
        val locationTracker = koinInject<LocationTracker>()
        BindEffect(permissionsController)
        BindLocationTrackerEffect(locationTracker)
        LaunchedEffect(locationTracker) {
            locationTracker.startTracking()
        }

        AppTheme(
            useDarkTheme = true
        ) {
            Navigator(SplashScreen())
        }
    }
}

