package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FindIdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_id)

        var ButtonFindPw = findViewById<Button>(R.id.FindPwButton)
        var ButtonFinFindId = findViewById<Button>(R.id.FinFIndIdButton)

        ButtonFindPw.setOnClickListener{
            startActivity(Intent(this, FindPwActivity::class.java))
        }

        var UserName = findViewById<EditText>(R.id.UserName1)
        var InputPH = findViewById<EditText>(R.id.InputPH1)

        ButtonFinFindId.setOnClickListener{
            if((UserName.text.toString() == "admin") and (InputPH.text.toString() == "01012341234")) {
                startActivity(Intent(this, FinFindIdActivity::class.java))
            } else {
                Toast.makeText(this, "입력 정보를 다시 확인해주세요", Toast.LENGTH_SHORT).show()
            }

        }

        var moveBackButton = findViewById<TextView>(R.id.backButton)
        moveBackButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

}