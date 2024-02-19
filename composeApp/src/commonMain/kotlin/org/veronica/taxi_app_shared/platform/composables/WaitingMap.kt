package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable
import org.veronica.taxi_app_shared.data.repos.SqlRideIntentsRepo

@Composable
expect fun WaitingMap(

                      rideIntentsRepo: SqlRideIntentsRepo,
                      userId: String
)