package com.example.practica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSig4 = findViewById<Button>(R.id.btnSig4)
        btnSig4.setOnClickListener {
            val siguiente4 = Intent(this, MainActivity::class.java)
            startActivity(siguiente4)
        }
        val btnAnt4 = findViewById<Button>(R.id.btnAnt4)
        btnAnt4.setOnClickListener {
            val anterior4 = Intent(this, MainActivity3::class.java)
            startActivity(anterior4)
        }
    }
}