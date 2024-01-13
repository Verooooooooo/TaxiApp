package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
actual fun WaitingMap (onLocationSelected: (LatLng) -> Unit) {

    var puntoSeleccionado by remember { mutableStateOf<LatLng?>(null) }

    val Universidad = LatLng(-8.160179107975464, -79.01141277579063)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(Universidad, 17f)
    }
    val chofer1 = LatLng(-8.159276389303571, -79.01330105089978)
    val chofer2 = LatLng(-8.160625156448766, -79.0109299781775)
    val chofer3 = LatLng(-8.160826940118337, -79.01257149006214)

    val markerIcon = getMarkerBitmapDescriptor(AppResources.images.carromarker)

    val cameraPosition = rememberCameraPositionState {
        position =
            CameraPosition.fromLatLngZoom(LatLng(-8.162938650276201, -79.01217650462648), 17.0f)
    }

    val markerIcon1 = getMarkerBitmapDescriptor(AppResources.images.carrito)

    val markerIcon2 = getMarkerBitmapDescriptor(AppResources.images.carrito)

    val markerIcon3 = getMarkerBitmapDescriptor(AppResources.images.carrito)
    Surface(
        modifier = Modifier.fillMaxSize()

    ) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPosition,
            onMapClick = { latLng ->
                // Selecciona la ubicación y llama a la función de devolución de llamada
                puntoSeleccionado = latLng
                onLocationSelected.invoke(latLng)
            }
        ) {

            //Del cliente
            Marker(
                state = MarkerState(position = Universidad),
                icon = markerIcon,
                anchor = Offset(0.5f, 0.5f)
                )

            //Choferes
            Marker(
                state = MarkerState(position = chofer1),
                icon = markerIcon1,
                anchor = Offset(0.5f, 0.5f)
            )

            Marker(
                state = MarkerState(position = chofer2),
                icon = markerIcon2,
                anchor = Offset(0.5f, 0.5f)
            )

            Marker(
                state = MarkerState(position = chofer3),
                icon = markerIcon3,
                anchor = Offset(0.5f, 0.5f)
            )

        }
    }
}

