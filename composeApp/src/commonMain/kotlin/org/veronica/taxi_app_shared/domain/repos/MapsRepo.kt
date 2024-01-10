package org.veronica.taxi_app_shared.domain.repos

import com.google.android.gms.maps.model.LatLng


interface MapsRepo {
    suspend fun reverseGeocode(
        location: LatLng
    ): String?
}