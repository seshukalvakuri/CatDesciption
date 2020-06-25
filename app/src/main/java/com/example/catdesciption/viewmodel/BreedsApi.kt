package com.example.catdesciption.viewmodel

import Json4Kotlin_Base
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface BreedsApi {
    @GET("/breeds")
    fun getData(): Observable<List<Json4Kotlin_Base>>

    companion object {
        val BASE_URL = "https://api.thecatapi.com/v1/"

        private val client = OkHttpClient
            .Builder()
            .build()

        private val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(client)
            .build()
            .create(BreedsApi::class.java)

        fun buildService(): BreedsApi {
            return retrofit
        }
    }
}