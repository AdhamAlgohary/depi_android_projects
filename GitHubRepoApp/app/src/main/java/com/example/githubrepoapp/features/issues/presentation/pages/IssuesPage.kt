package com.example.githubrepoapp.features.issues.presentation.pages

import IssuesItem
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubrepoapp.R
import com.example.githubrepoapp.core.items.AppBar
import com.example.githubrepoapp.features.issues.data.fake_data.issuesFakeDataList


@ExperimentalMaterial3Api
@Composable
fun IssuesPage() {

    Scaffold(containerColor = MaterialTheme.colorScheme.background,topBar = {
        AppBar(
            title = stringResource(id = R.string.issues_page_app_bar_title)
        )
    }) {innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(issuesFakeDataList) { itemOfList ->
                IssuesItem(itemOfList)
            }
        }

    }
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewIssuesPage() {
IssuesPage()
}