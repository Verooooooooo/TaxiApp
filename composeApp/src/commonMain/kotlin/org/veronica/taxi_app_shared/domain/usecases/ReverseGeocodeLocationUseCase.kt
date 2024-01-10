package org.veronica.taxi_app_shared.domain.usecases

import com.google.android.gms.maps.model.LatLng
import org.veronica.taxi_app_shared.domain.repos.MapsRepo

class ReverseGeocodeLocationUseCase(
    private val mapsRepo: MapsRepo
) {
    suspend operator fun invoke(location: LatLng) = mapsRepo.reverseGeocode(location)
}