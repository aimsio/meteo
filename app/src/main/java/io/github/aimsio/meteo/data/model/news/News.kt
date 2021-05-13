package io.github.aimsio.meteo.data.model.news

data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)