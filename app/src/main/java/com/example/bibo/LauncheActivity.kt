package com.example.bibo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LauncheActivity : AppCompatActivity() {
    private lateinit var e_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launche)

        e_btn = findViewById(R.id.enterbtn)

        e_btn.setOnClickListener {
            var i = Intent (this, RegisterActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}