package com.carlos.marvel.presentation.intros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import com.bumptech.glide.Glide
import com.carlos.marvel.R
import kotlinx.android.synthetic.main.activity_intro_loading.*
import java.util.*

/**
 * Created by CarlosJr
 */

@Suppress("DEPRECATION")
class IntroLoadingActivity : AppCompatActivity() {

    private var timer: Timer? = null

    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_loading)
        ocultarstatusBar()

        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        timer = Timer()

        handler = Handler()

        handler.postDelayed(object : Runnable {
            override fun run() {
                startActivity(
                    Intent(
                        this@IntroLoadingActivity,
                        SlideActivity::class.java
                    )
                )
                finish()
            }
        }, 6000)

        fun onDestroy() {
            super.onDestroy()
            handler.removeCallbacksAndMessages(null)
        }

        Glide.with(this)
            .load(R.drawable.marvel02)
            .into(imageIntro)

        Glide.with(this)
            .load(R.drawable.giphy)
            .into(imageViewLoad)
    }

    private fun ocultarstatusBar() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}