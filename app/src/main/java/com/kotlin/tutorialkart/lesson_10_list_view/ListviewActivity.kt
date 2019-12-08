package com.kotlin.tutorialkart.lesson_10_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.kotlin.tutorialkart.R
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val cities = arrayListOf<String>(
            "Melbourne",
            "Vienna",
            "Vancouver",
            "Toronto",
            "Calgary",
            "Adelaide",
            "Perth",
            "Auckland",
            "Helsinki",
            "Hamburg",
            "Munich",
            "New York",
            "Sydney",
            "Paris",
            "Cape Town",
            "Barcelona",
            "London",
            "Bangkok"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cities)
        val listView: ListView = findViewById(R.id.listivew)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val item: String = parent.getItemAtPosition(position) as String
            Toast.makeText(this, item, Toast.LENGTH_LONG).show()
        }

        val addItem = findViewById<Button>(R.id.addItem)
        val et = findViewById<EditText>(R.id.etCity)
        addItem.setOnClickListener {
            cities.add(et.text.toString())
            adapter.notifyDataSetChanged()
            etCity.text = null
        }

    }
}
