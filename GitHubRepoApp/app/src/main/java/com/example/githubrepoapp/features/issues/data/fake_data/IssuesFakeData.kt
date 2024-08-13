package com.example.githubrepoapp.features.issues.data.fake_data

import com.example.githubrepoapp.features.issues.data.model.IssuesModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


    var dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    val issuesFakeDataList = listOf(
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
            issueName = "Security Vulnerability in Authentication hi hi hi hi hi hi hi",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Hady",
            createDate = dateFormat.format(Date())
        ), IssuesModel(
            issueName = "Security Vulnerability in Authentication",
            owner = "Ethan",
            createDate = dateFormat.format(Date())
        )
    )
