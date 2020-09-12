package com.carlos.marvel.presentation.baseActivity

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected fun setupToolbar(toolbar: androidx.appcompat.widget.Toolbar, titleIdRes: Int, backButton: Boolean = false){
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
        if(backButton)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}