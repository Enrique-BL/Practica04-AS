package com.example.practica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSig2 = findViewById<Button>(R.id.btnSig2)
        btnSig2.setOnClickListener {
            val siguiente2 = Intent(this, MainActivity3::class.java)
            startActivity(siguiente2)
        }
        val btnAnt2 = findViewById<Button>(R.id.btnAnt2)
        btnAnt2.setOnClickListener {
            val anterior2 = Intent(this, MainActivity::class.java)
            startActivity(anterior2)
        }
    }
}