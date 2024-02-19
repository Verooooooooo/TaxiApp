package org.veronica.taxi_app_shared.domain.usecases

import com.google.android.gms.maps.model.LatLng
import org.veronica.taxi_app_shared.domain.repos.RoutesRepo

class RequestARouteUseCase(
    private val routesRepo: RoutesRepo
) {
    suspend operator fun invoke(origin: LatLng, destination: LatLng): List<LatLng>? {
        return routesRepo.getRoute(origin, destination)
    }
}