package org.veronica.taxi_app_shared.data.repos

import com.google.android.gms.maps.model.LatLng
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable
import org.veronica.taxi_app_shared.domain.repos.RoutesRepo

class ApiRoutesRepo(
    private val httpClient: HttpClient
) : RoutesRepo {
    override suspend fun getRoute(origin: LatLng, destination: LatLng): List<LatLng>? {
        val url = "https://taxiapp.2hubrulee.com/compute_route"

        val body = ComputeRouteBody(
            Origin(origin.latitude, origin.longitude),
            Destination(destination.latitude, destination.longitude)
        )

        println("body")
        println(body)

        val response = httpClient.post(url) {
            contentType(ContentType.Application.Json)
            setBody(
                body

            )
        }

        if (response.status.value != 200) {
            return null
        }

        return try {
            val responseBody = response.body<ComputeRouteResponseBody>()

            val route = responseBody.polyline.map { LatLng(it[1], it[0]) }

            println("route")
            println(route)
            route
        } catch (e: Exception) {
            println("ERROR: $e")
            null
        }
    }
}

@Serializable
data class ComputeRouteBody(
    val origin: Origin,
    val destination: Destination,
)

@Serializable
data class Origin(
    val latitude: Double,
    val longitude: Double,
)

@Serializable
data class Destination(
    val latitude: Double,
    val longitude: Double,
)

@Serializable
data class ComputeRouteResponseBody(
    val distanceMeters: Long,
    val durationSeconds: Long,
    val polyline: List<List<Double>>,
)
