package com.example.practica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSig1 = findViewById<Button>(R.id.btnSig1)
        btnSig1.setOnClickListener {
            val siguiente1 = Intent(this, MainActivity2::class.java)
            startActivity(siguiente1)
        }
        val btnAnt1 = findViewById<Button>(R.id.btnAnt1)
        btnAnt1.setOnClickListener {
            val anterior1 = Intent(this, MainActivity4::class.java)
            startActivity(anterior1)
        }
    }
}