package org.veronica.taxi_app_shared.platform.composables

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.URLBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import org.veronica.taxi_app_shared.data.repos.SqlRideIntentsRepo
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.RideViewModel


data class Route(
    val distanceMeters: Int,
    val duration: String,
    val polyline: PolylineDef
)

data class PolylineDef(
    val coordinates: List<LatLng>,
    val type: String
)


@Composable
actual fun WaitingMap(
    rideIntentsRepo: SqlRideIntentsRepo,
    userId: String
) {

    // Estado para almacenar la ruta
    var route by remember { mutableStateOf<Route?>(null) }

    // Obtener las coordenadas de origen y destino del repositorio
    val (origin, destination) = remember(userId) { rideIntentsRepo.getOriginAndDestinationCoordinates(userId) }

    // Calcular la ruta cuando se obtengan las coordenadas de origen y destino
    LaunchedEffect(origin, destination) {
        if (origin != null && destination != null) {
            route = calculateRoute(origin, destination)
        }
    }

    // Mostrar el mapa y la ruta una vez que estén disponibles
    Column {
        if (route != null) {
            GoogleMap(
                modifier = Modifier.fillMaxSize(),
                cameraPositionState = rememberCameraPositionState {
                    position = CameraPosition.fromLatLngZoom(origin ?: LatLng(0.0, 0.0), 17.0f)
                }
            ) { googleMap ->
                route?.let {
                    drawRoute(googleMap, it)
                }
            }
        } else {
            // Mostrar un indicador de carga mientras se obtiene la ruta
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}
private fun drawRoute(googleMap: GoogleMap, route: Route) {
    val polylineOptions = PolylineOptions().apply {
        addAll(route.polyline.coordinates)
        color(Color.RED)
        width(5f)
    }
    googleMap.addPolyline(polylineOptions)

    // Añadir marcadores para el origen y el destino
    googleMap.addMarker(MarkerOptions().position(route.polyline.coordinates.first()).title("Origen"))
    googleMap.addMarker(MarkerOptions().position(route.polyline.coordinates.last()).title("Destino"))

    // Ajustar la cámara para mostrar la ruta completa
    val builder = LatLngBounds.Builder()
    for (point in route.polyline.coordinates) {
        builder.include(point)
    }
    val bounds = builder.build()
    googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100))
}
suspend fun calculateRoute(origin: LatLng, destination: LatLng): Route {
    // Aquí iría la lógica para calcular la ruta utilizando alguna API de mapas
    // Por ejemplo, podrías hacer una solicitud a Google Directions API para obtener la ruta entre las coordenadas de origen y destino
    // Devuelve la ruta calculada (simulada aquí)

    val apiKey = "AIzaSyA8jZgoUqTBequOj25an-SleWmdiMWoIa8" // Reemplaza "TU_API_KEY" con tu propia clave de API de Google Maps

    val client = HttpClient()

    return try {
        val url = URLBuilder("https://maps.googleapis.com/maps/api/directions/json").apply {
            parameters.append("origin", "${origin.latitude},${origin.longitude}")
            parameters.append("destination", "${destination.latitude},${destination.longitude}")
            parameters.append("key", apiKey)
        }

        val response: HttpResponse = withContext(Dispatchers.IO) {
            client.get(url.toString())
        }

        if (response.status.value == 200) {
            val jsonString = response.bodyAsText()
            val route = parseJsonToRoute(jsonString)
            route
        } else {
            // Simular una ruta en caso de error en la solicitud HTTP
            Route(
                distanceMeters = 10000,
                duration = "30 mins",
                polyline = PolylineDef(
                    coordinates = listOf(origin, destination),
                    type = "LineString"
                )
            )
        }
    } catch (e: Exception) {
        // En caso de excepción
        e.printStackTrace()
        // Simular una ruta en caso de excepción
        Route(
            distanceMeters = 10000,
            duration = "30 mins",
            polyline = PolylineDef(
                coordinates = listOf(origin, destination),
                type = "LineString"
            )
        )
    } finally {
        client.close()
    }

}

fun parseJsonToRoute(jsonString: String): Route {
    val jsonObject = JSONObject(jsonString)
    val routeArray = jsonObject.getJSONArray("routes")
    val routeObject = routeArray.getJSONObject(0)

    val distanceMeters = routeObject.getInt("distanceMeters")
    val duration = routeObject.getString("duration")

    val polylineObject = routeObject.getJSONObject("polyline")
    val coordinatesArray = polylineObject
        .getJSONObject("geoJsonLinestring")
        .getJSONArray("coordinates")

    val coordinates = mutableListOf<LatLng>()
    for (i in 0 until coordinatesArray.length()) {
        val coordinateArray = coordinatesArray.getJSONArray(i)
        val latitude = coordinateArray.getDouble(1)
        val longitude = coordinateArray.getDouble(0)
        coordinates.add(LatLng(latitude, longitude))
    }

    val polylineType = polylineObject.getJSONObject("geoJsonLinestring").getString("type")

    val polyline = PolylineDef(coordinates, polylineType)

    return Route(distanceMeters, duration, polyline)
}

