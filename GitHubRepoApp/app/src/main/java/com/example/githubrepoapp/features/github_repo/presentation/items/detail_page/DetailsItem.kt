package com.example.githubrepoapp.features.github_repo.presentation.items.detail_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DetailsItem(value: String, image: Int) {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = value
        )
        Image(
            modifier = Modifier
                .size(40.dp),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = image),
            contentDescription = null
        )
    }

}

