package org.veronica.taxi_app_shared.domain.usecases

import dev.icerock.moko.geo.LatLng
import dev.icerock.moko.geo.LocationTracker
import kotlinx.coroutines.flow.Flow

class GetUserLocationUseCase(
    private val locationTracker: LocationTracker
) {
    suspend operator fun invoke(): Flow<LatLng> {
        return locationTracker.getLocationsFlow()
    }
}