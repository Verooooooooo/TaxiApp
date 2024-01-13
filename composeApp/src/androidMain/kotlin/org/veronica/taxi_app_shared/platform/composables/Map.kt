package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import org.veronica.taxi_app.resources.AppResources

@Composable
actual fun Map(modifier: Modifier, userLocation: LatLng?) {
    val camaraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(
            LatLng(
                -8.162938650276201, -79.01217650462648
            ), 17.0f
        )
    }

    LaunchedEffect(userLocation) {
        if (userLocation != null) {
            camaraPositionState.position = CameraPosition.fromLatLngZoom(
                userLocation, 17.0f
            )
        }
    }



    GoogleMap(modifier = modifier, cameraPositionState = camaraPositionState) {
        val markerIcon = getMarkerBitmapDescriptor(AppResources.images.carromarker)

        if (userLocation != null)

            Marker(
                state = MarkerState(position = userLocation),
                icon = markerIcon,
                anchor = Offset(0.5f, 0.5f)
            )
    }
}