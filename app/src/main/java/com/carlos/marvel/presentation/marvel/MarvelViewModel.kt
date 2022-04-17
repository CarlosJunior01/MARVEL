package com.carlos.marvel.presentation.marvel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlos.marvel.data.model.MarvelItem
import com.carlos.marvel.data.network.response.MarvelResultsResponse
import com.carlos.marvel.data.network.response.MarvelRootResponse
import com.carlos.marvel.data.network.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by CarlosJr
 */

class MarvelViewModel :ViewModel() {

    val mutableLiveData = MutableLiveData<List<MarvelResultsResponse>>()
    val heroisLiveData : LiveData<List<MarvelResultsResponse>> = mutableLiveData

    fun getHerois(){
        ApiService.service.getHerois().enqueue(object : Callback<MarvelRootResponse> {

            override fun onResponse(call: Call<MarvelRootResponse>, response: Response<MarvelRootResponse>) {
                if (response.isSuccessful){
                    val listMarvelItems: MutableList<MarvelItem> = mutableListOf()

                    response.body()?.let {heroesResponse ->
                        mutableLiveData.value = heroesResponse.marvelDataResponse.results
                    }
                }else{
                    Log.e("Erro API", response.message())
                }
            }
            override fun onFailure(call: Call<MarvelRootResponse>, t: Throwable) {
                Log.e("Erro API ", t.message.toString())
            }
        })
    }
}