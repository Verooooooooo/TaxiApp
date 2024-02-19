package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.model.LatLng
import org.veronica.taxi_app_shared.domain.models.GoogleMapRoute

@Composable
expect fun WaitingMap(
    origin: LatLng,
    destination: LatLng,
    route: GoogleMapRoute
)