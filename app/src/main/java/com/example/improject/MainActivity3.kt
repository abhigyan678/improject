package com.example.improject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.moengage.core.MoECoreHelper


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val logout = findViewById(R.id.logout) as Button
        logout.setOnClickListener(View.OnClickListener {
            MoECoreHelper.logoutUser(this)
        })
    }
}