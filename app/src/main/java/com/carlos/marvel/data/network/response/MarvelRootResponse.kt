package com.carlos.marvel.data.network.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class  MarvelRootResponse (

    @Json(name = "data")
    val marvelDataResponse : MarvelDataResponse

 )