package com.example.githubrepoapp.core.items
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubrepoapp.R

@ExperimentalMaterial3Api
@Composable
fun AppBar(
    title: String = "test",
    onBackArrowClicked: () -> Unit = {},
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    titleStyle: TextStyle = MaterialTheme.typography.labelLarge,
    showBackArrow: Boolean = true
) {
    CenterAlignedTopAppBar(
        modifier = Modifier.background(backgroundColor),
        title = { Text(text = title, style = MaterialTheme.typography.titleLarge) },

        navigationIcon = {
            if (showBackArrow)
                IconButton(onClick = onBackArrowClicked) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.app_bar_arrow_back_icon)
                    )
                }
        })
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewAppBar() {
    AppBar()
}