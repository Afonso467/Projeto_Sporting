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
import android.app.Dialog
import android.view.ViewGroup
import android.view.Window


class BemVindo: AppCompatActivity() {

    private lateinit var btnOpenPopup: ImageButton
    private var isMenuIcon = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bem_vindo)

        btnOpenPopup = findViewById(R.id.btn_open_popup)
        btnOpenPopup.setOnClickListener {
            if (isMenuIcon) {
                showPopupMenu()
                toggleIcon()
            } else {
                toggleIcon()
            }
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun showPopupMenu() {
        // Implemente o código do PopupMenu aqui
    }

    private fun toggleIcon() {
        isMenuIcon = !isMenuIcon
        if (isMenuIcon) {
            btnOpenPopup.setImageResource(R.drawable.ic_menu)
        } else {
            btnOpenPopup.setImageResource(R.drawable.ic_close)
        }
    }

    fun showFullScreenMenu(view: View) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.full_screen_menu)

        // Configurar opções de menu
        val option1Button = dialog.findViewById<Button>(R.id.option_1_button)
        option1Button.setOnClickListener {
            // Adicione a ação para a opção 1 aqui
            dialog.dismiss() // Fechar o diálogo após a seleção da opção
        }

        val option2Button = dialog.findViewById<Button>(R.id.option_2_button)
        option2Button.setOnClickListener {
            // Adicione a ação para a opção 2 aqui
            dialog.dismiss() // Fechar o diálogo após a seleção da opção
        }

        // Adicione mais opções conforme necessário

        // Configurar largura e altura do diálogo
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        // Exibir o diálogo apenas se a atividade ainda estiver ativa
        if (!isFinishing) {
            dialog.show()
        }
    }
}



