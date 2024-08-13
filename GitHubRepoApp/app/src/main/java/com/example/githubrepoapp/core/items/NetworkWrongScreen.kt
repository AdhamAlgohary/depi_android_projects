package com.example.githubrepoapp.core.items

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubrepoapp.R
import androidx.compose.ui.res.painterResource as painterResource1


@ExperimentalMaterial3Api
@Composable
fun NetworkWrongScreen(retryBtnOnClick: () -> Unit = {}) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.surface,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.network_wrong_screen_app_bar_title),
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            )
        }) { innerPadding ->
        Divider(thickness = 90.dp, color = MaterialTheme.colorScheme.outlineVariant)
        Column(
            modifier = Modifier.padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1.5f))
            Image(
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
                painter = painterResource1(id = R.drawable.network_error),
                contentDescription = null
            )
            Text(
                modifier = Modifier.padding(8.dp),
                text = stringResource(id = R.string.network_error_screen_something_went_wrong),
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(8.dp),
                text = stringResource(id = R.string.network_error_screen_network_error),
                style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.outline)
            )
            Spacer(modifier = Modifier.weight(1F))
            Button(
                modifier = Modifier.width(300.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.surface),
                border = BorderStroke(2.dp, MaterialTheme.colorScheme.outline.copy(green = 0.7F)),
                onClick = retryBtnOnClick
            ) {
                Text(
                    text = stringResource(id = R.string.network_wrong_screen_retry),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold,letterSpacing = 2.sp),
                    color = MaterialTheme.colorScheme.onSurface.copy(green = 0.7F)
                )
            }
            Spacer(modifier = Modifier.weight(1F))

        }
    }
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewNoInternetConnection() {
    NetworkWrongScreen()
}