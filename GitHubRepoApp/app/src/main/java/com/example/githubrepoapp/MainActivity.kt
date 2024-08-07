package com.example.githubrepoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.githubrepoapp.core.theme.GitHubRepoAppTheme
import com.example.githubrepoapp.features.github_repo.presentation.pages.IssuesPage
import com.example.githubrepoapp.features.github_repo.presentation.pages.RepoPage

class MainActivity : ComponentActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubRepoAppTheme {
IssuesPage()
            }

        }
    }
}

