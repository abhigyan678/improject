package com.example.improject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.moengage.core.analytics.MoEAnalyticsHelper
import android.widget.TextView
import com.moengage.inapp.MoEInAppHelper
import com.moengage.pushbase.MoEPushHelper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MoEPushHelper.getInstance().requestPushPermission(this)


        val username : TextView = findViewById(R.id.username) as TextView
        val password : TextView = findViewById(R.id.password) as TextView

       // val loginbutton : Button = findViewById(R.id.loginbtn) as Button
        val loginbtn = findViewById<View>(R.id.loginbtn) as Button

        loginbtn.setOnClickListener(View.OnClickListener {
            MoEAnalyticsHelper.setUniqueId(this,username.text.toString())

            val properties = com.moengage.core.Properties()
            MoEAnalyticsHelper.trackEvent(this, "Login in android", properties)
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)


        })
        val signupbtn  = findViewById<View>(R.id.signupbtn) as Button

        signupbtn.setOnClickListener((View.OnClickListener {

            val intent = Intent(this,Signupscreen::class.java)
            startActivity(intent)
        }))

    }
    override fun onStart(){
        super.onStart()
        MoEInAppHelper.getInstance().showInApp(this)
    }

}