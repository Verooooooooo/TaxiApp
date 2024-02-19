package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import org.veronica.taxi_app_shared.domain.models.GoogleMapRoute

@Composable
actual fun WaitingMap(
    origin: LatLng,
    destination: LatLng,
    route: GoogleMapRoute
) {

    LaunchedEffect(true) {
        // DEL PASO 3 - centrar la camara en el origen y destino
        // FUTURO HAY QUE ARREGLAR ESTO
    }
    
    Column {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = rememberCameraPositionState {
                position = CameraPosition.fromLatLngZoom(
                    route.getOrNull(0) ?: origin ?: LatLng(0.0, 0.0),
                    17.0f
                )
            }
        ) {

            // DEL PASO 3 - añadir el polyline
            Polyline(
                points = route
            )


            // DEL PASO 3 - ponemos marcadores para el origen y el destino
            Marker(
                state = MarkerState(
                    position = origin
                )
            )
            Marker(
                state = MarkerState(
                    position = destination
                )
            )
        }
    }
}