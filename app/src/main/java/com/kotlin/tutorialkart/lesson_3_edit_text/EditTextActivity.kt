package com.kotlin.tutorialkart.lesson_3_edit_text

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.annotation.ColorLong
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {

    lateinit var et: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        et = EditText(this)
        et.setText("")
        et.hint = "Password"
        et.setTextColor(Color.RED)
        et.setBackgroundColor(Color.CYAN)
        et.setPadding(40, 10, 40, 10)
        et.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
        et.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        
        layoutEditText.addView(et)

        et.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                txtLabel.text = s.toString()
            }
        })

    }

    fun showHide(v: View) {
        if (btnShowHide.text.toString().equals("Show")) {
            et.transformationMethod = HideReturnsTransformationMethod.getInstance()
            btnShowHide.text = "Hide"
        }else if(btnShowHide.text.toString().equals("Hide")){
            et.transformationMethod = PasswordTransformationMethod.getInstance()
            btnShowHide.text = "Show"
        }
    }
}
