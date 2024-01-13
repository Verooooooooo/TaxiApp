package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.LatLng

@Composable
expect fun Map(modifier: Modifier = Modifier, userLocation: LatLng?)