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

class ServiciosTermUso : Screen {
    @Composable
    override fun Content() {
        ServiciosTermUsoContent()
    }
}

@Composable
fun ServiciosTermUsoContent() {
    Surface(Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Back("VICOCAR.SERVICIOS TÉRMINOS DE USO")
            }
            item {
                Text(
                    text = "inDrive.Servicios\n" +
                            "\n" +
                            "Términos de Uso\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Última actualización: 21 de junio de 2023\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Estos términos de servicio constituyen un acuerdo " +
                            "(el \"Acuerdo\") entre usted e Suol Innovations LTD HE 333944 " +
                            "(\"inDrive\", \"nosotros\", \"nos\" o \"nuestro\") registrada " +
                            "en Chipre en 41 Themistokli Dervi, Hawaii Tower, 1ST Floor, " +
                            "Office 106, 1066 Nicosia, Chipre, que rigen su uso del servicio " +
                            "inDrive.Servicios de aplicación y/o sitio web inDrive. Este " +
                            "Acuerdo se aplica tanto al usuario que solicitó el servicio " +
                            "como al especialista. Todas las referencias \"usted\", \"su\", " +
                            "\"usted mismo\" en este Acuerdo se aplican tanto a los " +
                            "mensajeros como a los pasajeros, a menos que se especifique " +
                            "lo contrario.\n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "1. Aceptar los términos de uso\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "1.1. IMPORTANTE: AL UTILIZAR inDrive.SERVICIOS DE LA " +
                            "APLICACIÓN Y/O SITIOS WEB DE inDrive (EL \"SERVICIO\"), " +
                            "USTED ACEPTA QUE HA LEÍDO, ENTENDIDO, ACEPTADO Y ACEPTO ESTOS " +
                            "TÉRMINOS Y CONDICIONES. USTED ACEPTA ADEMÁS LAS DECLARACIONES " +
                            "REALIZADAS POR USTED MISMO A CONTINUACIÓN. SI NO ACEPTA O " +
                            "CUMPLE CON LOS TÉRMINOS DE USO DEL SERVICIO Y/O DESEA DEJAR " +
                            "DE UTILIZAR EL SERVICIO, NO CONTINÚE UTILIZANDO ESTE " +
                            "SERVICIO.\n" +
                            "\n" +
                            "1.2. Los Términos de uso establecidos en este documento " +
                            "constituyen un acuerdo legal entre usted e inDrive y sus " +
                            "subsidiarias y afiliadas. Para utilizar el Servicio, debe " +
                            "aceptar los Términos de uso que se establecen a continuación. " +
                            "Al usar la aplicación móvil y los sitios web que le proporciona " +
                            "inDrive (la \"Aplicación\" o la \"Aplicación\"), y al " +
                            "descargar, instalar o usar cualquier software asociado " +
                            "proporcionado por inDrive (el \"Software\"), usted reconoce" +
                            " y acepta expresamente ser obligado por los Términos de uso," +
                            " y cualquier modificación y adiciones futuras a estos " +
                            "Términos de uso según se publiquen ocasionalmente a través " +
                            "de la Aplicación. Al instalar inDrive en su dispositivo " +
                            "móvil o computadora, usted acepta incondicionalmente todas " +
                            "las reglas, condiciones e información publicadas en la" +
                            " Aplicación inDrive y en el sitio web, incluidos, entre " +
                            "otros: estos Términos de uso, Términos de uso de inDrive, " +
                            "política de privacidad " +
                            "(https://inDrive.com/mobile/page/privacyPolicy/es), así " +
                            "como las Reglas de la Aplicación.\n" +
                            "\n" +
                            "1.3. Tenga en cuenta que podemos cambiar cualquier parte " +
                            "de estos Términos de uso en cualquier momento. Cuando lo " +
                            "hagamos, le proporcionaremos un aviso razonable y su uso " +
                            "continuado de la Aplicación y/o los Servicios después del " +
                            "período de aviso constituirá su aceptación de los Términos " +
                            "de uso actualizados. Usted acepta que será su responsabilidad " +
                            "revisar los Términos de uso regularmente y también los " +
                            "Términos de uso aplicables a cualquier país donde use el " +
                            "Servicio, por lo que el uso continuo del Servicio después " +
                            "de dichos cambios ya sea que los haya revisado o no. " +
                            "constituyen su consentimiento y aceptación a dichos " +
                            "cambios. Además, acepta que el uso del Servicio en " +
                            "cualquier otro país estará sujeto a los Términos de uso " +
                            "vigentes en ese otro país que se pueden encontrar en la " +
                            "Aplicación.\n" +
                            "\n" +
                            "1.4. inDrive e inDrive.Servicios no ofrecen servicios a " +
                            "sujetos en Estados miembros de la Unión Europea, Espacio " +
                            "Económico Europeo.\n" +
                            "\n" +
                            "1.5. Cada especialista o servicio proporcionado por un " +
                            "especialista a un usuario constituirá un acuerdo por " +
                            "separado entre el usuario que solicitó el servicio y el " +
                            "especialista. inDrive e inDrive.Servicios son un agregador " +
                            "de tecnología que no proporciona ningún servicio directamente." +
                            "inDrive no es un proveedor de servicios. inDrive lo " +
                            "vincula con dicho especialista que brinda servicios, pero " +
                            "no tiene ni tiene la intención de brindar los servicios " +
                            "solicitados por el usuario o cualquier acto que pueda " +
                            "interpretarse de alguna manera como un acto de provisión " +
                            "de un servicio solicitado por el usuario.\n" +
                            "\n" +
                            "1.6. No somos responsables por los actos y/u omisiones " +
                            "de cualquier prestación de un servicio solicitado por el " +
                            "usuario y/o cualquier servicio que se le brinde.",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}