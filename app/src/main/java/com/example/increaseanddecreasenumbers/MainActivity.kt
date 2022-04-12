package com.example.increaseanddecreasenumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvNull: TextView = findViewById(R.id.tvNull)
        val tvInstruction: TextView = findViewById(R.id.tvInstruction)
        val tvExplanation: TextView = findViewById(R.id.tvExplanation)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val tvResult: TextView = findViewById(R.id.tvResult)
        var numberNull = 0

        tvResult.isVisible = false

        btnPlus.setOnClickListener {
            numberNull++
            tvNull.setText("$numberNull")
            tvResult.isVisible = true

        }

        btnMinus.setOnClickListener {
            numberNull--
            tvNull.setText("$numberNull")
            tvResult.isVisible = true
        }

    }
    }

