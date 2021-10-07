package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        this.title = "Kotlin Metrials"

        var MyRV = findViewById<RecyclerView>(R.id.MyKotlinRV)
        MyRV.adapter = KotlinRecyclerViewAdapter()
        MyRV.layoutManager = LinearLayoutManager(this)
    }
}