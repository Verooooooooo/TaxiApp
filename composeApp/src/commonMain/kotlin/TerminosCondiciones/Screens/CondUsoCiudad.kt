package TerminosCondiciones.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class CondUsoCiudad : Screen {
    @Composable
    override fun Content() {
        CondUsoCiudadContent()
    }
}

@Composable
fun CondUsoCiudadContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("CONDICIONES DE USO DE VICOCAR.CIUDAD A CIUDAD")
            }
            item {
                Text(
                    text = "Términos de uso de inDrive. Ciudad a Ciudad\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Última actualización el 27 de noviembre de 2023\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "¡Bienvenido a inDrive.Ciudad a Ciudad!\n" +
                            "\n" +
                            "Estos Términos de Uso (\"Términos\") rigen su uso del servicio inDrive.Ciudad a Ciudad de las aplicaciones móviles, sitios web, productos, contenido, instalaciones y plataforma de inDrive (colectivamente, la \"Plataforma\").\n" +
                            "\n" +
                            "Los presentes Términos de Uso de inDrive.Ciudad a Ciudad forman parte integrante de los Términos Generales de Uso. Al utilizar el servicio inDrive.Ciudad a Ciudad, el usuario acepta plenamente los presentes Términos y los Términos Generales de Uso. En caso de conflicto o incoherencia entre las disposiciones de estos Términos y los Términos Generales de Uso, se aplicarán las disposiciones de estos Términos.\n" +
                            "\n" +
                            "Usted celebra un contrato con nosotros cuando confirma que acepta estos Términos o cuando utiliza la Plataforma de cualquier otro modo. La empresa con la que usted contrata depende de su lugar de residencia. En Perú, su contrato es con SUOL INNOVATIONS LTD (“inDrive\", \"nosotros\", \"nos\" o \"nuestro\").\n" +
                            "\n" +
                            "Su uso de la Plataforma como Conductor puede estar sujeto a los Términos de Uso del Conductor designadas. Nuestras prácticas de privacidad se describen en la Política de privacidad.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "1. Modelo de negocio de inDrive.Ciudad a Ciudad\n" +
                            "1.1. Nuestra Plataforma pone en contacto a terceros proveedores independientes de servicios de transporte (\"Conductores\") y a sus clientes (\"Pasajeros\") para realizar viajes compartidos entre acuerdos. Cuando los pasajeros solicitan un viaje, ofrecen su precio por los servicios del conductor. Los conductores que ven la solicitud pueden aceptar el precio ofrecido o hacer una contraoferta.\n" +
                            "\n" +
                            "1.2. El Pasajero es libre de elegir al Conductor de la lista de Conductores que indicaron su interés en aceptar la solicitud. Cuando el Pasajero confirma el viaje, se establece un acuerdo independiente entre el Conductor y el Pasajero.\n" +
                            "\n" +
                            "1.3. El Pasajero debe pagar al Conductor el precio que ambos hayan acordado a través de la Plataforma. Este precio acordado incluye todos los gastos asociados al viaje (tasas, peajes, gravámenes, impuestos, etc.). inDrive no participa y no afecta en modo alguno al acuerdo entre el Conductor y el Pasajero.\n" +
                            "\n" +
                            "1.4. El Conductor puede crear y publicar un anuncio en la Plataforma introduciendo información sobre el trayecto que pretende realizar (fecha y hora de recogida, puntos A y B, número de plazas e importe del coste).\n" +
                            "\n" +
                            "1.5. El Pasajero puede responder a un anuncio del Conductor y presentar su solicitud de viaje, aceptando el precio del viaje fijado por el Conductor. El conductor puede aceptar o rechazar la solicitud del Pasajero.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "2. Responsabilidad del Pasajero\n" +
                            "2.1. Usted, como Pasajero, es responsable de proporcionar información precisa y completa sobre la dirección de la atracción, incluido el nombre correcto del asentamiento, la calle (la avenida, la autopista, etc.), el número de la casa (incluido el edificio, la estructura, la propiedad, etc.) o a la elección de la dirección pertinente de la muestra disponible.\n" +
                            "\n" +
                            "2.2. Usted asume los riesgos de las consecuencias de la indicación incorrecta de la información necesaria para el cumplimiento del paseo.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "3. Responsabilidad del conductor\n" +
                            "3.1. Usted, como conductor, puede aceptar ofertas y realizar viajes de Pasajeros sólo en su territorio de registro. Si acepta ofertas y realiza trayectos entre asentamientos con jurisdicciones diferentes, asume todos los riesgos de incumplimiento de los requisitos de otros estados/extranjeros en el transcurso del transporte.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Contactar con inDrive\n" +
                            "Puede ponerse en contacto con nosotros a través de https://indrive.com/en/contacts/support/",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}