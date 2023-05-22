package com.example.improject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val firstoption = findViewById(R.id.firstoption) as Button
        firstoption.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        })
    }
}