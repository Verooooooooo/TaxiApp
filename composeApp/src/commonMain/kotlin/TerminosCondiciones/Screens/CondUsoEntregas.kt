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

class CondUsoEntregas : Screen {
    @Composable
    override fun Content() {
        CondUsoEntregasContent()
    }
}

@Composable
fun CondUsoEntregasContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("CONDICIONES DE USO DE VICOCAR.ENTREGAS")
            }
            item {
                Text(
                    text = "Términos de uso de inDrive.Entregas\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Última actualización el 27 de noviembre de 2023\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Bienvenido a inDrive.Entregas\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Estos Términos de Uso (\"Términos\") rigen su uso del servicio inDrive.Entregas de las aplicaciones móviles, sitios web, productos, contenidos, instalaciones y plataforma de inDrive (colectivamente, la \"Plataforma\").\n" +
                            "\n" +
                            "Los presentes Términos de Uso de inDrive.Entregas forman parte integrante de los Términos Generales de Uso. Al utilizar el servicio inDrive.Entregas, usted expresa su total acuerdo con Estos Términos y los Términos Generales de Uso. En caso de conflicto o incoherencia entre las disposiciones de estos Términos y los Términos Generales de Uso, se aplicarán las disposiciones de estos Términos.\n" +
                            "\n" +
                            "Usted celebra un contrato con nosotros cuando confirma que acepta estos Términos o cuando utiliza la Plataforma de cualquier otro modo. La empresa con la que usted contrata depende de su lugar de residencia. En Perú, su contrato es con SUOL INNOVATIONS LTD (“inDrive\", \"nosotros\", \"nos\" o \"nuestro\").\n" +
                            "\n" +
                            "Su uso de la Plataforma como Mensajero puede estar sujeto a los Términos de Uso del Conductor designado. Nuestras prácticas de privacidad se describen en la Política de Privacidad.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "1. Modelo de negocio de inDrive.Entregas\n" +
                            "1.1. Nuestra Plataforma pone en contacto a terceros proveedores independientes de servicios de mensajería (\"Transportistas\") y a sus clientes (\"Remitentes\"). Cuando los Remitentes solicitan la entrega de un paquete, ofrecen un precio por los servicios del Transportista. Los Transportistas que reciben la solicitud pueden aceptar el precio ofrecido o hacer una contraoferta.\n" +
                            "\n" +
                            "1.2. Los Remitentes son libres de elegir el Transportista de la lista de Transportistas que han manifestado su interés en aceptar la solicitud. Se establece un acuerdo independiente entre el Transportista y el Remitente, cuando el Remitente confirma el transporte del Paquete.\n" +
                            "\n" +
                            "1.3. El Remitente deberá pagar al Transportista el precio que ambos hayan acordado a través de la Plataforma. Este precio acordado incluye todos los gastos asociados al transporte del Paquete (tasas, peajes, gravámenes, impuestos, etc.). inDrive no participa y no afecta en modo alguno al acuerdo entre el Transportista y el Remitente.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "2. Responsabilidad del Remitente\n" +
                            "2.1. Usted, como Remitente, es responsable de proporcionar información precisa y completa sobre la entrega, incluida la dirección correcta del Destinatario, la información de contacto y cualquier instrucción especial necesaria para la correcta entrega del Paquete.\n" +
                            "\n" +
                            "2.2. Usted se compromete a garantizar el paso sin obstáculos del Correo hasta el lugar de entrega, así como a garantizar su presencia o la presencia de un tercero capaz de aceptar el Paquete en el lugar de la dirección de entrega especificada.\n" +
                            "\n" +
                            "2.3. Usted es responsable de garantizar que el Paquete esté debidamente embalado y protegido para su transporte. Cualquier daño o retraso derivado de un embalaje inadecuado o de una información de entrega incorrecta facilitada por usted será de su exclusiva responsabilidad.\n" +
                            "\n" +
                            "2.4. No debe enviar para su entrega el Paquete cuyo peso supere los 20 kg para un mensajero en coche y los 10 kg para otros tipos de mensajeros (mensajero a pie, mensajero en bicicleta, mensajero en motocicleta).\n" +
                            "\n" +
                            "2.5. Usted declara y garantiza que tiene derecho legal a poseer y enviar los artículos incluidos en el Paquete. Usted es responsable de garantizar que los artículos enviados han sido adquiridos legalmente y no infringen ninguna ley, reglamento o restricción aplicable.\n" +
                            "\n" +
                            "2.6. Usted reconoce que es plenamente responsable de las consecuencias jurídicas o reclamaciones que puedan derivarse del envío de mercancías sin la debida titularidad o autorización.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "3. Responsabilidad del Transportista\n" +
                            "3.1. Usted, como Transportista, es responsable del transporte seguro y puntual del paquete desde el punto de recogida hasta el punto de entrega. Usted debe tomar todas las precauciones necesarias para evitar cualquier pérdida o daño al Paquete durante el transporte. En caso de pérdida o daño del Paquete mientras esté en su posesión, usted será responsable, sujeto a cualquier limitación o exclusión de responsabilidad prevista en estos Términos o en la legislación aplicable.\n" +
                            "\n" +
                            "3.2. Ambas partes reconocen que la responsabilidad de cada una de ellas por la entrega se limita a las respectivas obligaciones establecidas anteriormente, y ninguna de las partes será responsable de cualquier fallo o retraso en la entrega causado por circunstancias fuera de su control razonable, incluyendo, pero no limitado a, desastres naturales, acciones gubernamentales o cualquier otro evento de fuerza mayor.\n" +
                            "\n" +
                            "3.3. En el caso de una entrega fallida debido a la falta de disponibilidad del Destinatario, información de entrega incorrecta proporcionada por el Remitente, o cualquier otra razón más allá del control razonable del Correo, inDrive no se hace responsable del almacenamiento del Paquete. El Remitente y el Destinatario deben ser conscientes de que, en tales casos, deben hacer arreglos alternativos para el almacenamiento o manejo del Paquete.\n" +
                            "\n" +
                            "3.4. Al aceptar el Paquete del Remitente, usted tiene el derecho, pero no la obligación, de:\n" +
                            "\n" +
                            "3.4.1. Conocer atentamente su contenido;\n" +
                            "\n" +
                            "3.4.2. Pedir al Remitente que le muestre el contenido y selle el paquete ante usted.\n" +
                            "\n" +
                            "3.4.3. No aceptar el paquete si el Remitente se niega a mostrar el contenido, o si el contenido parece sospechoso o ilegal\n" +
                            "\n" +
                            "3.4.4. Si el Remitente sospecha que se ha infringido la legislación vigente o los presentes Términos, puede ponerse en contacto con nosotros a través de https://indrive.com/en/contacts/support/.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "4. Bienes restringidos\n" +
                            "4.1. Cuando usted utiliza la Plataforma, es responsable de asegurarse de que el Paquete que se entrega no es un bien restringido.\n" +
                            "\n" +
                            "4.2. Bienes restringidos, incluidos, entre otros:\n" +
                            "\n" +
                            "4.2.1. documentos, productos y otros paquetes cuyo coste supere los 100 USD.\n" +
                            "\n" +
                            "4.2.2. estupefacientes, medicamentos con receta, psicotrópicos, potentes, tóxicos, radiactivos, explosivos,\n" +
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
                            "4.2.10. líquidos en recipientes no especificados;\n" +
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
                            "Contactar con inDrive.Entregas\n" +
                            "Puede ponerse en contacto con nosotros a través de https://indrive.com/en/contacts/support/",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}