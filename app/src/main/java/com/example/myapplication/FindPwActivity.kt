package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FindPwActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_pw)

        var ButtonFindId = findViewById<Button>(R.id.FindIdButton)
        var ButtonFinFindPw = findViewById<Button>(R.id.FinFindPwButton)

        ButtonFindId.setOnClickListener{
            startActivity(Intent(this, FindIdActivity::class.java))
        }

        var UserName = findViewById<EditText>(R.id.UserName2)
        var InputPH = findViewById<EditText>(R.id.InputPH2)
        var InputId = findViewById<EditText>(R.id.InputId)

        ButtonFinFindPw.setOnClickListener{
            if((UserName.text.toString() == "admin") and (InputPH.text.toString() == "01012341234") and (InputId.text.toString() == "admin")) {
                startActivity(Intent(this, FinFindPwActivity::class.java))
            } else {
                Toast.makeText(this, "입력 정보를 다시 확인해주세요", Toast.LENGTH_SHORT).show()
            }

        }

        var moveBackButton1 = findViewById<TextView>(R.id.backButton1)
        moveBackButton1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }
}