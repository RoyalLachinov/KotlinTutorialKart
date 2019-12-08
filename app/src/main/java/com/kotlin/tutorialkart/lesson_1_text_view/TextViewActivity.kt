package com.kotlin.tutorialkart.lesson_1_text_view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_text_view.*

class TextViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        val mainLayout = findViewById<View>(R.id.layoutTextView) as? ConstraintLayout
        val tvDynamic = TextView(this)
        tvDynamic.textSize = 20f
        tvDynamic.gravity = Gravity.START
        tvDynamic.setTextColor(Color.BLACK)
        tvDynamic.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        tvDynamic.text = "This is a dynamic TextView generated programmatically in Kotlin and we already started the Kotlin" +
                " tutorials with great anxiety"

        mainLayout?.addView(tvDynamic)

        val param = tvDynamic.layoutParams as ConstraintLayout.LayoutParams
        param.setMargins(20,20,20,20)
        tvDynamic.layoutParams = param

        tvDynamic.setOnClickListener {
            Toast.makeText(this@TextViewActivity,"This is an equvalent to the below message", Toast.LENGTH_LONG).show()
            //Toast.makeText(this,"This is an equvalent to the above message", Toast.LENGTH_LONG).show()
        }
    }
}
