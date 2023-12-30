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

class ReglasServicioUsuarios : Screen {
    @Composable
    override fun Content() {
        ReglasServicioUsuariosContent()
    }
}

@Composable
fun ReglasServicioUsuariosContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("REGLAS DE SERVICIO PARA LOS USUARIOS")
            }
            item {
                Text(
                    text = "Reglas de servicio para los usuarios del servicio inDrive.Servicios\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Al utilizar el servicio inDrive.Servicios (en adelante Servicio) se " +
                            "agradece la comunicación educada entre los Usuarios, se prohíbe la " +
                            "comunicación grosera, injuriosa e irrespetuosa, el uso de lenguaje soez " +
                            "y profano, en caso de situaciones conflictivas siempre se puede ponerse " +
                            "en contacto con el chat de soporte técnico.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Para que la prestación de servicios por parte de los Prestadores de " +
                            "servicios se lleve a cabo con la mayor eficacia posible, le recomendamos " +
                            "que respete las siguientes reglas:\n" +
                            "\n" +
                            "1. El pedido debe contener una descripción clara de la tarea y los " +
                            "requisitos para el Prestador de servicios.\n" +
                            "\n" +
                            "2. El pedido no debe contener condiciones discriminatorias en relación " +
                            "con el Prestador de servicios. (limitación directa o indirecta de los derechos " +
                            "o, por el contrario, la concesión de ventajas en función de cualquier " +
                            "circunstancia no relacionada con las cualidades empresariales del " +
                            "trabajador).\n" +
                            "\n" +
                            "3. Indicar la dirección correcta del lugar donde se requiere el servicio " +
                            "del Prestador de servicios, así como la fecha y la hora.\n" +
                            "\n" +
                            "4. Es obligatorio notificar al Prestador de servicios y cancelar la " +
                            "Solicitud en la aplicación móvil si cambia de opinión sobre el uso de " +
                            "los servicios del Prestador de servicios por cualquier motivo.\n" +
                            "\n" +
                            "5. Está prohibido realizar una Solicitud y prestar Servicios cuyo objeto " +
                            "o finalidad sea:\n" +
                            "\n" +
                            "- conceder y recibir préstamos, acreditar cuentas en sistemas de pago, " +
                            "realizar transferencias de dinero, aceptar pagos a favor de sistemas de " +
                            "pago, incluidas las bolsas que realizan intercambios;\n" +
                            "\n" +
                            "- Remitir a los usuarios a recursos o sitios de terceros, o registrar a " +
                            "los usuarios en dichos recursos o sitios;\n" +
                            "\n" +
                            "- Dar publicidad a sus propios servicios y bienes o los de terceros;\n" +
                            "\n" +
                            "- servicios eróticos;\n" +
                            "\n" +
                            "- solicitar la distribución automática o manual de invitaciones y mensajes " +
                            "a los usuarios de las redes sociales, boletines electrónicos;\n" +
                            "\n" +
                            "- prestación de servicios de distribución de las mercancías del Cliente;\n" +
                            "\n" +
                            "- medicamentos, complementos alimenticios, suplementos dietéticos, " +
                            "venenos;\n" +
                            "\n" +
                            "- materias primas medicinales procedentes de la cría de renos (astas y " +
                            "materias primas endocrinas);\n" +
                            "\n" +
                            "- estupefacientes, sustancias psicotrópicas y sus precursores, cultivo " +
                            "de plantas estupefacientes;\n" +
                            "\n" +
                            "- servicios de almacenamiento, transporte, fabricación, procesamiento " +
                            "de estupefacientes, precursores, sustancias psicotrópicas o sus análogos, " +
                            "así como la adquisición ilegal, el almacenamiento, el transporte de plantas " +
                            "que contienen estupefacientes o sustancias psicotrópicas, o partes de las " +
                            "mismas que contienen estupefacientes o sustancias psicotrópicas;\n" +
                            "\n" +
                            "- servicios de organización de la prostitución y del ejercicio de la " +
                            "misma;\n" +
                            "\n" +
                            "- contenido para adultos, cualquier tipo de pornografía, salas de videochat " +
                            "sobre sexo, sitios que especifiquen la publicación de fotos explícitas;\n" +
                            "\n" +
                            "- productos del tabaco;\n" +
                            "\n" +
                            "- productos alcohólicos, alcohol etílico;\n" +
                            "\n" +
                            "- metales preciosas y gemas raras, joyas, incluidos los residuos que " +
                            "contienen metales y piedras preciosas y raras;\n" +
                            "\n" +
                            "- lingotes de oro, inversión en lingotes de oro, cualquier volumen de " +
                            "negocio de metales preciosos, gemas naturales o perlas, incluida la venta " +
                            "de productos de metales preciosos;\n" +
                            "\n" +
                            "- servicios de asistencia al combate, independientemente de la parte en " +
                            "conflicto, la forma de apoyo (ayuda humanitaria, suministro de armas, " +
                            "equipos de comunicaciones, medicamentos, etc.);\n" +
                            "\n" +
                            "- armas y municiones (civiles, de servicio, armas de fuego):\n" +
                            "\n" +
                            "- desarrollo, producción, pruebas, almacenamiento, reparación y " +
                            "eliminación.\n" +
                            "\n" +
                            "- comercio, incluidas las piezas básicas de las armas de fuego.\n" +
                            "\n" +
                            "- la munición, incluidos los cartuchos y sus componentes, como las vainas " +
                            "y los pistones.\n" +
                            "\n" +
                            "- Equipo militar, piezas de repuesto, componentes y aparatos para el mismo, " +
                            "explosivos, agentes de voladura, pólvora, todo tipo de combustible para " +
                            "cohetes, así como materiales especiales y equipo especial para su producción, " +
                            "equipo especial del personal paramilitar y productos técnico-normativos " +
                            "para su producción y funcionamiento;\n" +
                            "\n" +
                            "-Sustancias químicas tóxicas, medios de protección contra ellas y " +
                            "documentación técnico-normativa para su producción y utilización;\n" +
                            "\n" +
                            "- Servicios de fabricación/transformación/reparación de armas de fuego, " +
                            "sus piezas principales, municiones, explosivos o artefactos explosivos;\n" +
                            "\n" +
                            "- plaguicidas y agroquímicos restringidos;\n" +
                            "\n" +
                            "- Sustancias fuertes o tóxicas;\n" +
                            "\n" +
                            "- Los juegos de azar, incluidas las loterías, los locales de apuestas y " +
                            "las casas de apuestas;\n" +
                            "\n" +
                            "- forex, subastas binarias, bitcoins;\n" +
                            "\n" +
                            "- Esquemas Ponzi, HYIP;\n" +
                            "\n" +
                            "- Servicios de publicación de información, materiales que difaman el honor " +
                            "y la dignidad de una persona, violación del secreto de la correspondencia, " +
                            "la vida personal;\n" +
                            "\n" +
                            "- Servicios de creación, uso y distribución de programas informáticos " +
                            "maliciosos;\n" +
                            "\n" +
                            "- servicios para el suministro de acceso no autorizado a la información " +
                            "informática;\n" +
                            "\n" +
                            "- Servicios para hackear cuentas de terceros, extraer información sensible " +
                            "y modificarla;\n" +
                            "\n" +
                            "- Medios técnicos especiales diseñados para la adquisición encubierta de " +
                            "información;\n" +
                            "\n" +
                            "- Servicios de distribución y venta de secretos comerciales, fiscales o " +
                            "bancarios;\n" +
                            "\n" +
                            "- comercio/fabricación de tarjetas de crédito o débito y otros instrumentos " +
                            "de pago falsificados;\n" +
                            "\n" +
                            "- servicios de publicación de incitación pública a actividades extremistas, " +
                            "incitación al odio o a la enemistad, así como a la humillación de la " +
                            "dignidad humana;\n" +
                            "\n" +
                            "- los servicios de una organización comunitaria extremista;\n" +
                            "\n" +
                            "- servicios de mediación de sobornos;\n" +
                            "\n" +
                            "- cualquier otro bien o servicio prohibido en virtud del Términos de uso " +
                            "del inDrive.Servicios, la legislación aplicable.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "El Administrador tiene derecho a bloquear el perfil del Usuario en caso " +
                            "de repetidas violaciones de las normas del Servicio, el Administrador " +
                            "tiene derecho a eliminar la cuenta del Usuario en caso de repetidas " +
                            "violaciones.",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}