package com.example.mybrowser2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _url = MutableLiveData<String>().apply {
        value = "https://baidu.com"
    }
    val url: LiveData<String> = _url
}