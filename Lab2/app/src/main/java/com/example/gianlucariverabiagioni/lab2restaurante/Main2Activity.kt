package com.example.gianlucariverabiagioni.lab2restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val menuRestaurante: ArrayList<String> = arrayListOf("Cangreburger", "Monsteburguer", "Salchiburguer", "Pizza")

        val listViewRM = findViewById<ListView>(R.id.LV_Pedido)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menuRestaurante)
        listViewRM.setAdapter(adapter)
        listViewRM.setOnItemClickListener { parent, view, position, id ->
            val order: MyMenuOrder = (this.application as MyAplication).getOrder()
            order.add(menuRestaurante.get(position))
            Toast.makeText(this, "Se agrego: ${parent.getItemAtPosition(position)}" , Toast.LENGTH_SHORT).show()
        }

        val btnInicio = findViewById<Button>(R.id.btnI)
        btnInicio.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
