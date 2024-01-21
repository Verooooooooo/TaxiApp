package org.veronica.taxi_app_shared.presentation.passenger.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.veronica.taxi_app.resources.AppResources
import org.veronica.taxi_app_shared.platform.composables.WaitingMap
import org.veronica.taxi_app_shared.platform.composables.parseJsonToRoute
import org.veronica.taxi_app_shared.presentation.shared.composables.Atras
import org.veronica.taxi_app_shared.presentation.shared.composables.SimpleFilledTextFieldSample

class WaitingDriver : Screen {
    @Composable
    override fun Content() {
        WaitingDriverContent()
    }
}

@Composable
fun WaitingDriverContent() {
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                WaitingMap(
                    parseJsonToRoute(
                        """{
    "routes": [
        {
            "distanceMeters": 567,
            "duration": "115s",
            "polyline": {
                "geoJsonLinestring": {
                    "type": "LineString",
                    "coordinates": [
                        [
                            -79.012890099999993,
                            -8.1633737
                        ],
                        [
                            -79.012514299999992,
                            -8.1622547000000019
                        ],
                        [
                            -79.012469799999991,
                            -8.1620846
                        ],
                        [
                            -79.0115773,
                            -8.162416799999999
                        ],
                        [
                            -79.0114282,
                            -8.162416799999999
                        ],
                        [
                            -79.01104629999999,
                            -8.1622832
                        ],
                        [
                            -79.01098429999999,
                            -8.162250199999999
                        ],
                        [
                            -79.0107897,
                            -8.1626032999999989
                        ],
                        [
                            -79.0106916,
                            -8.1631410999999989
                        ],
                        [
                            -79.0105267,
                            -8.1636572
                        ],
                        [
                            -79.010334899999989,
                            -8.1643233999999989
                        ]
                    ]
                }
            }
        }
    ]
}"""
                    )
                )


                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                    ) {
                        Atras("Waiting")

                    }
                }

            }
            Box(Modifier) {
                SimpleFilledTextFieldSample(
                    "Esperando conductor",
                    modifier = Modifier.fillMaxWidth(),
                    icon = AppResources.images.reloj,
                    enabled = false
                )
            }
        }


    }


}
