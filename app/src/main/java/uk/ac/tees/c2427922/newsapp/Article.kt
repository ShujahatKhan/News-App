package uk.ac.tees.c2427922.newsapp

data class Article(
    val author: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String
)