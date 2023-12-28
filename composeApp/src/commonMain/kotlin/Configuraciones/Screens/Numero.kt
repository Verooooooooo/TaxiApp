package Configuraciones.Screens

import Pasajero.Screens.LetraBlancaAnuncio
import Pasajero.Screens.Modal
import Pasajero.Screens.backgroundColorEmpezar
import Settings.Screens.Configuraciones
import Settings.Screens.ConfiguracionesContent
import Settings.Screens.SimpleFilledTextFieldSample3
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

class Numero : Screen {
    @Composable
    override fun Content() {
        NumeroContent()
    }
}
@Composable
fun NumeroContent() {
    var isDialogOpen by remember { mutableStateOf(true) }
    val navigator = LocalNavigator.currentOrThrow
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            if (isDialogOpen) {
                Dialog(
                    onDismissRequest = { isDialogOpen = false },
                    properties = DialogProperties()
                ) {
                    Surface(
                        color = Modal,
                        modifier = Modifier.clip(RoundedCornerShape(16.dp))

                    ) {
                        Column(
                            modifier = Modifier.padding(15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "¿Seguro que desea cambiar su número telefónico?",
                                    color = LetraBlancaAnuncio, modifier = Modifier.weight(1.0f)
                                )

                            }
                            Row(
                                modifier = Modifier.fillMaxWidth().height(100.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Button(
                                    onClick = { navigator.push(Configuraciones()) },
                                    colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
                                ) {
                                    Text("No")
                                }

                                Button(
                                    onClick = {},//TE LLEVA A CAMBIAR EL NUMERO
                                    colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColorEmpezar)
                                ) {
                                    Text("Si")
                                }
                            }


                        }

                    }
                }
            }


        }
    }
}