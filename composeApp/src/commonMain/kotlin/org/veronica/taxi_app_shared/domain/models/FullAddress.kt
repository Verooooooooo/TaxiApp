package org.veronica.taxi_app_shared.domain.models

import com.google.android.gms.maps.model.LatLng

data class FullAddress(
    val address: String,
    val location: LatLng
)