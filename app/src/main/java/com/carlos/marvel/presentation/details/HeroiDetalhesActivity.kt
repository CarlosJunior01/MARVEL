package com.carlos.marvel.presentation.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlos.marvel.R
import com.carlos.marvel.presentation.baseActivity.BaseActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_marvel.*
import kotlinx.android.synthetic.main.activity_marvel.toolbarMain
import kotlinx.android.synthetic.main.item_descricao.*

class HeroiDetalhesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_descricao)

        //Configurando toolbar
        setupToolbar(toolbarMain, R.string.toolbar_detalhes, true)

        val name = intent.getStringExtra("CHAR_NAME")
        val description = intent.getStringExtra("CHAR_DESCRIPTION")
        val path = intent.getStringExtra("CHAR_IMG_PATH")
        val extension = intent.getStringExtra("CHAR_IMAGE_EXTENSION")
        val id = intent.getStringExtra("ID")

        textNomeDescricao.text = name
        textId.text = "Id: " + id
        textDescricao.text = description

        var url = "$path/standard_large.${extension}".split(":")
        Picasso.get().load("https:"+url[1]).into(ImageDescricao)
    }

    companion object {
        fun getStartIntent(
            context: Context, charName: String, charDescription: String,
            charImgPath: String, charImgExtension: String, id: String
        ): Intent {
            return Intent(context, HeroiDetalhesActivity::class.java).apply {
                putExtra("CHAR_NAME" , charName)
                putExtra("CHAR_DESCRIPTION" , charDescription)
                putExtra("CHAR_IMG_PATH" , charImgPath)
                putExtra("CHAR_IMAGE_EXTENSION" , charImgExtension)
                putExtra("ID" ,  id)
            }
        }
    }
}