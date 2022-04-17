package com.carlos.marvel.data.network.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MarvelThumbnailResponse(

    val path : String,
    val extension : String
)