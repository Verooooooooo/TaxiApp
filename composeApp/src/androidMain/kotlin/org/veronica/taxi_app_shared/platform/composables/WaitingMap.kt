package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
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
actual fun WaitingMap(route: Route) {
    var selectedLatLng by remember { mutableStateOf(route.polyline.coordinates.first()) }
    val cameraPosition = rememberCameraPositionState {
        position =
            CameraPosition.fromLatLngZoom(LatLng(-8.162938650276201, -79.01217650462648), 17.0f)
    }

    Column {
        GoogleMap(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray),
            cameraPositionState = cameraPosition,
        ) {
            // Add Polyline to the map
            Polyline(
                points = route.polyline.coordinates
            )
        }
    }
}

@Preview
@Composable
fun MapPreview() {
    val route = """{
	"routes": [
		{
			"distanceMeters": 10396,
			"duration": "2626s",
			"polyline": {
				"geoJsonLinestring": {
					"coordinates": [
						[
							-77.07808949999999,
							-11.991351199999999
						],
						[
							-77.0780909,
							-11.9913903
						],
						[
							-77.079518499999992,
							-11.9913063
						],
						[
							-77.079527599999992,
							-11.9914136
						],
						[
							-77.0802625,
							-11.9913782
						],
						[
							-77.0802696,
							-11.9915646
						],
						[
							-77.0777043,
							-11.991690499999999
						],
						[
							-77.0760325,
							-11.9917772
						],
						[
							-77.0752045,
							-11.991799199999999
						],
						[
							-77.0745668,
							-11.991727
						],
						[
							-77.072276,
							-11.9913904
						],
						[
							-77.07156169999999,
							-11.991257899999999
						],
						[
							-77.0697209,
							-11.9909768
						],
						[
							-77.0681165,
							-11.9907573
						],
						[
							-77.064831,
							-11.9902512
						],
						[
							-77.064634099999992,
							-11.9902246
						],
						[
							-77.0645685,
							-11.990314099999999
						],
						[
							-77.0645205,
							-11.9903549
						],
						[
							-77.0644502,
							-11.990501700000001
						],
						[
							-77.0644155,
							-11.9907677
						],
						[
							-77.0643022,
							-11.9913777
						],
						[
							-77.06408429999999,
							-11.9928166
						],
						[
							-77.0639722,
							-11.992939000000002
						],
						[
							-77.0637732,
							-11.9933023
						],
						[
							-77.063698,
							-11.993521399999999
						],
						[
							-77.0636056,
							-11.9938629
						],
						[
							-77.0635388,
							-11.993910699999999
						],
						[
							-77.063334400000016,
							-11.995282
						],
						[
							-77.0623911,
							-12.001136299999999
						],
						[
							-77.0621355,
							-12.0026488
						],
						[
							-77.062068299999993,
							-12.003159499999999
						],
						[
							-77.061950299999992,
							-12.0050375
						],
						[
							-77.061915,
							-12.0055255
						],
						[
							-77.061754999999991,
							-12.0064868
						],
						[
							-77.0616319,
							-12.0073642
						],
						[
							-77.061476399999989,
							-12.0080525
						],
						[
							-77.0610777,
							-12.009319399999999
						],
						[
							-77.0609777,
							-12.0097282
						],
						[
							-77.0608302,
							-12.010552299999999
						],
						[
							-77.0607055,
							-12.011424199999999
						],
						[
							-77.060509299999993,
							-12.0132269
						],
						[
							-77.0603658,
							-12.0139909
						],
						[
							-77.0601021,
							-12.0157502
						],
						[
							-77.0600307,
							-12.0161406
						],
						[
							-77.059359399999991,
							-12.0205384
						],
						[
							-77.0592296,
							-12.0212375
						],
						[
							-77.0588454,
							-12.0237765
						],
						[
							-77.0585846,
							-12.0254336
						],
						[
							-77.0583103,
							-12.0273805
						],
						[
							-77.058227399999993,
							-12.0277813
						],
						[
							-77.058118999999991,
							-12.028167499999999
						],
						[
							-77.0579621,
							-12.0286273
						],
						[
							-77.0576617,
							-12.0292782
						],
						[
							-77.0574704,
							-12.0296252
						],
						[
							-77.0573233,
							-12.029860999999999
						],
						[
							-77.056506,
							-12.0309998
						],
						[
							-77.055923499999992,
							-12.0316607
						],
						[
							-77.0554551,
							-12.032082100000002
						],
						[
							-77.05486239999999,
							-12.0325587
						],
						[
							-77.0541258,
							-12.0330692
						],
						[
							-77.0534485,
							-12.0334471
						],
						[
							-77.0530703,
							-12.033627
						],
						[
							-77.052218,
							-12.0339849
						],
						[
							-77.0516682,
							-12.0341895
						],
						[
							-77.0498341,
							-12.0349343
						],
						[
							-77.0492589,
							-12.0351457
						],
						[
							-77.0479273,
							-12.0355204
						],
						[
							-77.0473003,
							-12.0356675
						],
						[
							-77.0470437,
							-12.0358243
						],
						[
							-77.046692299999989,
							-12.0359757
						],
						[
							-77.0465665,
							-12.0360483
						],
						[
							-77.0459987,
							-12.0364495
						],
						[
							-77.0458402,
							-12.0364992
						],
						[
							-77.0438849,
							-12.037731299999999
						],
						[
							-77.043761899999993,
							-12.0377595
						],
						[
							-77.0436691,
							-12.0378248
						],
						[
							-77.0435766,
							-12.0379232
						],
						[
							-77.0433627,
							-12.0402615
						],
						[
							-77.0433436,
							-12.0408451
						],
						[
							-77.0432005,
							-12.04227
						],
						[
							-77.0431143,
							-12.0430025
						],
						[
							-77.0430137,
							-12.0444573
						],
						[
							-77.0430419,
							-12.0445035
						],
						[
							-77.0429626,
							-12.0455229
						],
						[
							-77.042981099999992,
							-12.045612499999999
						],
						[
							-77.0429722,
							-12.045866199999999
						],
						[
							-77.0430087,
							-12.0460031
						],
						[
							-77.0431191,
							-12.0460782
						],
						[
							-77.0431997,
							-12.0462391
						],
						[
							-77.0432246,
							-12.0463808
						],
						[
							-77.0432112,
							-12.0464845
						],
						[
							-77.0431307,
							-12.046650999999999
						],
						[
							-77.043083799999991,
							-12.046702199999999
						],
						[
							-77.0429039,
							-12.0467943
						],
						[
							-77.042728099999991,
							-12.0468139
						],
						[
							-77.042554,
							-12.0467848
						],
						[
							-77.0424207,
							-12.0466845
						],
						[
							-77.0423833,
							-12.0466424
						],
						[
							-77.041938899999991,
							-12.0469542
						],
						[
							-77.0404921,
							-12.047870399999999
						],
						[
							-77.0389247,
							-12.0489225
						],
						[
							-77.0371677,
							-12.0500265
						],
						[
							-77.036080599999991,
							-12.050747999999999
						],
						[
							-77.03519159999999,
							-12.051322899999999
						],
						[
							-77.0351223,
							-12.0514878
						],
						[
							-77.0355149,
							-12.052043800000002
						],
						[
							-77.035552299999992,
							-12.0521385
						]
					],
					"type": "LineString"
				}
			}
		}
	]
}"""
    val routeResponse = parseJsonToRoute(route)
    WaitingMap(route = routeResponse)
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
/*
@Serializable
data class GeoJsonLineString(
    val coordinates: List<List<Double>>,
    val type: String
)

@Serializable
data class Polyline(
    @SerialName("geoJsonLinestring")
    val geoJsonLineString: GeoJsonLineString
)

@Serializable
data class Route(
    val distanceMeters: Int,
    val duration: String,
    val polyline: Polyline
)
@Serializable
data class RouteResponse(
    val routes: List<Route>
)
fun main() {
    val json = """{
	"routes": [
		{
			"distanceMeters": 10396,
			"duration": "2626s",
			"polyline": {
				"geoJsonLinestring": {
					"coordinates": [
						[
							-77.07808949999999,
							-11.991351199999999
						],
						[
							-77.0780909,
							-11.9913903
						],
						[
							-77.079518499999992,
							-11.9913063
						],
						[
							-77.079527599999992,
							-11.9914136
						],
						[
							-77.0802625,
							-11.9913782
						],
						[
							-77.0802696,
							-11.9915646
						],
						[
							-77.0777043,
							-11.991690499999999
						],
						[
							-77.0760325,
							-11.9917772
						],
						[
							-77.0752045,
							-11.991799199999999
						],
						[
							-77.0745668,
							-11.991727
						],
						[
							-77.072276,
							-11.9913904
						],
						[
							-77.07156169999999,
							-11.991257899999999
						],
						[
							-77.0697209,
							-11.9909768
						],
						[
							-77.0681165,
							-11.9907573
						],
						[
							-77.064831,
							-11.9902512
						],
						[
							-77.064634099999992,
							-11.9902246
						],
						[
							-77.0645685,
							-11.990314099999999
						],
						[
							-77.0645205,
							-11.9903549
						],
						[
							-77.0644502,
							-11.990501700000001
						],
						[
							-77.0644155,
							-11.9907677
						],
						[
							-77.0643022,
							-11.9913777
						],
						[
							-77.06408429999999,
							-11.9928166
						],
						[
							-77.0639722,
							-11.992939000000002
						],
						[
							-77.0637732,
							-11.9933023
						],
						[
							-77.063698,
							-11.993521399999999
						],
						[
							-77.0636056,
							-11.9938629
						],
						[
							-77.0635388,
							-11.993910699999999
						],
						[
							-77.063334400000016,
							-11.995282
						],
						[
							-77.0623911,
							-12.001136299999999
						],
						[
							-77.0621355,
							-12.0026488
						],
						[
							-77.062068299999993,
							-12.003159499999999
						],
						[
							-77.061950299999992,
							-12.0050375
						],
						[
							-77.061915,
							-12.0055255
						],
						[
							-77.061754999999991,
							-12.0064868
						],
						[
							-77.0616319,
							-12.0073642
						],
						[
							-77.061476399999989,
							-12.0080525
						],
						[
							-77.0610777,
							-12.009319399999999
						],
						[
							-77.0609777,
							-12.0097282
						],
						[
							-77.0608302,
							-12.010552299999999
						],
						[
							-77.0607055,
							-12.011424199999999
						],
						[
							-77.060509299999993,
							-12.0132269
						],
						[
							-77.0603658,
							-12.0139909
						],
						[
							-77.0601021,
							-12.0157502
						],
						[
							-77.0600307,
							-12.0161406
						],
						[
							-77.059359399999991,
							-12.0205384
						],
						[
							-77.0592296,
							-12.0212375
						],
						[
							-77.0588454,
							-12.0237765
						],
						[
							-77.0585846,
							-12.0254336
						],
						[
							-77.0583103,
							-12.0273805
						],
						[
							-77.058227399999993,
							-12.0277813
						],
						[
							-77.058118999999991,
							-12.028167499999999
						],
						[
							-77.0579621,
							-12.0286273
						],
						[
							-77.0576617,
							-12.0292782
						],
						[
							-77.0574704,
							-12.0296252
						],
						[
							-77.0573233,
							-12.029860999999999
						],
						[
							-77.056506,
							-12.0309998
						],
						[
							-77.055923499999992,
							-12.0316607
						],
						[
							-77.0554551,
							-12.032082100000002
						],
						[
							-77.05486239999999,
							-12.0325587
						],
						[
							-77.0541258,
							-12.0330692
						],
						[
							-77.0534485,
							-12.0334471
						],
						[
							-77.0530703,
							-12.033627
						],
						[
							-77.052218,
							-12.0339849
						],
						[
							-77.0516682,
							-12.0341895
						],
						[
							-77.0498341,
							-12.0349343
						],
						[
							-77.0492589,
							-12.0351457
						],
						[
							-77.0479273,
							-12.0355204
						],
						[
							-77.0473003,
							-12.0356675
						],
						[
							-77.0470437,
							-12.0358243
						],
						[
							-77.046692299999989,
							-12.0359757
						],
						[
							-77.0465665,
							-12.0360483
						],
						[
							-77.0459987,
							-12.0364495
						],
						[
							-77.0458402,
							-12.0364992
						],
						[
							-77.0438849,
							-12.037731299999999
						],
						[
							-77.043761899999993,
							-12.0377595
						],
						[
							-77.0436691,
							-12.0378248
						],
						[
							-77.0435766,
							-12.0379232
						],
						[
							-77.0433627,
							-12.0402615
						],
						[
							-77.0433436,
							-12.0408451
						],
						[
							-77.0432005,
							-12.04227
						],
						[
							-77.0431143,
							-12.0430025
						],
						[
							-77.0430137,
							-12.0444573
						],
						[
							-77.0430419,
							-12.0445035
						],
						[
							-77.0429626,
							-12.0455229
						],
						[
							-77.042981099999992,
							-12.045612499999999
						],
						[
							-77.0429722,
							-12.045866199999999
						],
						[
							-77.0430087,
							-12.0460031
						],
						[
							-77.0431191,
							-12.0460782
						],
						[
							-77.0431997,
							-12.0462391
						],
						[
							-77.0432246,
							-12.0463808
						],
						[
							-77.0432112,
							-12.0464845
						],
						[
							-77.0431307,
							-12.046650999999999
						],
						[
							-77.043083799999991,
							-12.046702199999999
						],
						[
							-77.0429039,
							-12.0467943
						],
						[
							-77.042728099999991,
							-12.0468139
						],
						[
							-77.042554,
							-12.0467848
						],
						[
							-77.0424207,
							-12.0466845
						],
						[
							-77.0423833,
							-12.0466424
						],
						[
							-77.041938899999991,
							-12.0469542
						],
						[
							-77.0404921,
							-12.047870399999999
						],
						[
							-77.0389247,
							-12.0489225
						],
						[
							-77.0371677,
							-12.0500265
						],
						[
							-77.036080599999991,
							-12.050747999999999
						],
						[
							-77.03519159999999,
							-12.051322899999999
						],
						[
							-77.0351223,
							-12.0514878
						],
						[
							-77.0355149,
							-12.052043800000002
						],
						[
							-77.035552299999992,
							-12.0521385
						]
					],
					"type": "LineString"
				}
			}
		}
	]
}"""
    val routeResponse = Json.decodeFromString<RouteResponse>(json)

// Acceder al primer elemento de la lista de rutas y convertir la polyline a un Map
    val firstRoute = routeResponse.routes.first()
    val polylineMap: Map<String, Any> = mapOf(
        "coordinates" to firstRoute.polyline.geoJsonLineString.coordinates,
        "type" to firstRoute.polyline.geoJsonLineString.type
    )

    println(polylineMap)
}

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
            main()

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
*/
