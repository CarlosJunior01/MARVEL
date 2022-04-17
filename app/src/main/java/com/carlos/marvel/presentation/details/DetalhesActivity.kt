package com.carlos.marvel.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.carlos.marvel.R
import com.carlos.marvel.presentation.baseActivity.BaseActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_marvel.toolbarMain
import kotlinx.android.synthetic.main.item_descricao.*

/**
 * Created by CarlosJr
 */
class DetalhesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_descricao)
        setupToolbar(toolbarMain, R.string.toolbar_detalhes, true)

        val id = intent.getStringExtra("ID")

        val detalhesViewModel: DetalhesViewModel = ViewModelProviders.of(this).get(
            DetalhesViewModel::class.java)


        detalhesViewModel.mLiveData.observe(this, {

                textNomeDescricao.text = it.name
                textDescricao.text = it.description
                textId.text = "ID: " + it.id

                val url = "${it.marvelThumbnail.path}/standard_large.${it.marvelThumbnail.extension}"
                    .split(":")
                Picasso.get().load("https:" + url[1]).into(ImageDescricao)
        })

        detalhesViewModel.getId(id.toString())
    }
            companion object {
            fun getStartIntent(
                context: Context, id: String
            ): Intent {
                return Intent(context, DetalhesActivity::class.java).apply {
                    putExtra("ID", id)
                }
            }
        }
    }