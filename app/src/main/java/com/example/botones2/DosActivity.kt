package com.example.botones2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)

        findViewById<View>(R.id.btnUno).setOnClickListener {
            val intent = Intent(this, UnoActivity::class.java)
            startActivity(intent)
        }
    }
}
