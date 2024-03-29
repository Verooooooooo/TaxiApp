package org.veronica.taxi_app_shared.presentation.settings.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

class TermUsoFreight : Screen {
    @Composable
    override fun Content() {
        TermUsoFreightContent()
    }
}

@Composable
fun TermUsoFreightContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("TÉRMINOS DE USO VICOCAR.FREIGHT")
            }
            item {
                Text(
                    text = "Términos de uso de inDrive.Freight\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Última actualización: 27 de noviembre de 2023\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Bienvenido a inDrive.Freight\n" +
                            "\n" +
                            "Estos Términos de Uso (\"Términos de Uso\" o “Términos”) rigen su uso del servicio inDrive.Freight de las aplicaciones móviles, sitios web, productos, contenidos, instalaciones y plataforma de inDrive (colectivamente, la \"Plataforma\").\n" +
                            "\n" +
                            "estos Términos de Uso de inDrive.Freight forman parte integrante de los Términos Generales de Uso. Al utilizar el servicio inDrive.Freight, usted expresa su pleno acuerdo con estos Términos y los Términos Generales de Uso. En caso de conflicto o incoherencia entre las disposiciones de estos Términos y los Términos Generales de Uso, se aplicarán las disposiciones de estos Términos.\n" +
                            "\n" +
                            "Usted celebra un contrato con nosotros cuando confirma que acepta estos Términos o cuando utiliza la Plataforma de cualquier otro modo. La empresa con la que usted contrata depende de su lugar de residencia. En Perú, su contrato es con SUOL INNOVATIONS LTD (“inDrive\", \"nosotros\", \"nos\" o \"nuestro\").\n" +
                            "\n" +
                            "Su uso de la Plataforma como Transportista puede estar sujeto a los Términos de Uso del Conductor designadas. Nuestras prácticas de privacidad se describen en la Política de privacidad.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "1. Modelo de negocio de inDrive.Freight\n" +
                            "1.1. Nuestra Plataforma pone en contacto a terceros proveedores independientes de servicios de Transporte (\"Transportistas\") y a sus clientes (\"Cargadores\"). Cuando los Cargadores solicitan el transporte de una carga, ofrecen su precio por los servicios del Transportista. Los Transportistas que ven la solicitud pueden aceptar el precio ofrecido o hacer una contraoferta.\n" +
                            "\n" +
                            "1.2. Los Cargadores son libres de elegir el Transportista de la lista de Transportistas que indicaron su interés en aceptar la solicitud. Se forma un acuerdo independiente entre el Transportista y el Cargador, cuando el Cargador confirma el transporte de la carga.\n" +
                            "\n" +
                            "1.3. El Expedidor deberá pagar al Transportista el precio que ambos hayan acordado a través de la Plataforma. Este precio acordado incluye todos los cargos asociados al transporte de la carga (tasas, peajes, gravámenes, impuestos, etc.). inDrive no participa y no afecta en modo alguno al acuerdo entre el Transportista y el Cargador.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "2. Responsabilidad del expedidor\n" +
                            "2.1. Usted, como Remitente, es responsable de proporcionar información precisa y completa sobre la entrega, incluida la dirección correcta del Destinatario, la información de contacto y cualquier instrucción especial necesaria para la entrega correcta de la Carga.\n" +
                            "\n" +
                            "2.2. Usted se compromete a garantizar el paso sin obstáculos del Transportista hasta el lugar de entrega, así como a garantizar su presencia o la presencia de un tercero capaz de aceptar la Carga en el lugar de la dirección de entrega especificada.\n" +
                            "\n" +
                            "2.3. Usted es responsable de garantizar que la Carga esté debidamente embalada y protegida para su transporte. Cualquier daño o retraso derivado de un embalaje inadecuado o de una información de entrega incorrecta facilitada por usted será de su exclusiva responsabilidad.\n" +
                            "\n" +
                            "2.4. Usted carga la Carga en el vehículo del Transportista por sus propios medios y a su cargo. También la carga puede ser realizada por el Transportista mediante negociaciones entre el Transportista y el Expedidor.\n" +
                            "\n" +
                            "2.5. Usted declara y garantiza que tiene derecho legal a poseer y enviar los artículos incluidos en el Porte. Usted es responsable de asegurarse de que los artículos enviados han sido adquiridos legalmente y no infringen ninguna ley, normativa o restricción aplicable.\n" +
                            "\n" +
                            "2.6. Usted reconoce que es plenamente responsable de las consecuencias jurídicas o reclamaciones que puedan derivarse del envío de mercancías sin la debida titularidad o autorización.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "3. Responsabilidad del transportista\n" +
                            "3.1. Usted, como Transportista, es responsable del transporte seguro y puntual de la Carga desde el punto de recogida hasta el punto de entrega. Deberá tomar todas las precauciones necesarias para evitar cualquier pérdida o daño a la Carga durante el transporte. En caso de pérdida o daño de la Carga mientras esté en su posesión, usted será el responsable, sujeto a las limitaciones o exclusiones de responsabilidad previstas en los presentes Términos de Uso o en la legislación aplicable.\n" +
                            "\n" +
                            "3.2. Ambas partes reconocen que la responsabilidad de cada una de ellas por la entrega se limita a las respectivas obligaciones establecidas anteriormente, y ninguna de las partes será responsable de cualquier fallo o retraso en la entrega causado por circunstancias fuera de su control razonable, incluyendo, pero no limitado a, desastres naturales, acciones gubernamentales o cualquier otro evento de fuerza mayor.\n" +
                            "\n" +
                            "3.3. En el caso de una entrega fallida debido a la falta de disponibilidad del destinatario, información de entrega incorrecta proporcionada por el Remitente, o cualquier otra razón más allá del control razonable del Transportista, inDrive no se hace responsable del almacenamiento de la Carga. El Remitente debe ser consciente de que, en tales casos, deberá tomar medidas alternativas para el almacenamiento o manipulación de la Carga.\n" +
                            "\n" +
                            "3.4. Al aceptar la Carga del Expedidor, usted tiene el derecho, pero no la obligación, de:\n" +
                            "\n" +
                            "3.4.1. Conocer su contenido;\n" +
                            "\n" +
                            "3.4.2. Pedir al expedidor que le muestre el contenido y selle el paquete con usted;\n" +
                            "\n" +
                            "3.4.3. No aceptar la Carga si el Expedidor se niega a mostrar el contenido, o si el contenido parece sospechoso o ilegal;\n" +
                            "\n" +
                            "3.4.4. Si el Remitente sospecha que se ha infringido la legislación vigente o los presentes Términos de Uso, puede ponerse en contacto con nosotros a través de https://indrive.com/en/contacts/support/;\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "4. Bienes restringidos\n" +
                            "4.1. Al utilizar la Plataforma, usted es responsable de asegurarse de que la Carga que se entrega no es un bien restringido.\n" +
                            "\n" +
                            "4.2. Bienes restringidos, incluidos, entre otros:\n" +
                            "\n" +
                            "4.2.1. documentos, productos y otras cargas de peso inferior a 20 kg;\n" +
                            "\n" +
                            "4.2.2. estupefacientes, medicamentos con receta, psicotrópicos, potentes, tóxicos, radiactivos, explosivos;\n" +
                            "\n" +
                            "4.2.3. sustancias venenosas, cáusticas, inflamables y otras sustancias peligrosas, incluidas las sometidas a presión;\n" +
                            "\n" +
                            "4.2.4. armas de fuego, armas neumáticas, de gas o frías y sus piezas, municiones, fuegos artificiales, bengalas de señalización y cartuchos;\n" +
                            "\n" +
                            "4.2.5. divisas y billetes extranjeros;\n" +
                            "\n" +
                            "4.2.6. artículos de gran valor, como joyas, metales preciosos, piedras preciosas y productos que los contengan;\n" +
                            "\n" +
                            "4.2.7. artículos y sustancias que, por su naturaleza o debido a su envase, puedan suponer un peligro para las personas, contaminar o estropear (dañar) otros bienes, personas u objetos de su entorno;\n" +
                            "\n" +
                            "4.2.8. personas, especies reguladas, animales y plantas, materiales biológicos;\n" +
                            "\n" +
                            "4.2.9. artículos que requieran vehículos especialmente equipados para su transporte, incluidos los productos alimenticios;\n" +
                            "\n" +
                            "4.2.10. líquidos en recipientes no especiales;\n" +
                            "\n" +
                            "4.2.11. artículos frágiles sin embalaje especial;\n" +
                            "\n" +
                            "4.2.12. todos los envíos prohibidos por la ley;\n" +
                            "\n" +
                            "4.2.13. mercancías ilegales o robadas, productos pirateados o falsificados;\n" +
                            "\n" +
                            "4.2.14. residuos peligrosos, como las pilas;\n" +
                            "\n" +
                            "4.2.15. materiales y componentes explosivos;\n" +
                            "\n" +
                            "4.2.16. bebidas alcohólicas;\n" +
                            "\n" +
                            "4.2.17. productos del tabaco y cigarrillos electrónicos.\n" +
                            "\n" +
                            "4.2.18. material obsceno o pornográfico\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Contactar con inDrive\n" +
                            "Puede ponerse en contacto con nosotros a través de https://indrive.com/en/contacts/support/",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}