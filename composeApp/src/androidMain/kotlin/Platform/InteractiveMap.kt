package Platform

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
actual fun InteractiveMap(onLocationSelected: (LatLng) -> Unit) {
    var puntoSeleccionado by remember { mutableStateOf<LatLng?>(null) }

    val cameraPosition = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(LatLng(-8.162938650276201, -79.01217650462648), 17.0f)
    }



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
        )
    }
    LaunchedEffect(puntoSeleccionado) {
        Log.d("InteractiveMap", "Ubicación seleccionada: $puntoSeleccionado")
    }

}
