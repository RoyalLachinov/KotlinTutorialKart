package com.kotlin.tutorialkart

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlin.tutorialkart.lesson_10_list_view.ListviewActivity
import com.kotlin.tutorialkart.lesson_11_device_width_height.DeviceActivity
import com.kotlin.tutorialkart.lesson_12_ui_thread.UIThreadExample
import com.kotlin.tutorialkart.lesson_13_text_to_speach.TextToSpeachActivity
import com.kotlin.tutorialkart.lesson_1_text_view.TextViewActivity
import com.kotlin.tutorialkart.lesson_2_button.ButtonActivity
import com.kotlin.tutorialkart.lesson_3_edit_text.EditTextActivity
import com.kotlin.tutorialkart.lesson_4_radio_button.RadioButtonActivity
import com.kotlin.tutorialkart.lesson_5_seek_bar.SeekBarActivity
import com.kotlin.tutorialkart.lesson_6_alert_dialog.AlertDialogActivity
import com.kotlin.tutorialkart.lesson_7_webview.WebviewActivity
import com.kotlin.tutorialkart.lesson_8_progress_bar.ProgressBarActivity
import com.kotlin.tutorialkart.lesson_9_snack_bar.SnackbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHelloWorld.minHeight = 44
        btnHelloWorld.setBackgroundColor(Color.BLACK)
        btnHelloWorld.setPadding(10,10,10,10)
        btnHelloWorld.setTextColor(Color.WHITE)
        btnHelloWorld.textSize = 22f
        btnHelloWorld.text = "Click to navigate next page"
        btnHelloWorld.setOnClickListener {
            val intent = Intent(this, TextToSpeachActivity::class.java)
            startActivity(intent)
        }

        btnUrl.setOnClickListener(View.OnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW)
            urlIntent.data = Uri.parse("https://www.tutorialkart.com/")
            startActivity(urlIntent)
        })

    }
}
