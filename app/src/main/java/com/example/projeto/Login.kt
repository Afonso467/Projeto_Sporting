package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto.R.layout

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.login)

        val button = findViewById<Button>(R.id.gohome)
        button.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        val buttoncriar = findViewById<Button>(R.id.criar)
        button.setOnClickListener {

                val intent = Intent(this, Criar::class.java)
            startActivity(intent)
        }

    }
}