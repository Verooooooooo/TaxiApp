package Platform

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import dev.icerock.moko.resources.ImageResource
import org.veronica.taxi_app.R
import org.veronica.taxi_app.resources.AppResources

@Composable
actual fun InteractiveMap(onLocationSelected: (LatLng) -> Unit) {
    var puntoSeleccionado by remember { mutableStateOf<LatLng?>(null) }

    val cameraPosition = rememberCameraPositionState {
        position =
            CameraPosition.fromLatLngZoom(LatLng(-8.162938650276201, -79.01217650462648), 17.0f)
    }

    val markerIcon = getMarkerBitmapDescriptor(AppResources.images.carrito)

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

            if (puntoSeleccionado != null) {
                Marker(
                    state = MarkerState(puntoSeleccionado!!),
                    icon = markerIcon,
                    anchor = Offset(0.5f, 0.5f)
                )
            }
        }
    }
}

@Composable
fun getMarkerBitmapDescriptor(resource: ImageResource): BitmapDescriptor? {
    val drawable =
        ContextCompat.getDrawable(LocalContext.current, resource.drawableResId) ?: return null

    val bitmap = Bitmap.createBitmap(
        drawable.intrinsicWidth,
        drawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
    )

    val canvas = Canvas(bitmap)
    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)

    val resizedBitmap = Bitmap.createScaledBitmap(bitmap, 260, 260, false)

    return BitmapDescriptorFactory.fromBitmap(resizedBitmap)
}
