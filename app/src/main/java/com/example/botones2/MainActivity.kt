package com.example.botones2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnUno).setOnClickListener {
            val intent = Intent(this, UnoActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.btnCerrar).setOnClickListener {
            finish()
        }
    }
}
