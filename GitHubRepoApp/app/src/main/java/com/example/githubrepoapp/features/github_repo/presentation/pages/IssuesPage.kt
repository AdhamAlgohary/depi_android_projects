package com.example.githubrepoapp.features.github_repo.presentation.pages

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
import com.example.githubrepoapp.features.github_repo.data.model.IssuesModel
import com.example.githubrepoapp.features.github_repo.presentation.items.issues_page.IssuesItem
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@ExperimentalMaterial3Api
@Composable
fun IssuesPage() {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    val fakeIssues = listOf(
        IssuesModel(
            issueName = "UI Bug on Home Screen",
            owner = "Alice",
            createDate = dateFormat.format(Date()) // Current date
        ),
        IssuesModel(
            issueName = "Crash on Login",
            owner = "Bob",
            createDate = dateFormat.format(Date())
        ),
        IssuesModel(
            issueName = "Performance Issue in Data Sync",
            owner = "Charlie",
            createDate = dateFormat.format(Date())
        ),
        IssuesModel(
            issueName = "Incorrect Data Display",
            owner = "Diana",
            createDate = dateFormat.format(Date())
        ),
        IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        )
    )
    Scaffold(containerColor = MaterialTheme.colorScheme.background,topBar = {
        AppBar(
            title = stringResource(id = R.string.issues_page_app_bar_title)
        )
    }) {innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(fakeIssues) { itemOfList ->
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