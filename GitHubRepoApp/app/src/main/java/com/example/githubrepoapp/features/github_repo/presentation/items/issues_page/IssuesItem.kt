package com.example.githubrepoapp.features.github_repo.presentation.items.issues_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepoapp.R
import com.example.githubrepoapp.features.github_repo.data.model.IssuesModel

@Composable
fun IssuesItem(issuesModel: IssuesModel) {
    Row(
        modifier = Modifier
            .size(width = 430.dp, height = 110.dp)
            .padding(vertical = 2.5.dp, horizontal = 5.dp)
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(15.dp))
            .padding(vertical = 5.dp)

    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .padding(top = 15.dp, end = 5.dp),
            painter = painterResource(
                R.drawable.issueslogo
            ), contentDescription = null
        )
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(1F),
                    text = issuesModel.issueName,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    modifier = Modifier.padding(
                        end = 15.dp
                    ), text = stringResource(id = R.string.open)
                )
            }
            Text(text = issuesModel.owner)
            Row(
                modifier = Modifier.padding(top = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = stringResource(R.string.created_at),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(text = issuesModel.createDate)
            }
        }

    }
}

@Preview
@Composable
private fun PreviewIssuesItem() {
    IssuesItem(IssuesModel("issue", "Taha", "2023-02-10"))
}