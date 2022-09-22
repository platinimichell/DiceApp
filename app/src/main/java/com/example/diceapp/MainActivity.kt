package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        findViewById()
         */

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        buttonD6.setOnClickListener {
//            Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        buttonD12.setOnClickListener {
            rolarDados12(12)
        }
        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        buttonD20.setOnClickListener {
            rolarDados20(20)
        }
    }
    private fun rolarDados(lados: Int) {
        val rolagem = ( 1..lados ).random()
        val textD6 = findViewById<TextView>(R.id.textD6)
        textD6.text = rolagem.toString()
    }
    private fun rolarDados12(lados: Int) {
        val rolagem = ( 1..lados ).random()
        val textD12 = findViewById<TextView>(R.id.textD12)
        textD12.text = rolagem.toString()
    }
    private fun rolarDados20(lados: Int) {
        val rolagem = ( 1..lados ).random()
        val textD20 = findViewById<TextView>(R.id.textD20)
        textD20.text = rolagem.toString()
    }
}