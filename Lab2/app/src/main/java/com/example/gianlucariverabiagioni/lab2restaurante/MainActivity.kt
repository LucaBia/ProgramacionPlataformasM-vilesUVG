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

        //Codigo para que al presionar el boton vaya al menu del restaurante
        val boton = findViewById<Button>(R.id.btnMostrarMenu)
        boton.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)}

        //Codigo necesario para que al presionar el segundo boton, se dirija a la activity 3 en donde se encuentra la activity de el pedido realizado
        val btnMostrarPedido = findViewById<Button>(R.id.btnMostrarPedido)
        btnMostrarPedido.setOnClickListener{ val intent2 = Intent(this, Main3Activity::class.java)
            startActivity(intent2)
        }
    }

}
