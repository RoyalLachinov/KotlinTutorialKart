package com.kotlin.tutorialkart.lesson_12_ui_thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_uithread_example.*

class UIThreadExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uithread_example)

        Thread(Runnable {
            var i = 0
            while (i < Int.MAX_VALUE) {
                i++
            }

            this@UIThreadExample.runOnUiThread(Runnable {
                txtUiExample.text = "Updated from other thread"
            })
        }).start()
    }
}
