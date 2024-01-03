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
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap

@Composable
actual fun InteractiveMap(onLocationSelected: (LatLng) -> Unit) {
    var puntoSeleccionado by remember { mutableStateOf<LatLng?>(null) }



    Surface(
        modifier = Modifier.fillMaxSize()

    ) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),

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
