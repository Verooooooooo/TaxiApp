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

class TerminoUso : Screen {
    @Composable
    override fun Content() {
        TerminoUsoContent()
    }
}

@Composable
fun TerminoUsoContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("TÉRMINOS DE USO")
            }
            item {
                Text(
                    text = "Contenidos, con el fin de operar, desarrollar y facilitar la Plataforma.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "10. Propiedad intelectual\n" +
                            "La Plataforma incluye Contenido (como diseños, imágenes, sonidos, textos, " +
                            "bases de datos, códigos informáticos, marcas registradas y no registradas y " +
                            "otros elementos similares) de propiedad o bajo licencia de inDrive, que está " +
                            "protegido por derechos de autor, marcas registradas, patentes, secretos " +
                            "comerciales y otros procedimientos. inDrive y su licenciatario, según " +
                            "corresponda, son propietarios de todos los derechos, títulos e intereses, " +
                            "incluidos todos los derechos de propiedad intelectual relacionados, en y " +
                            "para la Plataforma (software y/o la aplicación y, por extensión, el servicio " +
                            "y cualquier sugerencia, idea, solicitud de mejora, comentario, recomendación " +
                            "u otra información proporcionada por usted o cualquier otra parte en relación " +
                            "con la Plataforma).\n" +
                            "\n" +
                            "inDrive le concede una licencia limitada, no exclusiva, intransferible, " +
                            "no asignable y revocable para: (a) acceder y utilizar la Plataforma en su " +
                            "dispositivo personal únicamente con el objetivo de utilizar la Plataforma; " +
                            "y (b) acceder y visualizar cualquier Contenido o material que pueda estar " +
                            "disponible a través de la Plataforma, en cada caso únicamente para su uso " +
                            "personal y no comercial. Todos los derechos que no se le concedan " +
                            "expresamente en este documento están reservados por inDrive y/o los " +
                            "licenciantes de inDrive.\n" +
                            "\n" +
                            "Usted mismo no puede, y no puede permitir que ninguna otra parte: " +
                            "(a) modifique, reproduzca, cree productos derivados basados en la " +
                            "Plataforma; (b) realice ingeniería inversa, descompile, desensamble o " +
                            "intente de cualquier otro modo descubrir o modificar el código fuente " +
                            "de la Plataforma para elaborar un producto o servicio competitivo, " +
                            "elaborar un producto utilizando ideas, características, funciones o " +
                            "gráficos similares, copiar cualquier idea, característica, función o " +
                            "gráfico; (c) enmarque, enlace o refleje cualquier parte de la Plataforma " +
                            "en cualquier otro servidor o dispositivo inalámbrico o basado en " +
                            "Internet; (d) publique, distribuya o reproduzca de cualquier manera " +
                            "cualquier material protegido por derechos de autor, marcas registradas " +
                            "u otra información de propiedad sin el consentimiento previo de " +
                            "inDrive.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "11. Indemnización\n" +
                            "Usted acepta defender, indemnizar y exonerar a inDrive y sus afiliados, " +
                            "subsidiarias y sus funcionarios, directores, empleados y agentes de " +
                            "cualquier reclamación, demanda, pérdida, responsabilidad y gastos " +
                            "(incluyendo honorarios razonables de abogados) que surjan de o en conexión " +
                            "con: (a) el uso que usted haga de la Plataforma o de los Servicios; " +
                            "(b) el incumplimiento o violación de cualquiera de estos Términos, " +
                            "de cualquier ley o normativa aplicable por parte suya, o de los derechos " +
                            "de cualquier tercero (colectivamente, las \"Pérdidas\").\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "12. Responsabilidad\n" +
                            "Responsabilidad de inDrive\n" +
                            "Sin limitar la aplicación de las leyes y reglamentos, todas las " +
                            "condiciones, declaraciones y garantías, ya sean expresas, implícitas, " +
                            "estatutarias o de otro tipo, incluyendo, entre otras, cualquier garantía " +
                            "implícita de comerciabilidad, idoneidad para un fin determinado o no " +
                            "violación de derechos de terceros, quedan por la presente excluidas y " +
                            "rechazadas en la mayor y máxima medida.\n" +
                            "\n" +
                            "En la máxima medida permitida por la ley, en ningún caso inDrive será " +
                            "responsable ante usted ni ante nadie por ningún daño o pérdida directa, " +
                            "indirecta, punitiva, económica, especial futura, ejemplar, incidental, " +
                            "consecuente o de cualquier otro tipo (incluyendo, entre otros, daños " +
                            "personales, estrés emocional y pérdida de datos, bienes, ingresos, " +
                            "beneficios, uso u otra ventaja económica), ya sea que surja en virtud " +
                            "de contratos, extracontractuales (incluida la negligencia) o de otro tipo " +
                            "que se deriven o estén relacionados de algún modo con la Plataforma, " +
                            "incluidos, entre otros, el uso o la imposibilidad de uso, cualquier " +
                            "confianza depositada por usted sobre la exhaustividad, exactitud o " +
                            "existencia de cualquier publicidad, o como resultado de cualquier " +
                            "relación o transacción entre usted y cualquier Conductor, incluso si " +
                            "inDrive ha sido advertido previamente de la posibilidad de dichos " +
                            "daños.\n" +
                            "\n" +
                            "Servicios de terceros\n" +
                            "No existe ninguna relación de empresa mixta, asociación, empleo o " +
                            "representación entre inDrive y cualquiera de nuestros usuarios. En la " +
                            "máxima medida permitida por la ley, inDrive no será responsable de los " +
                            "actos u omisiones de ningún Conductor o Pasajero ni de ninguno de los " +
                            "Servicios. inDrive no tomará parte en disputas o negociaciones entre " +
                            "los usuarios de la Plataforma. Usted renuncia expresamente y libera a " +
                            "inDrive de cualquier responsabilidad, reclamación, causa de acción o " +
                            "daños relacionados con el uso que usted haga de la Plataforma en las " +
                            "relaciones con otros usuarios de la Plataforma.\n" +
                            "\n" +
                            "Aunque otros Servicios de Terceros están disponibles en la Plataforma, " +
                            "determinados Servicios o Contenidos de Terceros solo son accesibles " +
                            "si se sale de la Plataforma. Una vez que pulse sobre un enlace para " +
                            "acceder a ese tipo de Servicios, estará sujeto a los términos y condiciones " +
                            "y a la política de privacidad de ese sitio web, destino o del proveedor " +
                            "de servicios independiente, que son diferentes de los de inDrive. inDrive " +
                            "no le advertirá de que está sujeto a los términos y condiciones " +
                            "(incluidas las políticas de privacidad) de otro sitio web o destino. " +
                            "Usted utiliza todos los enlaces de sitios web y anuncios de terceros a " +
                            "riesgo propio, ya que no forman parte de la Plataforma y no están " +
                            "controlados por inDrive. En ningún caso inDrive será responsable de " +
                            "ningún producto o servicio de dichos proveedores externos.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "13. Resolución de conflictos\n" +
                            "Ley aplicable y arbitraje. Los presentes Términos se rigen por la " +
                            "legislación de Chipre. De surgir un desacuerdo, en primer lugar, " +
                            "intentaremos resolverlo con usted de forma amistosa. Todas las disputas " +
                            "o reclamaciones que surjan de o en relación estos Términos, incluyendo " +
                            "las disputas relativas a su validez, incumplimiento, terminación o nulidad, " +
                            "serán resueltas definitivamente bajo las Reglas de Arbitraje (Reglas de " +
                            "Viena) del Centro Internacional de Arbitraje de Viena (VIAC) de la Cámara " +
                            "Económica Federal de Austria por un árbitro nombrado de acuerdo con dichas" +
                            " Reglas.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "14. Cambios en estos Términos o en la Plataforma\n" +
                            "Ocasionalmente, podremos introducir cambios en estos Términos o en la " +
                            "Plataforma. Cuando actualicemos los Términos, publicaremos su última " +
                            "versión en nuestra aplicación y en nuestro sitio web. También le " +
                            "notificaremos con una antelación razonable todo cambio significativo " +
                            "que pueda afectarle.\n" +
                            "\n" +
                            "Si desea seguir utilizando la Plataforma después de que introduzcamos " +
                            "cambios en los Términos o en la Plataforma, usted tendrá que aceptar los " +
                            "cambios mediante el uso continuado de nuestra Plataforma. Si usted no " +
                            "está de acuerdo con dichos cambios, deberá dejar de utilizar la " +
                            "Plataforma.\n" +
                            "\n" +
                            "A menos que se realicen cambios sustanciales en las disposiciones de " +
                            "arbitraje, usted acepta que cualquier cambio en estos Términos no crea " +
                            "una nueva oportunidad de optar por el arbitraje (si procede).\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "15. General\n" +
                            "Nos comprometemos a proporcionarle la Plataforma con razonable " +
                            "profesionalidad y cuidado. Tenga en cuenta, no obstante, que " +
                            "proporcionamos la Plataforma \"tal como está disponible\" o \"tal cual\". " +
                            "Esto significa que no declaramos, garantizamos ni aseguramos la " +
                            "fiabilidad, seguridad, puntualidad, calidad, idoneidad, disponibilidad, " +
                            "exactitud o integridad de la Plataforma.\n" +
                            "\n" +
                            "Por favor, mantenga la Plataforma actualizada a la versión más " +
                            "reciente de la aplicación y asegúrese de que su dispositivo sea compatible. " +
                            "Le aconsejamos utilizar la Plataforma con un plan de datos ilimitado " +
                            "o con un límite muy alto de uso de datos.\n" +
                            "\n" +
                            "La Plataforma puede contener enlaces a sitios web, anuncios, servicios, " +
                            "ofertas u otros eventos o actividades de terceros que no son proporcionados, " +
                            "controlados ni son propiedad de inDrive. Usted los utiliza bajo su propia " +
                            "responsabilidad.\n" +
                            "\n" +
                            "Nada de lo dispuesto en los presentes Términos afecta a ningún derecho " +
                            "legal cuya modificación o renuncia usted no pueda acordar contractualmente. " +
                            "Usted siempre gozará de la plena protección de las leyes que le son " +
                            "aplicables.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "16. Contacto con inDrive\n" +
                            "Puede ponerse en contacto con nosotros a través de " +
                            "https://indrive.com/es/contacts/support",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Composable
fun Back(texto: String) {
    val navigator = LocalNavigator.currentOrThrow
    Box(
        Modifier.padding(vertical = 12.dp).fillMaxWidth(),
        contentAlignment = (Alignment.CenterStart)
    )
    {

        Box(
            modifier = Modifier.padding(top = 45.dp)
                .clickable { navigator.push(TermCond()) } // Ajusta el espaciado del icono según tus necesidades
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