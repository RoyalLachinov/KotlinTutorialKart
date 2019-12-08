package com.kotlin.tutorialkart.lesson_4_radio_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import com.kotlin.tutorialkart.R

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val rg = RadioGroup(this)
        rg.orientation = RadioGroup.VERTICAL

        val options = listOf<String>("Option 1", "Option 2", "Option 3", "Option 4")

        for (i in options.indices){
            val rb = RadioButton(this)
            rb.text = options[i]
            rb.id = View.generateViewId()

            if((i+1)%3==0)
                rb.isChecked = true

            rg.addView(rb)
        }

        val mainLayout = findViewById<LinearLayout>(R.id.layoutRadioButton)
        mainLayout.addView(rg)
    }
}
