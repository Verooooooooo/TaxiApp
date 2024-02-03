package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.URLBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject


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
    originAddress: String,
    destinationAddress: String
) {
    var originLatLng by remember { mutableStateOf<LatLng?>(null) }
    var destinationLatLng by remember { mutableStateOf<LatLng?>(null) }
    var route by remember { mutableStateOf<Route?>(null) }

    // Obtener las coordenadas de la dirección de origen
    LaunchedEffect(originAddress) {
        originLatLng = getLatLngFromAddress(originAddress)
    }

    // Obtener las coordenadas de la dirección de destino
    LaunchedEffect(destinationAddress) {
        destinationLatLng = getLatLngFromAddress(destinationAddress)
    }

    // Calcular la ruta cuando se tengan las coordenadas de origen y destino
    LaunchedEffect(originLatLng, destinationLatLng) {
        if (originLatLng != null && destinationLatLng != null) {
            route = calculateRoute(originLatLng!!, destinationLatLng!!)
        }
    }

    // Mostrar el mapa y la ruta una vez que esté disponible
    Column {
        if (route != null) {
            GoogleMap(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray),
                cameraPositionState = rememberCameraPositionState {
                    position = CameraPosition.fromLatLngZoom(
                        originLatLng ?: destinationLatLng ?: LatLng(0.0, 0.0),  // Posición de la cámara en función de las coordenadas disponibles
                        17.0f
                    )
                }
            ) {
                // Dibujar la ruta en el mapa
                route?.let {
                    Polyline(points = it.polyline.coordinates)
                }

                // Mostrar marcadores de origen y destino si las coordenadas están disponibles
                originLatLng?.let {
                    Marker(
                        state = MarkerState(position = it),
                        title = "Origen",
                        snippet = "Coordenadas del Origen: ${it.latitude}, ${it.longitude}"
                    )
                }

                destinationLatLng?.let {
                    Marker(
                        state = MarkerState(position = it),
                        title = "Destino",
                        snippet = "Coordenadas del Destino: ${it.latitude}, ${it.longitude}"
                    )
                }
            }
        } else {
            // Mostrar un indicador de carga mientras se obtiene la ruta
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}

/*
// Define la función calculateRoute con los parámetros de origen y destino
suspend fun calculateRoute(origin: FullAddress, destination: FullAddress): Route {
    // Accede a las coordenadas de origen y destino
    val originLatLng = origin.location
    val destinationLatLng = destination.location

    // Llama a la función que calcula la ruta con las coordenadas de origen y destino
    return calculateRoute(originLatLng, destinationLatLng)
}*/

// Esta función calcularía la ruta utilizando las coordenadas de origen y destino
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

   /* return Route(
        distanceMeters = 10000,
        duration = "30 mins",
        polyline = PolylineDef(
            coordinates = listOf(origin, destination),
            type = "LineString"
        )
    )*/
}
suspend fun getLatLngFromAddress(address: String): LatLng? {
    val apiKey = "AIzaSyA8jZgoUqTBequOj25an-SleWmdiMWoIa8" // Reemplaza "TU_API_KEY" con tu propia clave de API de Google Maps

    val client = HttpClient()

    return try {
        val url = URLBuilder("https://maps.googleapis.com/maps/api/geocode/json").apply {
            parameters.append("address", address)
            parameters.append("key", apiKey)
        }

        val response: HttpResponse = withContext(Dispatchers.IO) {
            client.get(url.toString())
        }

        if (response.status.value == 200) {
            val json = JSONObject(response.bodyAsText())
            if (json.getString("status") == "OK") {
                val results = json.getJSONArray("results")
                if (results.length() > 0) {
                    val location = results.getJSONObject(0).getJSONObject("geometry").getJSONObject("location")
                    val lat = location.getDouble("lat")
                    val lng = location.getDouble("lng")
                    LatLng(lat, lng)
                } else {
                    null
                }
            } else {
                null
            }
        } else {
            null
        }
    } catch (e: Exception) {
        e.printStackTrace()
        null
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

