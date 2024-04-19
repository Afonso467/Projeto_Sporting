package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.ImageButton


class BemVindo: AppCompatActivity() {



    private lateinit var btnOpenPopup: ImageButton
    private var isMenuIcon = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bem_vindo)

        btnOpenPopup = findViewById(R.id.btn_open_popup)

        btnOpenPopup.setOnClickListener { view ->
            if (isMenuIcon) {
                showPopupMenu(view as ImageButton)
            } else {
                toggleIcon(btnOpenPopup)
            }
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Iniciar a atividade de login
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun showPopupMenu(view: ImageButton) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
            when (item?.itemId) {
                R.id.menu_option_1 -> {
                    // Adicione o código para a ação da opção 1 aqui
                    true
                }
                R.id.menu_option_2 -> {
                    // Adicione o código para a ação da opção 2 aqui
                    true
                }
                else -> false
            }
        }
        popupMenu.setOnDismissListener {
            toggleIcon(view)
        }
        popupMenu.show()
    }

    private fun toggleIcon(imageButton: ImageButton) {
        if (isMenuIcon) {
            // Alterna para o ícone "X"
            imageButton.setImageResource(R.drawable.ic_menu)
        } else {
            // Alterna para o ícone de menu
            imageButton.setImageResource(R.drawable.ic_close)
        }

        // Inverte o estado do ícone
        isMenuIcon = !isMenuIcon
    }
}



