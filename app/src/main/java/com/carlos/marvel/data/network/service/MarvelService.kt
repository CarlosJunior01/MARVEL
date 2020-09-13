package com.carlos.marvel.data.network.service

import com.carlos.marvel.data.network.response.MarvelRootResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {

    @GET("v1/public/characters?orderBy=-name&limit=100")
    fun getHeroes(
        @Query("ts") ts: String = TIMESTAMP,
        @Query("apikey") apikey: String = CHAVE_PUBLICA,
        @Query("hash") hash: String = MD5_HASH.md5()
    ): Call<MarvelRootResponse>
}