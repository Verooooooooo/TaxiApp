package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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

class CerrarSesion : Screen {
    @Composable
    override fun Content() {
        CerrarSesionContent()
    }
}

@Composable
fun CerrarSesionContent() {
    var isDialogOpen by remember { mutableStateOf(true) }
    val navigator = LocalNavigator.currentOrThrow

    // Agregar un evento para manejar el clic fuera del diálogo
    val onDismissRequest: () -> Unit = {
    }

    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            if (isDialogOpen) {
                Dialog(
                    onDismissRequest = onDismissRequest,// Usa la nueva variable para manejar el evento
                    properties = DialogProperties()
                ) {
                    Surface(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp))

                    ) {
                        Column(
                            modifier = Modifier.padding(15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "¿Estás seguro de que quiere cerrar sesión?",
                                    modifier = Modifier.weight(1.0f)
                                )

                            }
                            Row(
                                modifier = Modifier.fillMaxWidth().height(100.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Button(
                                    onClick = { navigator.push(Configuraciones()) },
                                ) {
                                    Text("Cancelar")
                                }

                                Button(
                                    onClick = {},
                                ) {
                                    Text("Cerrar Sesión")
                                }
                            }


                        }

                    }
                }
            }


        }

    }
}