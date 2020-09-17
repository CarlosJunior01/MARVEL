package com.carlos.marvel.data.network.service

import com.carlos.marvel.data.network.response.MarvelRootResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelService {

    @GET("v1/public/characters")
    fun  getHerois(

        @Query("ts") ts: String = TIMESTAMP,
        @Query("apikey") apikey: String = CHAVE_PUBLICA,
        @Query("hash") hash: String = MD5_HASH.md5(),
        @Query("limit") limit: Int = 100,
        @Query("orderBy") orderBy: String = "-name"
    ): Call<MarvelRootResponse>

    @GET("v1/public/characters/{characterId}")
    fun getHeroisId(
        @Path("characterId") characterId: String,
        @Query("ts") ts: String = TIMESTAMP,
        @Query("apikey") apikey: String = CHAVE_PUBLICA,
        @Query("hash") hash: String = MD5_HASH.md5(),
        @Query("limit") limit: Int = 100,
        @Query("orderBy") orderBy: String = "-name"

    ): Call<MarvelRootResponse>

}