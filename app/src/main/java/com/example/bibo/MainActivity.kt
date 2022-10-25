package com.example.bibo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mail_inp: EditText
    private lateinit var pass_inp: EditText
    private lateinit var gin_inp: Button
    private lateinit var reg_inp: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mail_inp = findViewById(R.id.edtmail)
        pass_inp = findViewById(R.id.edtpas)
        gin_inp = findViewById(R.id.ginbtn)
        reg_inp = findViewById(R.id.btnReg)

        gin_inp.setOnClickListener {
            var email = mail_inp.text.toString().trim()
            var password = pass_inp.text.toString().trim()
            Toast.makeText(this, "email is $email and password is $password", Toast.LENGTH_LONG).show()
        }
        reg_inp.setOnClickListener {
            var  i = Intent(this,RegisterActivity::class.java)
            startActivity(i)
        }




    }
}

