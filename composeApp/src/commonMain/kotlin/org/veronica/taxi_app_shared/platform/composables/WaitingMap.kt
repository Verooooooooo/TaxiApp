package org.veronica.taxi_app_shared.platform.composables

import androidx.compose.runtime.Composable

@Composable
expect fun WaitingMap(originAddress: String,
                      destinationAddress: String
)