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
                WaitingMap(parseJsonToRoute("""{
	"routes": [
		{
			"distanceMeters": 10396,
			"duration": "2626s",
			"polyline": {
				"geoJsonLinestring": {
					"coordinates": [
						[
							-77.07808949999999,
							-11.991351199999999
						],
						[
							-77.0780909,
							-11.9913903
						],
						[
							-77.079518499999992,
							-11.9913063
						],
						[
							-77.079527599999992,
							-11.9914136
						],
						[
							-77.0802625,
							-11.9913782
						],
						[
							-77.0802696,
							-11.9915646
						],
						[
							-77.0777043,
							-11.991690499999999
						],
						[
							-77.0760325,
							-11.9917772
						],
						[
							-77.0752045,
							-11.991799199999999
						],
						[
							-77.0745668,
							-11.991727
						],
						[
							-77.072276,
							-11.9913904
						],
						[
							-77.07156169999999,
							-11.991257899999999
						],
						[
							-77.0697209,
							-11.9909768
						],
						[
							-77.0681165,
							-11.9907573
						],
						[
							-77.064831,
							-11.9902512
						],
						[
							-77.064634099999992,
							-11.9902246
						],
						[
							-77.0645685,
							-11.990314099999999
						],
						[
							-77.0645205,
							-11.9903549
						],
						[
							-77.0644502,
							-11.990501700000001
						],
						[
							-77.0644155,
							-11.9907677
						],
						[
							-77.0643022,
							-11.9913777
						],
						[
							-77.06408429999999,
							-11.9928166
						],
						[
							-77.0639722,
							-11.992939000000002
						],
						[
							-77.0637732,
							-11.9933023
						],
						[
							-77.063698,
							-11.993521399999999
						],
						[
							-77.0636056,
							-11.9938629
						],
						[
							-77.0635388,
							-11.993910699999999
						],
						[
							-77.063334400000016,
							-11.995282
						],
						[
							-77.0623911,
							-12.001136299999999
						],
						[
							-77.0621355,
							-12.0026488
						],
						[
							-77.062068299999993,
							-12.003159499999999
						],
						[
							-77.061950299999992,
							-12.0050375
						],
						[
							-77.061915,
							-12.0055255
						],
						[
							-77.061754999999991,
							-12.0064868
						],
						[
							-77.0616319,
							-12.0073642
						],
						[
							-77.061476399999989,
							-12.0080525
						],
						[
							-77.0610777,
							-12.009319399999999
						],
						[
							-77.0609777,
							-12.0097282
						],
						[
							-77.0608302,
							-12.010552299999999
						],
						[
							-77.0607055,
							-12.011424199999999
						],
						[
							-77.060509299999993,
							-12.0132269
						],
						[
							-77.0603658,
							-12.0139909
						],
						[
							-77.0601021,
							-12.0157502
						],
						[
							-77.0600307,
							-12.0161406
						],
						[
							-77.059359399999991,
							-12.0205384
						],
						[
							-77.0592296,
							-12.0212375
						],
						[
							-77.0588454,
							-12.0237765
						],
						[
							-77.0585846,
							-12.0254336
						],
						[
							-77.0583103,
							-12.0273805
						],
						[
							-77.058227399999993,
							-12.0277813
						],
						[
							-77.058118999999991,
							-12.028167499999999
						],
						[
							-77.0579621,
							-12.0286273
						],
						[
							-77.0576617,
							-12.0292782
						],
						[
							-77.0574704,
							-12.0296252
						],
						[
							-77.0573233,
							-12.029860999999999
						],
						[
							-77.056506,
							-12.0309998
						],
						[
							-77.055923499999992,
							-12.0316607
						],
						[
							-77.0554551,
							-12.032082100000002
						],
						[
							-77.05486239999999,
							-12.0325587
						],
						[
							-77.0541258,
							-12.0330692
						],
						[
							-77.0534485,
							-12.0334471
						],
						[
							-77.0530703,
							-12.033627
						],
						[
							-77.052218,
							-12.0339849
						],
						[
							-77.0516682,
							-12.0341895
						],
						[
							-77.0498341,
							-12.0349343
						],
						[
							-77.0492589,
							-12.0351457
						],
						[
							-77.0479273,
							-12.0355204
						],
						[
							-77.0473003,
							-12.0356675
						],
						[
							-77.0470437,
							-12.0358243
						],
						[
							-77.046692299999989,
							-12.0359757
						],
						[
							-77.0465665,
							-12.0360483
						],
						[
							-77.0459987,
							-12.0364495
						],
						[
							-77.0458402,
							-12.0364992
						],
						[
							-77.0438849,
							-12.037731299999999
						],
						[
							-77.043761899999993,
							-12.0377595
						],
						[
							-77.0436691,
							-12.0378248
						],
						[
							-77.0435766,
							-12.0379232
						],
						[
							-77.0433627,
							-12.0402615
						],
						[
							-77.0433436,
							-12.0408451
						],
						[
							-77.0432005,
							-12.04227
						],
						[
							-77.0431143,
							-12.0430025
						],
						[
							-77.0430137,
							-12.0444573
						],
						[
							-77.0430419,
							-12.0445035
						],
						[
							-77.0429626,
							-12.0455229
						],
						[
							-77.042981099999992,
							-12.045612499999999
						],
						[
							-77.0429722,
							-12.045866199999999
						],
						[
							-77.0430087,
							-12.0460031
						],
						[
							-77.0431191,
							-12.0460782
						],
						[
							-77.0431997,
							-12.0462391
						],
						[
							-77.0432246,
							-12.0463808
						],
						[
							-77.0432112,
							-12.0464845
						],
						[
							-77.0431307,
							-12.046650999999999
						],
						[
							-77.043083799999991,
							-12.046702199999999
						],
						[
							-77.0429039,
							-12.0467943
						],
						[
							-77.042728099999991,
							-12.0468139
						],
						[
							-77.042554,
							-12.0467848
						],
						[
							-77.0424207,
							-12.0466845
						],
						[
							-77.0423833,
							-12.0466424
						],
						[
							-77.041938899999991,
							-12.0469542
						],
						[
							-77.0404921,
							-12.047870399999999
						],
						[
							-77.0389247,
							-12.0489225
						],
						[
							-77.0371677,
							-12.0500265
						],
						[
							-77.036080599999991,
							-12.050747999999999
						],
						[
							-77.03519159999999,
							-12.051322899999999
						],
						[
							-77.0351223,
							-12.0514878
						],
						[
							-77.0355149,
							-12.052043800000002
						],
						[
							-77.035552299999992,
							-12.0521385
						]
					],
					"type": "LineString"
				}
			}
		}
	]
}"""))


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
