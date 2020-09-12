package com.carlos.marvel.presentation.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlos.marvel.R
import com.carlos.marvel.presentation.baseActivity.BaseActivity
import kotlinx.android.synthetic.main.activity_marvel.*

/**
 * Created by CarlosJr
 */

class MarvelActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel)

        //Configurando toolbar
        setupToolbar(toolbarMain, R.string.toolbar_principal)


    }
}