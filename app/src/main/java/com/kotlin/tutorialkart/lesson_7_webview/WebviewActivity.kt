package com.kotlin.tutorialkart.lesson_7_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_webview.*

class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        webView.loadUrl("https://www.tutorialkart.com/kotlin-android/android-webview-example/")
    }
}
