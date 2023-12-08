package com.example.examnews.data.network

import androidx.contentpager.content.Query
import com.example.examnews.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {

    @GET("/suara/terbaru/")
    fun getSuaraTerbaruNews(): Call<NewsResponse>

    @GET("/suara/otomotif/")
    fun getSuaraOtomotifNews(): Call<NewsResponse>

    @GET("/suara/entertainment/")
    fun getSuaraEntertainmentNews(): Call<NewsResponse>

    //tempo

    @GET("/tempo/nasional/")
    fun getTempoNasionalNews(
    ): Call<NewsResponse>

    @GET("/tempo/bisnis/")
    fun getTempoBisnisNews(
    ): Call<NewsResponse>

    @GET("/tempo/dunia/")
    fun getTempoDuniaNews(
    ): Call<NewsResponse>

    //sindonews

    @GET("/sindonews/metro")
    fun getSindonewsMetroNews(
    ): Call<NewsResponse>

    @GET("/sindonews/international/")
    fun getSindonewsInternationalNews(
    ): Call<NewsResponse>

    @GET("/sindonews/daerah/")
    fun getSindonewsDaerahNews(
    ): Call<NewsResponse>





}