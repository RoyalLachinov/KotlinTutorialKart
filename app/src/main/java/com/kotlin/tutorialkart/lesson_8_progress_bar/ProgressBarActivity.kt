package com.kotlin.tutorialkart.lesson_8_progress_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
    }


    var status: Int = 1
    fun showProgress(view: View) {

        val prgressBar: ProgressBar = ProgressBar(this)
        layoutProgress.addView(prgressBar)
        Thread(Runnable {
            this@ProgressBarActivity.runOnUiThread(Runnable {
                prgressBar.visibility = View.VISIBLE
            })

            try {

                var i=0;
                while(i<Int.MAX_VALUE){
                    i++
                }
                
            }catch (e:InterruptedException){
                e.printStackTrace()
            }


            this@ProgressBarActivity.runOnUiThread(Runnable {
                prgressBar.visibility = View.GONE
            })
        }).start()

        /*if (status == 2) {
            prgressBar.visibility = View.VISIBLE
            status = 1
        } else {
            prgressBar.visibility = View.GONE
            status = 2
        }*/

    }
}
