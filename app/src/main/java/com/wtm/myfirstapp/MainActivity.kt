package com.wtm.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinNowBtn: Button=findViewById(R.id.joinNow)
        joinNowBtn.setOnClickListener{
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }
    }
}