package com.example.rhysticbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to button
        val buttonClick = findViewById(R.id.button) as Button
        //set listener to button
        buttonClick.setOnClickListener()
        {
            //Play sound
            var player = MediaPlayer.create(applicationContext, R.raw.question_male)
            player.start()
        }
    }
}