package Share.Screens

import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json


data class DestinyPickerState(
    val selectedLocation: LatLng? = null,
    val selectedLocationName: String? = null
)

class DestinyPickerViewModel : ViewModel() {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    private val _state = MutableStateFlow(DestinyPickerState())
    val state = _state.asStateFlow()


    fun selectLocation(
        location: LatLng
    ) {

        viewModelScope.launch {
            val url =
                "https://maps.googleapis.com/maps/api/geocode/json?latlng=${location.latitude},${location.longitude}&key=AIzaSyA8jZgoUqTBequOj25an-SleWmdiMWoIa8"

            println(url)

            val locationResponse: GeocodingResponse =
                httpClient.get(url)
                    .body()
            println(locationResponse)

            _state.update {
                it.copy(
                    selectedLocation = location,
                    selectedLocationName = locationResponse.results.getOrNull(0)?.formatted_address ?: "Direccion desconocida"
                )
            }
        }


    }


}
