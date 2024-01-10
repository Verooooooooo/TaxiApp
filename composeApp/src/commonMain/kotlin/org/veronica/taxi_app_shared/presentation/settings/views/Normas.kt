package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.resources.compose.painterResource
import org.veronica.taxi_app.resources.AppResources

class Normas : Screen {
    @Composable
    override fun Content() {
        NormasContent()
    }
}

@Composable
fun NormasContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver2("NORMAS PARA LOS PASAJEROS")
            }
            item {
                Text(
                    text = "Reglas para los pasajeros\n" +
                            "Sé respetuoso con el conductor. No hables sobre asuntos personales por teléfono o con otros pasajeros, ya que podrías incomodar al conductor.\n" +
                            "\n" +
                            "Especifica el número de entrada o el lugar de recogida en el mapa. Ingresa un comentario si necesitas aclarar algo, como por ejemplo: \"la entrada se encuentra en la parte lateral del edificio\". Antes de pulsar en \"Buscar conductor\", verifica la dirección en la solicitud de viaje.\n" +
                            "\n" +
                            "Si decides no hacer el viaje, notifica al conductor de inmediato y no olvides cancelar tu solicitud en la app.\n" +
                            "\n" +
                            "El conductor esperará 5 minutos en el punto de recogida. Si te demoras, llama al conductor y díselo. Si tienes una demora de más de 5 minutos, deberás pagar una tarifa por el tiempo de espera.\n" +
                            "\n" +
                            "Si tu ruta cambia durante el viaje, avísale al conductor de inmediato. El precio del viaje puede variar, dado que depende de la ruta.\n" +
                            "\n" +
                            "Si deseas pagar por tu viaje con billetes grandes, notifica al conductor. Ingresa un comentario y especifica el cambio necesario o dile al conductor en persona cuando comience el viaje.\n" +
                            "\n" +
                            "No fumes dentro del vehículo. Trata de no comer durante el viaje o beber bebidas que puedan dejar una mancha. Trata al conductor y a otros pasajeros con respeto.\n" +
                            "\n" +
                            "En las opciones debes especificar lo siguiente:\n" +
                            " - Si necesitas un asiento para niños (Ingresa la cantidad de niños y sus edades)\n" +
                            " - Si habrá más de 4 pasajeros en el viaje\n" +
                            " - Si llevas equipaje\n" +
                            " - Si viajas con una mascota\n" +
                            "\n" +
                            "Si llega un conductor diferente o si el número de registro es distinto, no dudes en avisarnos. En la pantalla de viaje que tiene el mapa, pulsa en \"Quejarse\" o abre el menú lateral y ponte en contacto con Soporte.\n" +
                            "\n" +
                            "Si tu viaje no te pareció placentero, trata de no entrar en conflicto con el conductor. Califica al conductor inmediatamente luego de finalizar el viaje. No te preocupes, las calificaciones negativas se publican en forma anónima. Si deseas quejarte, contacta a Soporte.\n" +
                            "\n" +
                            "Si olvidas tus pertenencias en el vehículo, escríbenos a support@indrive.com. Incluye la hora y la ruta de tu viaje, y de ser posible, dinos la marca del auto, su color y número de registro. Te ayudaremos a encontrar tus cosas.",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Composable
fun Volver2(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(Reglas()) } // Ajusta el espaciado del icono según tus necesidades
        ) {
            Row(
                modifier = Modifier.height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // Agrega tu icono aquí
                Image(
                    painter = painterResource(AppResources.images.back),
                    contentDescription = null,
                    modifier = Modifier.width(20.dp)
                )

                Text(texto)


            }

        }
    }
}