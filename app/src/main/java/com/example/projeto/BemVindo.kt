package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BemVindo: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bem_vindo)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Iniciar a atividade de login
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}