package Platform

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.model.LatLng

@Composable
expect fun InteractiveMap(onLocationSelected: (LatLng) -> Unit)