package com.example.projeto

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)


        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        // Configurando o adapter para o ViewPager
        val adapter = MyPagerAdapter(this)
        viewPager.adapter = adapter

        // Configurando notícias (apenas exemplo, você precisará substituir por suas próprias notícias)
        val newsList = listOf(
            News("Título da Notícia 1", "Conteúdo da Notícia 1"),
            News("Título da Notícia 2", "Conteúdo da Notícia 2")
        )

        val linearLayout = findViewById<LinearLayout>(R.id.LinearLayoutNews)
        for (news in newsList) {
            val newsView = layoutInflater.inflate(R.layout.item_news, null)
            val titleTextView = newsView.findViewById<TextView>(R.id.textViewTitle)
            val contentTextView = newsView.findViewById<TextView>(R.id.textViewContent)
            titleTextView.text = news.title
            contentTextView.text = news.content
            linearLayout.addView(newsView)
        }
    }
}

data class News(val title: String, val content: String)