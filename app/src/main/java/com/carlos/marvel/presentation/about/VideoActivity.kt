package com.carlos.marvel.presentation.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.carlos.marvel.R
import kotlinx.android.synthetic.main.activity_video.*
/**
 * Created by CarlosJr
 */
class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.spider)
        var mediaController: MediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}