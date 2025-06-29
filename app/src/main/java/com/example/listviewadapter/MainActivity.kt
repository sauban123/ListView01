package com.example.listviewadapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView =  findViewById<ListView>(R.id.listView)
        val takeList = arrayListOf<String>()
        takeList.add("daily gfg Post ")
        takeList.add("daily leetcode sql submission")
        takeList.add("sql Practive   ")
        takeList.add("android development ")
        takeList.add("daily revision   ")
        takeList.add("class attend ")
        takeList.add("exercise daily  ")

        // Add numbering        ye waali line hata skte ho
        val numberedTasks = takeList.mapIndexed { index, task -> "${index + 1}. $task" }

        val adapterForLIstView =  ArrayAdapter(this,android.R.layout.simple_list_item_1,numberedTasks)
        listView.adapter = adapterForLIstView

        listView.setOnItemClickListener { parent, view, position, id ->
            val text = "clicked on: " + (view as TextView).text.toString()
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }

    }
}