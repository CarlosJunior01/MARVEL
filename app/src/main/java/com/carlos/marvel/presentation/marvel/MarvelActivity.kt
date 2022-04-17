package com.carlos.marvel.presentation.marvel

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.carlos.marvel.R
import com.carlos.marvel.presentation.baseActivity.BaseActivity
import com.carlos.marvel.presentation.details.DetalhesActivity
import kotlinx.android.synthetic.main.activity_marvel.*

/**
 * Created by CarlosJr
 */

class MarvelActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel)
        setupToolbar(toolbarMain, R.string.toolbar_principal)

        val marvelViewModel: MarvelViewModel = ViewModelProviders.of(this).get(MarvelViewModel::class.java)

        marvelViewModel.heroisLiveData.observe(this, {
            it?.let { marvelList ->
                with(recyclerView) {
                    layoutManager = GridLayoutManager(this@MarvelActivity, 2 )
                    setHasFixedSize(true)
                    adapter = MarvelAdapter(marvelList) {

                        val intent = DetalhesActivity.getStartIntent(
                            this@MarvelActivity, it.id
                        )
                        this@MarvelActivity.startActivity(intent)
                    }
                }
            }
        })
        marvelViewModel.getHerois()
    }
}