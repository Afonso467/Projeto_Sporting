package com.example.projeto


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cria um novo Handler associado ao Looper principal
        val handler = Handler(Looper.getMainLooper())

        // Posta uma tarefa com atraso no Handler
        handler.postDelayed({
            // Adicione aqui o que deseja fazer após o atraso
        }, 1500) // Atraso de 1,5 segundos (1500 milissegundos)
    }
}


