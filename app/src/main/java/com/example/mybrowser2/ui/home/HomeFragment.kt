package com.example.mybrowser2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mybrowser2.R
import android.webkit.WebView
import android.webkit.WebViewClient

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val webView: WebView = root.findViewById(R.id.web_home)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        homeViewModel.url.observe(this, Observer(webView::loadUrl))
        return root
    }
}