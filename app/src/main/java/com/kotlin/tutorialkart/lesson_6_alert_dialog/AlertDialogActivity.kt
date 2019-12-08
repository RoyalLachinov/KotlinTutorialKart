package com.kotlin.tutorialkart.lesson_6_alert_dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.kotlin.tutorialkart.R

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
    }

    fun showAlert(view: View) {
        val aDialogBuilder = AlertDialog.Builder(this)
        aDialogBuilder.setMessage("Do you want to close this application ?")
        aDialogBuilder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->

            finish()
        }).setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss()
        })

        val aDialog = aDialogBuilder.create()
        aDialog.setTitle("Alert Dialog Example")
        aDialog.show()

    }

}
