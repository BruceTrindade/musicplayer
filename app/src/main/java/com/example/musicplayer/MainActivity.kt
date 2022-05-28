package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playerjuice.R

class MainActivity : AppCompatActivity() {
   // var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}