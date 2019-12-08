package com.kotlin.tutorialkart.lesson_13_text_to_speach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.kotlin.tutorialkart.R
import java.util.*

class TextToSpeachActivity : AppCompatActivity(), TextToSpeech.OnInitListener {


    private var tts: TextToSpeech? = null
    private var btnSpeak: Button? = null
    private var etSpeach: EditText? = null

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts!!.setLanguage(Locale.CANADA)

            if (result == TextToSpeech.LANG_MISSING_DATA ||
                result == TextToSpeech.LANG_NOT_SUPPORTED
            ) {
                Log.e("TTS", "The Language specified is not supported!")
            } else {
                btnSpeak!!.isEnabled = true
            }
        } else {
            Log.e("TTS", "Initilization Failed!")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_to_speach)

        btnSpeak = findViewById(R.id.btnSpeak) as Button
        etSpeach = findViewById(R.id.etSpeach) as EditText
        tts = TextToSpeech(this, this)

        btnSpeak!!.isEnabled = false
        btnSpeak!!.setOnClickListener {
            speakOut()
        }
    }

    fun speakOut() {
        var text = etSpeach!!.text.toString()
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }

        super.onDestroy()
    }
}
