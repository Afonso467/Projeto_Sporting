package com.example.projeto

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Criar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.criar_conta)

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        val imageView = findViewById<ImageView>(R.id.imageView)

        imageButton.setOnClickListener {
            // Trocar a imagem do ImageView para a imagem correspondente ao clicar no imageButton
            imageView.setImageResource(R.drawable.camisola1costas)
        }

        imageButton1.setOnClickListener {
            // Trocar a imagem do ImageView para a imagem correspondente ao clicar no imageButton1
            imageView.setImageResource(R.drawable.camisola)
        }

        imageButton2.setOnClickListener {
            // Trocar a imagem do ImageView para a imagem correspondente ao clicar no imageButton2
            imageView.setImageResource(R.drawable.camisola3costas)
        }

        val alcunhaEditText = findViewById<EditText>(R.id.escreveralcunha)
        val alcunhaTextView = findViewById<TextView>(R.id.alcunha)

        alcunhaEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Nada a fazer aqui
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Atualizar o texto do TextView conforme o texto é digitado no EditText
                alcunhaTextView.text = s.toString()

                // Centralizar o TextView horizontalmente em relação à camisola
                val imageView = findViewById<ImageView>(R.id.imageView)
                val centerX = imageView.x + imageView.width / 2
                val textViewWidth = alcunhaTextView.width
                alcunhaTextView.x = centerX - textViewWidth / 2
            }

            override fun afterTextChanged(s: Editable?) {
                // Nada a fazer aqui
            }
        })
    }
}
