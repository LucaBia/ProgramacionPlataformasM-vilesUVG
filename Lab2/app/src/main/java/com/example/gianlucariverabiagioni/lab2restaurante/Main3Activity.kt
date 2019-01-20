package com.example.gianlucariverabiagioni.lab2restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val order = (this.application as MyAplication).getOrder()

        val ListView = findViewById<ListView>(R.id.LV_Pedido)
        ListView.setOnItemClickListener {parent, view, position, id ->
            order.del(position)
            Toast.makeText(this, "Se ha eliminado: ${parent.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, order.menuOrder)
        ListView.setAdapter(adapter)

        val btnInicio = findViewById<Button>(R.id.btnInicio)
        btnInicio.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        
    }
}
