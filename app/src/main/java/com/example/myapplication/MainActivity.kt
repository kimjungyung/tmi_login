package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var findIdPw = findViewById<TextView>(R.id.TextFindIdPw)

        findIdPw.setOnClickListener{
            startActivity(Intent(this, FindIdActivity::class.java))
        }

        var loginId = findViewById<EditText>(R.id.loginInputId)
        var loginPw = findViewById<EditText>(R.id.loginInputPw)
        var loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener{
            if((loginId.text.toString() == "admin") and (loginPw.text.toString() == "admin1234")) {
                Toast.makeText(this, "로그인 성공" + loginId.text, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private var doubleBackToExit = false
    override fun onBackPressed() {
        if (doubleBackToExit) {
            finishAffinity()
        } else {
            Toast.makeText(this, "종료하시려면 뒤로가기를 한번 더 눌러주세요.", Toast.LENGTH_SHORT).show()
            doubleBackToExit = true
            runDelayed(1500L) {
                doubleBackToExit = false
            }
        }
    }


    fun runDelayed(millis: Long, function: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(function, millis)
    }
}
