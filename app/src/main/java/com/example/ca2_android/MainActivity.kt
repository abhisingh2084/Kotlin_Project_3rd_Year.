package com.example.ca2_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val questionOne: MaterialButton = findViewById(R.id.questionone)
        val questionTwo: MaterialButton = findViewById(R.id.questiontwo)
        questionOne.setOnClickListener{
            val intent = Intent(this@MainActivity,QuestionOne::class.java)
            startActivity(intent)

        }
        questionTwo.setOnClickListener{
            val intent = Intent(this@MainActivity,QuestionTwo::class.java)
            startActivity(intent)

        }

    }
}