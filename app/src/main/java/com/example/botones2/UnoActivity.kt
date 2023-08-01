package com.example.botones2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UnoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno)

        findViewById<View>(R.id.btnDosUnoActivity).setOnClickListener {
            val intent = Intent(this, DosActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.btnMain).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
