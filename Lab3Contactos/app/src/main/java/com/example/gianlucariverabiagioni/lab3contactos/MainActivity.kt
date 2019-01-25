package com.example.gianlucariverabiagioni.lab3contactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Codigo para que al presionar el boton vaya al UI de crear contacto
        val boton = findViewById<Button>(R.id.btnAgregarContacto)
        boton.setOnClickListener{val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)}

        val arregloContactos = (this.application as MyApplication).contactos

        val listViewContactos = findViewById<ListView>(R.id.lv)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arregloContactos)
        listViewContactos.setAdapter(adapter)
        listViewContactos.setOnItemClickListener{ parent, view, position, id ->
            val muestraContactos: Contacts = arregloContactos
        }
    }
}
