package com.carlos.marvel.presentation.marvel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlos.marvel.data.model.MarvelItem

/**
 * Created by CarlosJr
 */

class MarvelViewModel :ViewModel() {

    val heroisLiveData : MutableLiveData<List<MarvelItem>> = MutableLiveData()

    fun getHeroes(){
       heroisLiveData.value = createFakeHerois()
    }

    fun createFakeHerois(): List<MarvelItem> {
        return listOf(
            MarvelItem("Homem Aranha1"),
            MarvelItem("Homem Aranha2"),
            MarvelItem("Homem Aranha3"),
            MarvelItem("Homem Aranha4"),
            MarvelItem("Homem Aranha5"),
            MarvelItem("Homem Aranha6")
        )
    }
}