package com.example.gianlucariverabiagioni.lab2restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.btnMostrarMenu)
        boton.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)}

        val btnMostrarMenu = findViewById<Button>(R.id.btnMostrarPedido)
        btnHacerPedido.setOnClickListener{ val intent2 = Intent(this, Main3Activity::class.java)
            startActivity(intent2)
        }
    }

}
