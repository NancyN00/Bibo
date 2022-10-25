package com.example.bibo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var usersname: EditText
    private lateinit var useremail: EditText
    private lateinit var userpass: EditText
    private lateinit var usersign: Button
    private lateinit var userlog: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username = findViewById(R.id.nameinp)
        usersname = findViewById(R.id.snameinp)
        useremail = findViewById(R.id.emailinp)
        userpass = findViewById(R.id.passinp)
        usersign = findViewById(R.id.btnSign)
        userlog = findViewById(R.id.btnLog)

        usersign.setOnClickListener {
            var username = username.text.toString().trim()
            var usersnamee = usersname.text.toString().trim()
            var useremail = useremail.text.toString().trim()
            var userpass = userpass.text.toString().trim()

            Toast.makeText(this, "successfully registered", Toast.LENGTH_SHORT).show()

            userlog.setOnClickListener {
                var i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }
    }
}

