package com.example.lab5_03_11_2022.model

import android.media.AudioAttributes
import android.media.MediaPlayer

class MyMediaPlayer {
    private var mediaPlayer: MediaPlayer = MediaPlayer()

    fun pause() {
        mediaPlayer.pause()
        mediaPlayer.reset()
    }
    fun start() {
        mediaPlayer.start()
    }


     fun setUpRadio(url: String) {
        mediaPlayer = MediaPlayer().apply{
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
        }
        setAndPrepareRadioLink(url)
    }

    fun startRadio(mediaPlayer: MyMediaPlayer) {
        mediaPlayer.start()
    }
    fun setAndPrepareRadioLink(url: String) {
        mediaPlayer.reset()
        mediaPlayer.setDataSource(url)
//        mediaPlayer.prepare()
        mediaPlayer.setOnPreparedListener {
            it.start()
        }
        mediaPlayer.prepareAsync()
    }
}