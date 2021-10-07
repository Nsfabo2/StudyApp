package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
Create a Study App that can be used to review the materials we have covered up to this point.
The App should start with a Main Activity that lets users navigate to Kotlin content or Android content.
The Kotlin Activity and the Android Activity should each make use of a Recycler View containing Card Views with a topic title and short description.
Each Card View should have an OnClickListener that displays a full "lesson" inside of an Alert Dialog when clicked.
You don't need to be very specific with the materials. A few short notes on each topic will be enough.
*/

class MainActivity : AppCompatActivity() {

lateinit var ButtonAndroid: Button
lateinit var ButtonKotlin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonAndroid = findViewById(R.id.ButtonAndroid)
        ButtonKotlin = findViewById(R.id.ButtonKotlin)

        ButtonAndroid.setOnClickListener(){AndroidMetrials()}
        ButtonKotlin.setOnClickListener(){KotlinMetrials()}

        title = "Study App"
    }//end onCreate

    fun AndroidMetrials(){
        val intent = Intent(this, AndroidActivity::class.java)
        startActivity(intent)
    }//end

    fun KotlinMetrials(){
        val intent = Intent(this, KotlinActivity::class.java)
        startActivity(intent)
    }//end

}//end class