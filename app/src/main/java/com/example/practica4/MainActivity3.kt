package com.example.practica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSig3 = findViewById<Button>(R.id.btnSig3)
        btnSig3.setOnClickListener {
            val siguiente3 = Intent(this, MainActivity4::class.java)
            startActivity(siguiente3)
        }
        val btnAnt3 = findViewById<Button>(R.id.btnAnt3)
        btnAnt3.setOnClickListener {
            val anterior3 = Intent(this, MainActivity2::class.java)
            startActivity(anterior3)
        }
    }
}