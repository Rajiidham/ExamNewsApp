package com.example.examnews

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.examnews.data.model.NewsResponse
import com.example.examnews.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository): ViewModel() {
    val suaraNews : LiveData<NewsResponse> = repository.suaraNews
    val tempoNews : LiveData<NewsResponse> = repository.tempoNews
    val sindonewsNews : LiveData<NewsResponse> = repository.sindonewsNews

    fun getSuaraNews() {
        repository.getSuaraTerbaruNews()
    }
    fun getSuaraOtomotifNews() {
        repository.getSuaraOtomotifNews()
    }

    fun getSuaraEntertainmentNews() {
        repository.getSuaraEntertainmentNews()
    }

    fun getTempoNasionalNews() {
        repository.getTempoNasionalNews()
    }

    fun getTempoDuniaNews() {
        repository.getTempoDuniaNews()
    }

    fun getTempoBisnisNews() {
        repository.getTempoBisnisNews()
    }

    fun getSindonewsMetroNews() {
        repository.getSindonewsMetroNews()
    }

    fun getSindonewsInternationalNews() {
        repository.getSindonewsInternationalNews()
    }

    fun getSindonewsDaerahNews() {
        repository.getSindonewsDaerahNews()
    }


}