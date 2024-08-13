package com.example.githubrepoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.githubrepoapp.core.items.NetworkWrongScreen
import com.example.githubrepoapp.core.theme.GitHubRepoAppTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubRepoAppTheme {
                NetworkWrongScreen()
            }

        }
    }
}

