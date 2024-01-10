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

class PoliticaPriv : Screen {
    @Composable
    override fun Content() {
        PoliticaPrivContent()
    }
}

@Composable
fun PoliticaPrivContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Volver("POLITICAS DE PRIVACIDAD")
            }
            item {
                Text(
                    text = "POLÍTICA DE PRIVACIDAD\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Última actualización: 27 de septiembre de 2023\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Bienvenidos a inDrive. La presente Política describe nuestra forma de tratar los datos personales de los usuarios de inDrive (\"usted\" o \"su\"). \n" +
                            "\n" +
                            "En Perú, SUOL INNOVATIONS LTD es la entidad que proporciona inDrive y controla el procesamiento de los datos (\"nosotros\" o \"nos\").\n" +
                            "\n" +
                            "Esta Política se aplica cuando usted utiliza los sitios web, aplicaciones móviles, productos, contenidos o servicios de inDrive (colectivamente \"Plataforma\" o \"inDrive\"), o cuando se pone en contacto con nosotros. La Política no cubre la forma en que procesamos la información sobre nuestros candidatos, empleados o socios comerciales.\n" +
                            "\n" +
                            "Nos ajustaremos a la legislación local aplicable en relación con todas las prácticas descritas en esta Política. Si existe alguna incoherencia entre esta política y la legislación local, nos ajustaremos a la legislación local para resolver la incoherencia.\n" +
                            "\n" +
                            "Los usuarios que solicitan o reciben servicios de transporte, logística o mensajería a través de inDrive se denominan \"Pasajeros\", y las personas que prestan estos servicios a los Pasajeros se denominan \"Conductores\". \n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Qué información recopilamos\n" +
                            "\n" +
                            "Recopilamos tres categorías de información sobre usted: la información que usted proporciona, la que recopilamos automáticamente y la que obtenemos de otras fuentes.\n" +
                            "\n" +
                            "No recopilamos información sobre su origen racial o étnico, opiniones políticas o pertenencia a cualquier asociación política, creencias religiosas o filosóficas, afiliación sindical, datos genéticos o datos relativos a la vida u orientación sexuales de cada persona.\n" +
                            " \n" +
                            "\n" +
                            "Información que usted proporciona\n" +
                            "\n" +
                            "La información sobre el registro y los pasajeros puede incluir el nombre, el número de teléfono, la dirección de correo electrónico, el país y la ciudad. Cuando la ley lo permita o lo exija, podemos recopilar su imagen selfi para comprobaciones de vivacidad, números de identificación nacional con fines de seguridad, así como números de contacto de emergencia. Si no facilita esta información, no podrá utilizar inDrive o algunas de sus funciones. Si lo desea, también puede indicar su apellido y su foto para el perfil. \n" +
                            "\n" +
                            "La información sobre el conductor puede incluir su nombre completo, foto para el perfil, datos y estado del permiso de conducir, información sobre el vehículo (tipo, marca, modelo, año de fabricación, color, datos del permiso de circulación, matrícula, informe de inspección del vehículo, imagen del vehículo), prueba de identidad, número de identificación estatal, documento de identidad (incluido el permiso de conducir, pasaporte), prueba de residencia, domicilio, fecha de nacimiento, sexo, número de identificación fiscal, seguro aplicable, derecho a trabajar, historial de conducción, información de pago o bancaria y otros documentos que pueda exigir la normativa aplicable. Cuando la ley lo permita o lo exija, podremos recopilar además información sobre antecedentes penales y de otro tipo. Esta información puede ser procesada por proveedores autorizados en nuestro nombre. Si no facilita esta información, no podrá registrarse como conductor.\n" +
                            "\n" +
                            "Contenidos generados por el usuario que usted decida subir a inDrive, tales como comentarios, calificaciones y reseñas.\n" +
                            "\n" +
                            "La información contenida en la correspondencia que usted nos envíe puede incluir mensajes de chat, mensajes de correo electrónico con cualquier archivo adjunto, grabaciones de llamadas telefónicas que usted nos haga y los metadatos relacionados. \n" +
                            "\n" +
                            "Información para promociones. De vez en cuando, podemos lanzar programas de branding de vehículos, programas de recomendación y otros programas promocionales. Si desea participar en dichos programas y recibir bonificaciones, pagos u otros beneficios, podemos pedirle que nos facilite información tal como su nombre, dirección de correo electrónico, identificación de usuario, número de teléfono, información de pago o bancaria, domicilio, tipo e imagen del vehículo.\n" +
                            " \n" +
                            "\n" +
                            "Información que recopilamos automáticamente\n" +
                            "\n" +
                            "Información sobre la ubicación. Nosotros recogemos los datos de localización de los usuarios para hacer posible los viajes, proporcionar asistencia al usuario, garantizar la seguridad, detectar el fraude y cumplir con los requerimientos legales. Recopilamos información sobre su ubicación (incluidas las coordenadas GPS y los datos WiFi) en función de la configuración de la aplicación inDrive y los permisos del dispositivo:\n" +
                            "\n" +
                            "- Pasajeros: Recopilamos la ubicación precisa de su dispositivo cuando la aplicación se ejecuta en primer plano (aplicación abierta y en pantalla) y cuando la aplicación se ejecuta en segundo plano (aplicación abierta pero no en pantalla) desde el momento en que usted solicita un viaje hasta que finaliza. Los Pasajeros pueden utilizar la aplicación sin permitir que se recopilen datos de localización precisos de sus dispositivos móviles introduciendo directamente la dirección o las coordenadas de recogida y destino en la aplicación.\n" +
                            "\n" +
                            "- Conductores: Recopilamos la ubicación precisa de su dispositivo cuando la aplicación se ejecuta en primer plano (la aplicación está abierta y en pantalla) y cuando la aplicación se ejecuta en segundo plano (la aplicación está abierta pero no en pantalla) en el modo Conductor. También podemos recopilar la ubicación precisa durante un tiempo limitado después de salir del modo \"Conductor\" para poder detectar e investigar los incidentes del viaje.\n" +
                            "\n" +
                            "Información sobre la transacción. Recopilamos información sobre transacciones relacionadas con los servicios prestados a través de inDrive, incluido el importe cobrado, la información sobre la transacción de pago, la fecha y hora en que se prestó el servicio, la ruta y la distancia recorrida.\n" +
                            "\n" +
                            "Información de uso. Recopilamos los datos del uso que usted hace de nuestra Plataforma, tales como las fechas y horas de acceso, las funciones o páginas visitadas, los fallos de la Plataforma y otras actividades del sistema. También podemos recopilar y utilizar con fines de marketing los datos relacionados con servicios de terceros que usted utilizó antes de interactuar con inDrive.\n" +
                            "\n" +
                            "Información sobre las comunicaciones. Permitimos a los usuarios comunicarse entre sí y con nosotros a través de la Plataforma. Para ello, recibimos datos sobre la hora y la fecha de las comunicaciones y el contenido. Podemos utilizar estos datos para prestar asistencia a los usuarios y resolver las disputas que surjan entre ellos, identificar las infracciones de las reglas de inDrive, garantizar la seguridad y mejorar nuestra Plataforma.\n" +
                            "\n" +
                            "Información sobre el dispositivo. Recopilamos datos sobre el dispositivo que usted utiliza para acceder a inDrive, tales como el nombre, marca y modelo, agente del usuario, dirección IP, operador de telefonía móvil, tipo de red, configuración de la zona horaria, configuración de idioma, identificadores de publicidad, tipo de navegador, sistema operativo y su versión, parámetros de la pantalla, estado de la batería y aplicaciones instaladas que pueden utilizarse con fines de autenticación y lucha contra el fraude. También podemos recoger datos de sensores móviles, como la velocidad, la dirección, la altitud, la aceleración, la desaceleración y otros datos técnicos.\n" +
                            "\n" +
                            "ID de usuario y ID de viaje. Le asignamos automáticamente un ID de usuario cuando crea una cuenta inDrive, y un ID de viaje para cada viaje. \n" +
                            "\n" +
                            "Cookies y tecnologías de seguimiento. Recopilamos información mediante el uso de cookies, píxeles, etiquetas y otras tecnologías de seguimiento similares (“cookies”). Para obtener más información sobre estas tecnologías, consulte nuestra Política de cookies.\n" +
                            " \n" +
                            "\n" +
                            "Información que obtenemos de otras fuentes\n" +
                            "\n" +
                            "Servicios de terceros. Podemos recibir la información sobre los usuarios de nuestros proveedores de servicios. \n" +
                            "\n" +
                            "Autoridades estatales. Podemos recibir información sobre los usuarios, proveniente de las fuerzas de seguridad y otras autoridades gubernamentales, según lo exija o autorice la ley.\n" +
                            "\n" +
                            "Otros usuarios. Otros usuarios pueden proporcionarnos información sobre usted, por ejemplo, en relación con programas de recomendación o a través de la asistencia al usuario (como información relacionada con un incidente o reclamación, incluida la información de audio, vídeo, imágenes o documentos).\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Cómo utilizamos su información\n" +
                            "\n" +
                            "Utilizamos la información personal para los siguientes propósitos:\n" +
                            "\n" +
                            "1. Para permitirle utilizar inDrive\n" +
                            "\n" +
                            "- permitir a los usuarios mantener una cuenta en inDrive, solicitar y prestar servicios a través de inDrive;\n" +
                            "\n" +
                            "- verificar el derecho y la facultad de los conductores para prestar servicios a través de inDrive;\n" +
                            "\n" +
                            "- prevenir y combatir comportamientos peligrosos o ilícitos, fraudes y otras infracciones de las reglas de inDrive, suspender y desactivar a los usuarios que participen en actividades ilícitas;\n" +
                            "\n" +
                            "- prestar asistencia a los usuarios y tramitar sus reclamaciones;\n" +
                            "\n" +
                            "- enviar información que no sea de marketing (como facturas, recibos o notificaciones sobre su viaje);\n" +
                            "\n" +
                            "- mantener la accesibilidad, seguridad y estabilidad de nuestra Plataforma, prevenir y resolver incidentes y problemas técnicos.\n" +
                            "\n" +
                            "Base jurídica: cumplimiento de nuestro contrato con usted y necesidad de cumplir con nuestras obligaciones legales.\n" +
                            "\n" +
                            "2. Mejorar y desarrollar funciones y productos\n" +
                            "\n" +
                            "- realizar pruebas, trabajos de investigación, análisis de datos, desarrollo y aprendizaje automático;\n" +
                            "\n" +
                            "- recolectar sus comentarios.\n" +
                            "\n" +
                            "Base jurídica: cumplimiento de nuestro contrato con usted. Cuando se requiera el consentimiento expreso para determinados usos, lo obtendremos por separado. \n" +
                            "\n" +
                            "3. Promover inDrive\n" +
                            "\n" +
                            "- enviarle información y anuncios publicitarios, y hacerle llamadas con fines de marketing;\n" +
                            "\n" +
                            "- ofrecerle contenidos y publicidad personalizada en inDrive y en plataformas de terceros;\n" +
                            "\n" +
                            "- organizar concursos, eventos, programas de branding de vehículos y recomendación y otras promociones.\n" +
                            "\n" +
                            "Base jurídica: Cuando se requiera el consentimiento expreso para determinadas formas de marketing directo, lo obtendremos por separado.\n" +
                            "\n" +
                            "4. Proteger los derechos y cumplir los requerimientos legales\n" +
                            "\n" +
                            "- cumplir con los requerimientos de licencia o permiso, y de las leyes y reglamentos aplicables;\n" +
                            "\n" +
                            "- responder a solicitudes de las fuerzas del orden, investigaciones gubernamentales, citaciones, órdenes judiciales, reclamaciones legales;\n" +
                            "\n" +
                            "- proteger los derechos e intereses del grupo inDrive, de nuestros usuarios o del público.\n" +
                            "\n" +
                            "Base jurídica: necesidad de cumplir nuestras obligaciones legales.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Toma de decisiones automatizada\n" +
                            "\n" +
                            "Utilizamos su información personal para tomar decisiones automatizadas relacionadas con el uso que usted haga de nuestros Servicios:\n" +
                            "\n" +
                            "- conectar a Conductores y Pasajeros, en función de factores como la disponibilidad y la proximidad;\n" +
                            "\n" +
                            "- determinar las calificaciones de los usuarios y desactivar a los usuarios con calificaciones bajas;\n" +
                            "\n" +
                            "- señalar o suspender temporalmente a los usuarios identificados como autores de fraudes o actividades peligrosas o perjudiciales. En algunos casos, estas actividades pueden dar lugar a la desactivación;\n" +
                            "\n" +
                            "- recomendar una tarifa promedio, basada en factores como la distancia, la ubicación y el tiempo.\n" +
                            "\n" +
                            "En los casos en que la ley lo exija, las acciones basadas en dicho tratamiento (incluida la desactivación) solo se producen tras una revisión humana y/o con la posibilidad de presentar una apelación. Para objetar contra una decisión resultante de estos procesos, póngase en contacto con nosotros en https://indrive.com/es/contacts/support/.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Cómo compartimos su información\n" +
                            "\n" +
                            "Con otros Usuarios. Compartimos cierta información sobre los Usuarios para poder programar y ofrecer viajes:\n" +
                            "\n" +
                            "- La información del Pasajero compartida con el Conductor incluye el nombre, foto del perfil (si se ha subido), calificación, lugares de recogida y destino, número de viajes, tarifa ofrecida, comentarios e información de contacto. En las regiones en las que exigimos a los Pasajeros presentar su número de identificación nacional, también podemos compartir con el Conductor si el Pasajero ha proporcionado este número (pero no compartiremos el número de identificación como tal).\n" +
                            "\n" +
                            "- La información del conductor compartida con el Pasajero incluye el nombre y la foto del perfil, información sobre el vehículo, ubicación antes y durante el viaje, calificaciones y reseñas, número de viajes e información de contacto.\n" +
                            "\n" +
                            "Cuando debamos proporcionar recibos y facturas a los Pasajeros, podremos compartir información sobre el origen y el destino del viaje, la duración total y la distancia del viaje, el desglose de la tarifa total, el nombre del Conductor, el número de identificación fiscal y otra información exigida por la ley.\n" +
                            "\n" +
                            "Si usted se registra en inDrive a través de un enlace de recomendación, podemos compartir cierta información sobre usted, como su nombre y número de viajes, con el usuario que le ha recomendado. De este modo, el usuario que le ha recomendado puede comprobar si reúne los requisitos para recibir la bonificación por recomendación.\n" +
                            "\n" +
                            "Para los propósitos de servicios distintos a los servicios de transporte prestados a través de inDrive, compartiremos la información que sea necesaria con otros usuarios para la prestación de dichos servicios. \n" +
                            "\n" +
                            "Con proveedores de servicios. Podemos compartir su información personal con fines comerciales con proveedores de los siguientes servicios:\n" +
                            "\n" +
                            "- procesamiento de pagos y realización de transacciones;\n" +
                            "\n" +
                            "- asistencia técnica y al usuario;\n" +
                            "\n" +
                            "- verificación de signos vitales y de identidad;\n" +
                            "\n" +
                            "- almacenamiento en la nube;\n" +
                            "\n" +
                            "- entrega de contenidos, mensajería dentro de la aplicación, llamadas dentro de la aplicación, notificaciones push;\n" +
                            "\n" +
                            "- antifraude;\n" +
                            "\n" +
                            "- publicidad, marketing y análisis (incluido AppsFlyer);\n" +
                            "\n" +
                            "- investigación y encuestas;\n" +
                            "\n" +
                            "- pago de bonificaciones y concesión de otros beneficios relacionados con nuestras promociones;\n" +
                            "\n" +
                            "- consultores, abogados, contables, auditores y otros servicios profesionales.\n" +
                            "\n" +
                            "Los siguientes socios procesan datos para sus propios fines en calidad de controladores independientes y nosotros no controlamos dicho procesamiento:\n" +
                            "\n" +
                            "- Google, en relación con el uso de Google Maps (véase la política de privacidad de Google);\n" +
                            "\n" +
                            "- empresas de medios sociales (incluida Meta), en relación con el uso que hacemos de sus herramientas (véanse las políticas de privacidad de Meta).\n" +
                            "\n" +
                            "Dentro del grupo corporativo. Podemos compartir su información con una empresa matriz, subsidiaria o filial de nuestro grupo corporativo como parte de nuestras operaciones globales. \n" +
                            "\n" +
                            "En relación con un traspaso de empresa. Podemos transferir información personal en relación con una transacción corporativa sustancial en la que la información personal se encuentre entre los activos a transferir. \n" +
                            "\n" +
                            "Por razones legales. Podemos revelar su información personal cuando sea necesario para proteger derechos y cumplir con las obligaciones legales.\n" +
                            "\n" +
                            "Con su consentimiento. Podemos compartir su información personal para otros fines en virtud de su consentimiento o por indicación suya.\n" +
                            "\n" +
                            "Cuando se despersonaliza. Podemos compartir información agregada o anonimizada que ya no permita la identificación personal.\n" +
                            "\n" +
                            "Destinatarios de los datos de los usuarios de Perú: https://indrive.com/mobile/page/datatransfers/es/pe.\n" +
                            "\n" +
                            "  \n" +
                            "\n" +
                            "Transferencias transfronterizas de datos\n" +
                            "\n" +
                            "Para apoyar nuestras operaciones globales, podemos compartir su información con miembros del grupo corporativo de inDrive y otras entidades fuera de su país de residencia, tal y como se describe en la sección \"Cómo compartimos su información\". Lo hacemos para el cumplimiento de nuestro contrato con usted, o basándonos en el consentimiento, las decisiones de adecuación para los países implicados, u otros mecanismos de transferencia y salvaguardias apropiadas en virtud de la legislación aplicable, como las Cláusulas Contractuales Tipo aprobadas por la Comisión Europea. \n" +
                            "\n" +
                            "Todos los datos personales recopilados durante la prestación de nuestros servicios se transfieren y almacenan en los centros de datos de Servers.com (Países Bajos), IBM (Alemania), Google Cloud Platform (Unión Europea) y/o Amazon Web Services, Inc (Brasil).\n" +
                            "\n" +
                            "Adoptaremos medidas razonables para garantizar que cualquier destinatario en el extranjero trate sus datos personales de conformidad con el modo en que nosotros los tratamos.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Sus derechos y opciones\n" +
                            "\n" +
                            "Acceder a su información, recibirla y actualizarla. Usted puede acceder a su información, revisarla y actualizarla en la configuración de su cuenta en la aplicación o poniéndose en contacto con nosotros en https://indrive.com/es/contacts/support/. También puede solicitar una copia de toda la información sobre usted que procesamos. Podrá recibir sus datos en un formato estructurado, de uso habitual y legibles por ordenador, en la medida en que dichos datos hayan sido tratados por medios automatizados.\n" +
                            "\n" +
                            "Borrar su cuenta y sus datos. Puede eliminar su cuenta a través de los ajustes de la aplicación o solicitar la eliminación de su cuenta y sus datos poniéndose en contacto con nosotros en https://indrive.com/es/contacts/support/. Es posible que se le pida que verifique su cuenta y su identidad. No podremos eliminar su cuenta si existe una deuda pendiente o un asunto sin resolver relacionado con su cuenta (por ejemplo, una reclamación sin resolver). Podemos conservar cierta información después de que se elimine su cuenta siempre que exista una base legal para dicha conservación (véase la sección \"Cómo almacenamos su información\"). \n" +
                            "\n" +
                            "Compartir información sobre la ubicación. Su dispositivo puede disponer de controles que determinen qué información recopilamos. Por ejemplo, usted puede evitar que su dispositivo comparta información de localización a través de los ajustes del sistema de su dispositivo. \n" +
                            "\n" +
                            "Objeciones y revocación del consentimiento. Usted tiene derecho a negarse a que procesemos su información si el procesamiento se basa en nuestros intereses legítimos. También puede revocar su consentimiento al procesamiento en cualquier momento cuando el procesamiento se base en su consentimiento. En particular, puede ejercer estos derechos mediante:\n" +
                            "\n" +
                            "- La exclusión de las notificaciones push. Puede elegir no recibir notificaciones push a través de los ajustes de su dispositivo o a través de los ajustes de la aplicación.\n" +
                            "\n" +
                            "- Cancelación de la suscripción a mensajes de marketing por correo electrónico. Puede cancelar su suscripción a los mensajes de correo electrónico y mensajes de marketing utilizando el enlace \"Cancelar suscripción\" o el mecanismo indicado en dichos mensajes de correo electrónico y mensajes.\n" +
                            "\n" +
                            "- La exclusión de llamadas con fines de marketing. Usted puede optar por no recibir llamadas de marketing durante una llamada o contactando con nosotros en https://indrive.com/es/contacts/support/. \n" +
                            "\n" +
                            "- Gestión de cookies. Puede eliminar las cookies y modificar la configuración de las mismas en los ajustes de su navegador web. \n" +
                            "\n" +
                            "Restricciones. Puede solicitar que limitemos el uso que hacemos de sus datos. Podremos continuar procesando sus datos después de dicha solicitud en la medida exigida o permitida por la ley.\n" +
                            "\n" +
                            "Derecho a reclamación ante las autoridades de control. Puede presentar un reclamo ante la Dirección de Protección de Datos Personales del Ministerio de Justicia y Derechos Humanos (https://www.gob.pe/9269-iniciar-procedimiento-para-el-ejercicio-de-derechos-de-acceso-rectificacion-cancelacion-y-oposicion).\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Cómo almacenamos su información\n" +
                            "\n" +
                            "Nosotros guardamos su información personal mientras usted mantenga una cuenta con nosotros. Podemos conservar cierta información después de la cancelación de la cuenta por razones justificadas:\n" +
                            "\n" +
                            "- Conservaremos la información sobre transacciones (como datos sobre viajes y pagos) durante el tiempo necesario para cumplir con nuestras obligaciones fiscales. Por lo general, la legislación fiscal nos obliga a conservar la información durante 10 años.\n" +
                            "\n" +
                            "- Conservaremos la información durante el periodo exigido por el organismo regulador de licencias (si procede). El periodo de conservación variará en función de su ubicación y del tipo de datos.\n" +
                            "\n" +
                            "- Conservaremos la correspondencia y demás documentación durante el tiempo necesario para cumplir con las obligaciones legales de conservación de documentos. Por lo general, el Derecho mercantil nos obliga a conservar la correspondencia comercial durante 6 años.\n" +
                            "\n" +
                            "- Si existe alguna reclamación o disputa legal o cualquier posibilidad de que se produzca, conservaremos la información correspondiente hasta que se satisfaga la reclamación/se resuelva la disputa o expire el plazo de prescripción. El plazo de prescripción dependerá de su ubicación, pero por lo general exigirá una conservación de entre 3 y 7 años.\n" +
                            "\n" +
                            "- También conservaremos los datos pertinentes para prevenir el fraude, garantizar la seguridad de los usuarios y ajustarnos a nuestras obligaciones legales durante el período necesario para cumplir estos propósitos. \n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Cómo protegemos su información\n" +
                            "\n" +
                            "Adoptamos medidas de seguridad técnicas, legales y organizativas razonables y adecuadas para proteger sus datos personales de cualquier acción no autorizada, incluidos, entre otros, el acceso, la divulgación, la alteración o la destrucción que puedan provocar la pérdida, el robo o el uso indebido de sus datos.\n" +
                            "\n" +
                            "Los procesos de seguridad en nuestra empresa se desarrollan de conformidad con la norma ISO/IEC 27001:2013, y nos esforzamos al máximo para afirmar nuestro compromiso de proteger su información. Revisamos periódicamente nuestras medidas de seguridad para tener en cuenta las nuevas tecnologías y métodos disponibles. Puesto que la seguridad absoluta no existe ni dentro ni fuera de Internet, no podemos garantizar la seguridad absoluta de su información, especialmente frente a actos malintencionados de terceros en los que el coste de un ataque exitoso multiplica varias veces el valor de los datos posiblemente comprometidos. No obstante, hacemos esfuerzos comercialmente razonables para mantener segura su información.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Declaraciones generales\n" +
                            "\n" +
                            "Registro del banco de datos. En Perú, hemos solicitado el registro de los bancos de datos denominados \"Pasajeros\" y \"Conductor\", ante la Autoridad Nacional de Protección de Datos Personales.\n" +
                            "\n" +
                            "Protección de menores. inDrive no está dirigido a menores (según la definición prevista por la legislación local). Si descubrimos que tenemos información personal de un menor, haremos todo lo razonablemente posible para borrar esos datos y asegurarnos de que no se sigan utilizando o compartiendo. Si cree que un niño nos ha proporcionado información personal, póngase en contacto con nosotros a través de https://indrive.com/es/contacts/support/.\n" +
                            "\n" +
                            "Monitoreo telefónico. Las conversaciones telefónicas pueden ser monitoreadas y grabadas para garantizar la calidad y con fines de formación.\n" +
                            "\n" +
                            "No rastrear. Algunos navegadores transmiten señales \"do-not-track\" (no rastrear) a los sitios web. Debido a las diferencias en la forma en que los navegadores incorporan esta función, actualmente no tomamos medidas que respondan a estas señales.\n" +
                            "\n" +
                            "Cobros de terceros. Algunos terceros pueden utilizar tecnologías de recopilación automática de información, incluidas las tecnologías de seguimiento cruzado de sitios, para recopilar información personal. Estos terceros pueden ser, entre otros, su proveedor de servicios de Internet, su navegador web, su proveedor de servicios móviles, el fabricante de su dispositivo móvil, anunciantes en línea y empresas de análisis de datos. Además, nuestra Plataforma puede contener enlaces a plataformas de terceros. Al acceder a estos enlaces, la plataforma correspondiente puede recopilar sus datos personales. No somos responsables por las prácticas de privacidad de terceros. \n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Cambios\n" +
                            "\n" +
                            "Es posible que actualicemos esta política de vez en cuando para reflejar los cambios en las leyes o en la forma en que operamos. Al actualizar esta política, se lo haremos saber actualizando la fecha de \"Última actualización\" en la parte superior de esta página y publicando la nueva política de privacidad, así como cualquier otro aviso requerido por la legislación aplicable. Al utilizar inDrive, usted acepta los términos más recientes de esta Política.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Contacte con nosotros\n" +
                            "\n" +
                            "Contacte con nosotros en https://indrive.com/es/contacts/support/. Le responderemos de conformidad con la legislación aplicable y previa comprobación de su cuenta e identidad. \n" +
                            "\n" +
                            "SUOL INNOVATIONS LTD, 41 Themistokli Dervi, Hawaii Tower, 1st Floor, Office 106, 1066 Nicosia, Chipre.",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }

}