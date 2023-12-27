package Composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
actual fun Map(modifier: Modifier) {
    val posicionFake = LatLng(-8.162938650276201, -79.01217650462648)//direccion CORARVI
    val camaraPositionState =
        rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(posicionFake, 17.0f)
        }
    GoogleMap(modifier = modifier, cameraPositionState = camaraPositionState) {

    }
}