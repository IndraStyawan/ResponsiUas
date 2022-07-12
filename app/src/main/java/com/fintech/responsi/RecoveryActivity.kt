package com.fintech.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recovery.*

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        icBack.setOnClickListener {
            var intent = Intent(this@RecoveryActivity, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}