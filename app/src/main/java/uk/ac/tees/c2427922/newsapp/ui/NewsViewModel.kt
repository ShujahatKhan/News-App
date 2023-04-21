package uk.ac.tees.c2427922.newsapp.ui

import androidx.lifecycle.ViewModel
import uk.ac.tees.c2427922.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
) : ViewModel() {
}