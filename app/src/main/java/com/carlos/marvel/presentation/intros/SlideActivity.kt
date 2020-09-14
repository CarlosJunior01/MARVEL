package com.carlos.marvel.presentation.intros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.carlos.marvel.R
import com.carlos.marvel.presentation.marvel.MarvelActivity
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide

/**
* Created by CarlosJr
*/

class SlideActivity : IntroActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        isButtonBackVisible = false
        isButtonNextVisible = false

        addSlide(
            FragmentSlide.Builder()
                .background(android.R.color.holo_red_dark)
                .fragment(R.layout.intro_01)
                .build()

        )

        addSlide(
            FragmentSlide.Builder()
                .background(android.R.color.holo_green_dark)
                .fragment(R.layout.intro_02)
                .build()
        )

        addSlide(
            FragmentSlide.Builder()
                .background(android.R.color.holo_orange_dark)
                .fragment(R.layout.intro_03)
                .canGoForward(false)
                .build()
        )

    }

    public fun openNextActivity(view: View){
        val intent = Intent(this, MarvelActivity::class.java)
        startActivity(intent)
        finish()
    }
}