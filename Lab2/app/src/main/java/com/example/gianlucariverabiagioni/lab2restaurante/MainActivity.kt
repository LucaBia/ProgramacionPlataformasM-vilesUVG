package com.example.gianlucariverabiagioni.lab2restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.btnMostrarMenu)
        boton.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)}
    }

}
