package com.example.githubrepoapp.features.github_repo.data.model

data class GithubRepoUiModel(
    val id: Int,
    val name: String,
    val language: String,
    val avatar: Int,
    val description: String,
    val stars: Int,
    val forks:Int,
    val owner: String
)
