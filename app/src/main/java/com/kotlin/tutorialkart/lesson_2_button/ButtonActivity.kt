package com.kotlin.tutorialkart.lesson_2_button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.kotlin.tutorialkart.R


class ButtonActivity : AppCompatActivity() {

    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.kotlin.tutorialkart.R.layout.activity_button)

        val layoutButton = findViewById<ConstraintLayout>(R.id.layoutButton)

        btn = Button(this)
        btn.text = "Click me"
        btn.setTextColor(Color.WHITE)
        btn.isAllCaps = false
        btn.setBackgroundColor(Color.BLACK)
        layoutButton.addView(btn)

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Hello button lesson", Toast.LENGTH_LONG).show()
        })


    }

    var status: Int = 1
    fun ClickMe(view: View) {
        if (status == 2) {
            btn.setTextColor(Color.WHITE)
            btn.setBackgroundColor(Color.BLACK)

            status = 1
        } else if (status == 1) {
            btn.setTextColor(Color.BLACK)
            btn.setBackgroundColor(Color.WHITE)

            status = 2
        }
        Toast.makeText(this, "Hello from onClick function", Toast.LENGTH_LONG).show()
    }
}
