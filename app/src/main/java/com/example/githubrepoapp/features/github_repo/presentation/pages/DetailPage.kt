package com.example.githubrepoapp.features.github_repo.presentation.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepoapp.R
import com.example.githubrepoapp.core.items.AppBar
import com.example.githubrepoapp.features.github_repo.data.model.GithubRepoUiModel
import com.example.githubrepoapp.features.github_repo.presentation.items.detail_page.DetailsItem

@ExperimentalMaterial3Api
@Composable
fun DetailsPage(
    repoModel: GithubRepoUiModel,
    onClickBack: () -> Unit = {},
) {

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            AppBar(
                title = stringResource(id = R.string.details_screen_topAppBar_title),
                onBackArrowClicked = onClickBack
            )
        }) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = repoModel.avatar),
                contentDescription = repoModel.description
            )
            Text(text = repoModel.name)
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                DetailsItem(
                    value = repoModel.stars.toString(),
                    image = R.drawable.star
                )
                Text(text = repoModel.language)
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.Blue)
                )

                DetailsItem(
                    value = repoModel.forks.toString(),
                    image = R.drawable.forklogo
                )


            }
            Text(text = repoModel.description)
            Button(
                modifier = Modifier
                    .width(300.dp)
                    .padding(top = 470.dp),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer),
                onClick = { }) {
                Text(text = stringResource(id = R.string.details_screen_txt_inside_btn), style = MaterialTheme.typography.titleLarge)
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewDetailsPage() {
    DetailsPage(
        GithubRepoUiModel(
            1,
            "test",
            "Dart",
            R.drawable.fluttericon,
            "desc",
            5,
            66,
            "Adham"
        )
    )
}