package uk.ac.tees.c2427922.newsapp.repository

import uk.ac.tees.c2427922.newsapp.api.RetrofitInstance
import uk.ac.tees.c2427922.newsapp.db.ArticleDatabase
import uk.ac.tees.c2427922.newsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    /*
   function that directly queries our api for the breaking news
    */
    suspend fun getBreakingNews(countryCode:String, pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    /*
    function that query our api for searched news
     */
    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    /*
    function to insert article to db
     */
    suspend fun upsert(article: Article)=
        db.getArticleDao().upsert(article)

    /*
    function to get saved news from db
     */
    fun getSavedNews()=
        db.getArticleDao().getAllArticles()

    /*
    function to delete articles from db
     */
    suspend fun deleteArticle(article: Article)=
        db.getArticleDao().deleteArticle(article)
}