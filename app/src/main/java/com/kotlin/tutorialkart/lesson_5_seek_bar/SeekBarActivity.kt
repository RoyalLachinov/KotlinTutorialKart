package com.kotlin.tutorialkart.lesson_5_seek_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBarActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    private var txtProgres: TextView? = null
    private var txtStatus: TextView? = null
    private var seekBar: SeekBar? = null

    var MIN = 0
    var MAX = 100
    var STEP = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        txtProgres = this.progress
        txtStatus = this.seekbarStatus
        seekBar = this.seekbar
        seekBar!!.setOnSeekBarChangeListener(this)
        seekBar!!.max = (MAX - MIN) / STEP

    }


    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        val step:Int =  MIN + ( progress * STEP )
        //txtProgres!!.text = progress.toString()
        txtProgres!!.text = step.toString()
        txtStatus!!.text = "Tracking Touch"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        txtStatus!!.text = "Started Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        txtStatus!!.text = "Stopped Tracking Touch"
    }


}
