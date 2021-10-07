package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        this.title = "Android Review"

        var myRV = findViewById<RecyclerView>(R.id.MyAndroidRV)
        myRV.adapter = AndroidRecyclerViewAdapter()
        myRV.layoutManager = LinearLayoutManager(this)
    }
}