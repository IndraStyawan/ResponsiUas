package com.fintech.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val db = DBHelper(this)
        btn_login.setOnClickListener {

            val nama = et_nama.text.toString()
            val pass = et_Password.text.toString()

            db.insertData(User(null,nama,pass))

            var login = Intent(this@LoginActivity, DashboardActivity::class.java)
            startActivity(login)
            }





}
}