package org.veronica.taxi_app_shared.domain.repos

import com.google.android.gms.maps.model.LatLng

interface RoutesRepo {
    suspend fun getRoute(origin: LatLng, destination: LatLng): List<LatLng>?

}