package com.example.examnews.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.examnews.data.model.NewsResponse
import com.example.examnews.data.network.ApiClient
import com.example.examnews.data.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {



    private val _suaraNews = MutableLiveData<NewsResponse>()
    val suaraNews : LiveData<NewsResponse> = _suaraNews
    private val _tempoNews = MutableLiveData<NewsResponse>()
    val tempoNews : LiveData<NewsResponse> = _tempoNews
    private val _sindonewsNews = MutableLiveData<NewsResponse>()
    val sindonewsNews : LiveData<NewsResponse> = _sindonewsNews


    fun getSuaraTerbaruNews() {
        ApiClient.getAllService.getSuaraTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _suaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getSuaraOtomotifNews() {
        ApiClient.getAllService.getSuaraOtomotifNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _suaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getSuaraEntertainmentNews() {
        ApiClient.getAllService.getSuaraEntertainmentNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _suaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getTempoNasionalNews() {
        ApiClient.getAllService.getTempoNasionalNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _tempoNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getTempoDuniaNews() {
        ApiClient.getAllService.getTempoDuniaNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _tempoNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getTempoBisnisNews() {
        ApiClient.getAllService.getTempoBisnisNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _tempoNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getSindonewsMetroNews() {
        ApiClient.getAllService.getSindonewsMetroNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _sindonewsNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getSindonewsInternationalNews() {
        ApiClient.getAllService.getSindonewsInternationalNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _sindonewsNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getSindonewsDaerahNews() {
        ApiClient.getAllService.getSindonewsDaerahNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _sindonewsNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }





}