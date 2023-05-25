package com.example.improject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.moengage.cards.ui.CardActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val firstoption = findViewById<Button>(R.id.firstoption)
        val secondoption = findViewById<Button>(R.id.secondoption)
        firstoption.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext ,MainActivity3::class.java)
            startActivity(intent)
        })
        secondoption.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, CardActivity::class.java)
            startActivity(intent)
        })
    }
}