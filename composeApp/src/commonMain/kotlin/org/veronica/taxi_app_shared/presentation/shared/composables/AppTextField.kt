package org.veronica.taxi_app_shared.presentation.shared.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource


@Composable
fun SimpleFilledTextFieldSample(
    texto: String,
    modifier: Modifier = Modifier,
    icon: ImageResource,
    enabled: Boolean = true,
    value: String = "",
    onValueChange: (String) -> Unit = {},
    onTextClick: () -> Unit = {}
) {
//alt + enter = importa automaticamente
    OutlinedTextField(
        leadingIcon = {
            Icon(
                painter = painterResource(icon),
                modifier = Modifier.height(16.dp),
                contentDescription = "",
            )
        }, enabled = enabled, value = value, // Usar el valor proporcionado
        onValueChange = onValueChange, label = {
            Text(
                texto, style = TextStyle(fontSize = 16.sp),
            )
        },
        modifier = modifier.fillMaxWidth().clickable { onTextClick.invoke() }, singleLine = true
    )
}