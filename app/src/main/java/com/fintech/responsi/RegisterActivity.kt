package com.fintech.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recovery.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        icBack.setOnClickListener {
            var intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            var intent = Intent(this@RegisterActivity, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}