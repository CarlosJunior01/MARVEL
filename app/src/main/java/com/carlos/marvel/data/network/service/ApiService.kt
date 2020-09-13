package com.carlos.marvel.data.network.service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiService {

    private fun initRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://gateway.marvel.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val service: MarvelService = initRetrofit().create(MarvelService::class.java)

}