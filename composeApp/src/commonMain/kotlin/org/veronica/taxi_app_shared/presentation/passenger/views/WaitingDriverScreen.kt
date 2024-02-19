package org.veronica.taxi_app_shared.presentation.passenger.views

import RideViewModel
import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import cafe.adriel.voyager.core.screen.Screen
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import io.ktor.client.HttpClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.core.di.VMFactories
import org.veronica.taxi_app_shared.data.repos.GoogleMapsRepo
import org.veronica.taxi_app_shared.data.repos.SqlRideIntentsRepo
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.OriginPickerViewModel
import org.veronica.taxi_app_shared.presentation.shared.composables.Atras
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample
import org.veronica.taxiapp.db.AppDatabase


class WaitingDriver : Screen {
    @Composable
    override fun Content() {
        WaitingDriverContent()
    }
}

@Composable
fun WaitingDriverContent() {
    val viewModel = remember { RideViewModel(httpClient = HttpClient(), mapsRepo = GoogleMapsRepo(HttpClient())) }

    val context = applicationContext // Obtén el contexto de tu aplicación

// Crear un SqlDriver utilizando AndroidSqliteDriver
    val driver = AndroidSqliteDriver(AppDatabase.Schema, context, "database_name.db")
    val appDatabase = AppDatabase(driver)
    val repo = remember { SqlRideIntentsRepo(db = appDatabase) }
    val (origin, destination) = repo.getOriginAndDestinationCoordinates(userId = "tu_user_id")

    LaunchedEffect(origin, destination) {
        if (origin != null && destination != null) {
            viewModel.drawRoute(origin, destination, googleMap = GoogleMap)
        }
    }
}

@Composable
fun rememberRideViewModel(): RideViewModel {
    return VMFactories.rideViewModel("ride-view-model")
}