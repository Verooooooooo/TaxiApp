package org.veronica.taxi_app_shared.data.repos

import com.google.android.gms.maps.model.LatLng
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.veronica.taxi_app_shared.domain.repos.MapsRepo
import org.veronica.taxiapp.buildconfig.AppConfig

class GoogleMapsRepo(
    private val httpClient: HttpClient
) : MapsRepo {
    private val geocodeUrl = "https://maps.googleapis.com/maps/api/geocode/json"

    override suspend fun reverseGeocode(location: LatLng): String? {
        val response: GeocodingResponse = httpClient.get(
            "$geocodeUrl?latlng=${location.latitude},${location.longitude}&key=${AppConfig.MAPS_API_KEY}"
        ).body()

        return response.results.firstOrNull()?.formattedAddress
    }
}

@Serializable
data class Result(
    @SerialName("formatted_address")
    val formattedAddress: String,
)

@Serializable
data class GeocodingResponse(
    val results: List<Result>,
)
