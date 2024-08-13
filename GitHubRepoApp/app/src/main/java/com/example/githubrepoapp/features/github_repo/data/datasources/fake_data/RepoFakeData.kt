package com.example.githubrepoapp.features.github_repo.data.datasources.fake_data

import com.example.githubrepoapp.R
import com.example.githubrepoapp.features.github_repo.data.model.GithubRepoUiModel


val repoFakeDataList = listOf(
        GithubRepoUiModel(
            id = 1,
            name = "AwesomeFlutter",
            language="Dart",
            avatar = R.drawable.fluttericon,
            description = "A collection of awesome Flutter resources.",
            stars = 1500,
            forks = 30,
            owner = "FlutterDev"
        ), GithubRepoUiModel(
            id = 2,
            name = "KotlinCoroutines",
            language="Kotlin",
            avatar = R.drawable.kotlinlogo,
            description = "Examples and tutorials for Kotlin Coroutines.",
            stars = 2400,
            forks = 60,
            owner = "JetBrains"
        ), GithubRepoUiModel(
            id = 3,
            name = "ReactNativeBoilerplate",
            language="React",
            avatar = R.drawable.reacticon,
            description = "A boilerplate for starting a new React Native project.",
            stars = 500,
            forks = 15,
            owner = "ReactCommunity"
        ), GithubRepoUiModel(
            id = 4,
            name = "PythonDataScience",
            language="Python",
            avatar = R.drawable.pythonlogo,
            description = "Data science and machine learning resources in Python.",
            stars = 3200,
            forks = 50,
            owner = "DataScientist"
        ), GithubRepoUiModel(
            id = 5,
            name = "JavaSpringBoot",
            language="JavaScript",
            avatar = R.drawable.javaspringicon,
            description = "A starter project for building REST APIs with Spring Boot.",
            stars = 1800,
            forks = 20,
            owner = "SpringFramework"
        )
    )
