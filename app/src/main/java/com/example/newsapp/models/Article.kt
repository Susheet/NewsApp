package com.example.newsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,   //Room can only handle primitive datatypes , so type converter to tell room how to interpret it
    val title: String,
    val url: String,
    val urlToImage: String
)