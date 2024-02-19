import com.google.android.gms.maps.model.LatLng
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.veronica.taxi_app_shared.domain.models.GoogleMapRoute
import org.veronica.taxi_app_shared.domain.usecases.GetUserRideIntentUseCase
import org.veronica.taxi_app_shared.domain.usecases.RequestARouteUseCase


data class RideUiState(
    val origin: LatLng?,
    val destination: LatLng?,
    val route: GoogleMapRoute?
)


class RideViewModel(
    private val getUserRideIntentUseCase: GetUserRideIntentUseCase,
    private val requestARouteUseCase: RequestARouteUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(
        RideUiState(
            origin = null,
            destination = null,
            route = null
        )
    )

    val uiState = _uiState.asStateFlow()

    // PASO 1
    // SACAR DATOS DE SQLITE
    // ORIGEN Y DESTINO

    init {
        viewModelScope.launch {
            val rideIntent = getUserRideIntentUseCase()
            _uiState.value = _uiState.value.copy(
                origin = rideIntent.origin?.location,
                destination = rideIntent.destination?.location
            )

            if (rideIntent.origin != null && rideIntent.destination != null) {
                val route = requestARouteUseCase(
                    origin = rideIntent.origin.location!!,
                    destination = rideIntent.destination.location!!
                )

                if (route != null) {
                    _uiState.value = _uiState.value.copy(route = route)
                }
            }
        }
    }
}