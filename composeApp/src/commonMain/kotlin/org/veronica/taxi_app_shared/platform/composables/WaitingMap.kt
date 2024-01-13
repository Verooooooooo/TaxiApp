package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.model.LatLng

@Composable
expect fun WaitingMap(onLocationSelected: (LatLng) -> Unit)