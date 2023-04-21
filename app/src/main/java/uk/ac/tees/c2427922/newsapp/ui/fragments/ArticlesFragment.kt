package uk.ac.tees.c2427922.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uk.ac.tees.c2427922.newsapp.R
import uk.ac.tees.c2427922.newsapp.ui.MainActivity
import uk.ac.tees.c2427922.newsapp.ui.NewsViewModel

class ArticlesFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}