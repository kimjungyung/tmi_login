package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FinFindIdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fin_find_id)

        var ButtonCheck = findViewById<Button>(R.id.checkButton)

        ButtonCheck.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        var setId = findViewById<TextView>(R.id.findSetId)
        setId.text = "admin"

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

}