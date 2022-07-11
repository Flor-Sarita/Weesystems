package com.example.weesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var card = findViewById<CardView>(R. id. background_card)
        card.setOnClickListener {
            startActivity(Intent(this, backgroud::class.java))
            }

        var card2 = findViewById<CardView>(R. id. experience_card)
        card2.setOnClickListener {
            startActivity(Intent(this, experience::class.java))
            }

        var card3 = findViewById<CardView>(R.id. interest_card)
        card3.setOnClickListener {
            startActivity(Intent(this, interest::class.java ))
            }

        var card4 = findViewById<CardView>(R.id. portfolio_card)
        card4.setOnClickListener {
            startActivity(Intent(this, portafolio::class.java ))

            }

        }
}

