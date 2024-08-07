package com.example.githubrepoapp.features.github_repo.presentation.items.repo_page
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepoapp.R
import com.example.githubrepoapp.features.github_repo.data.model.GithubRepoUiModel

@Composable
fun RepoItem(repoModel: GithubRepoUiModel) {
    Row(
        modifier = Modifier.padding(5.dp)
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(15.dp)).padding(vertical = 8.dp)

    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .padding( top = 15.dp,end = 5.dp),
            painter = painterResource(
                repoModel.avatar
            ), contentDescription = repoModel.description
        )
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(modifier = Modifier.weight(1F),text = repoModel.name)
                Text( text = repoModel.stars.toString())
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 5.dp),
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = stringResource(
                        id = R.string.details_screen_number_of_stars
                    )
                )
            }
            Text(text = repoModel.owner)
            Text(text = repoModel.description, overflow = TextOverflow.Ellipsis)

        }

    }

}

@Preview
@Composable
private fun PreviewRepoItem() {
    RepoItem(
        GithubRepoUiModel(
            1,
            "test",
            "Dart",
            R.drawable.fluttericon,
            "desc",
            5,
            20,
            "Adham"
        )
    )
}