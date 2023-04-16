package uk.ac.tees.c2427922.newsapp.models

import uk.ac.tees.c2427922.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)