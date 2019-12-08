package com.kotlin.tutorialkart.lesson_9_snack_bar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.kotlin.tutorialkart.R

class SnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
    }

    fun showSnackbar(view: View) {
        val snackBar = Snackbar.make(view,"This is a simple snackbar", Snackbar.LENGTH_LONG)
        snackBar.setAction("OK", View.OnClickListener {
            Toast.makeText(this,"We showed snackbar", Toast.LENGTH_LONG).show()
        })

        snackBar.show()

        snackBar.setActionTextColor(Color.parseColor("#9dc209"))
        snackBar.view.setBackgroundColor(Color.parseColor("#f498ad"))
        val textView = snackBar.view.findViewById(R.id.snackbar_text) as TextView
        // change Snackbar text color
        textView.setTextColor(Color.parseColor("#4444DD"))
    }
}
