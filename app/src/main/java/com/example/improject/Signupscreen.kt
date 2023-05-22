package com.example.improject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper
import org.w3c.dom.Text

class Signupscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupscreen)
        val email : TextView = findViewById(R.id.email) as TextView
        val firstname : TextView = findViewById(R.id.firstname) as TextView
        val lastname : TextView = findViewById(R.id.lastname) as TextView

        val signupbtn = findViewById<View>(R.id.signupbtn2) as Button
        signupbtn.setOnClickListener(View.OnClickListener {
            MoEAnalyticsHelper.setEmailId(this,email.text.toString())
            MoEAnalyticsHelper.setUniqueId(this,email.text.toString())
            MoEAnalyticsHelper.setUserName(this,firstname.text.toString())
            MoEAnalyticsHelper.setFirstName(this,firstname.text.toString())
            MoEAnalyticsHelper.setLastName(this,lastname.text.toString())
            val properties = Properties()
            MoEAnalyticsHelper.trackEvent(this, "User Signup", properties)

        })
    }
}