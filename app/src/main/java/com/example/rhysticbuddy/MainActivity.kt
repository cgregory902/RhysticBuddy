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
        //Initialize mediaplayer object
        var player = MediaPlayer.create(applicationContext, R.raw.question_male)

        //FIXME: is it funnier to have the sounds able to overlap? Code must be changed if so
        //create new mediaplayer object at every buttonClick - just move player init into listener

        //set listener to button
        buttonClick.setOnClickListener()
        {
            //Play sound
            player.start()
        }
    }
}