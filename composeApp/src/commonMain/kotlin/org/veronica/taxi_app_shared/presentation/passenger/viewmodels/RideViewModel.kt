
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import io.ktor.client.HttpClient
import org.veronica.taxi_app_shared.data.repos.GoogleMapsRepo
import org.veronica.taxi_app_shared.domain.repos.MapsRepo

class RideViewModel(
    private val httpClient: HttpClient,
    private val mapsRepo: MapsRepo
) : ViewModel() {

    private val googleMapsRepo = GoogleMapsRepo(httpClient)
    // Esta función calcula y dibuja la ruta en el mapa
    suspend fun drawRoute(origin: LatLng, destination: LatLng, googleMap: GoogleMap) {
        // Aquí puedes utilizar el repositorio de Google Maps para calcular la ruta entre las coordenadas de origen y destino
        // Por simplicidad, este ejemplo solo invoca el repositorio de geocodificación inversa para obtener direcciones
        val originAddress = mapsRepo.reverseGeocode(origin)
        val destinationAddress = mapsRepo.reverseGeocode(destination)

        // En una implementación real, deberías usar la API Directions de Google Maps para obtener la ruta entre el origen y el destino
        // Aquí, por simplicidad, solo agregamos una línea recta entre el origen y el destino al mapa
        val polylineOptions = PolylineOptions().add(origin, destination)
        googleMap.addPolyline(polylineOptions)

        // Puedes usar los marcadores para mostrar el origen y el destino en el mapa
        googleMap.addMarker(MarkerOptions().position(origin).title("Origen: $originAddress"))
        googleMap.addMarker(MarkerOptions().position(destination).title("Destino: $destinationAddress"))

        // Ajusta la cámara del mapa para que muestre toda la ruta
        val boundsBuilder = LatLngBounds.Builder()
        boundsBuilder.include(origin)
        boundsBuilder.include(destination)
        val bounds = boundsBuilder.build()
        val padding = 100 // Padding para los bordes del mapa
        googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, padding))
    }
}