package com.carlos.marvel.presentation.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.carlos.marvel.R
import com.carlos.marvel.presentation.baseActivity.BaseActivity
/**
 * Created by CarlosJr
 */
class AboutActivity : BaseActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun linkedin(view: View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/carlosjrdeveloper"))
        startActivity(browserIntent)
        Toast.makeText(this, "Abrindo Linkedin", Toast.LENGTH_SHORT).show()
    }

    fun openScene(view: View){
        count+=1
        if (count >= 10){

            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Easter egg unlocked!!!", Toast.LENGTH_SHORT).show()

        }
    }
}