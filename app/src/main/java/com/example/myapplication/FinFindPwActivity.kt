package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class FinFindPwActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fin_find_pw)

        var ButtonCheck = findViewById<Button>(R.id.checkButton1)

        ButtonCheck.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        var setId = findViewById<TextView>(R.id.findSetId)
        var setPw = findViewById<TextView>(R.id.findSetPw)
        setId.text = "admin"
        setPw.text = "admin1234"

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }
}