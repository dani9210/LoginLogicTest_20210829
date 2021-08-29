package com.nepplus.loginlogictest_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        LoginBtn.setOnClickListener {

            val idTxt = "admin"
            val passTxt

            Toast.makeText(this, "관리자님 환영 합니다.", Toast.LENGTH_SHORT).show()
        }



    }
}