package com.example.gianlucariverabiagioni.lab3contactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val contactsMain = arrayListOf<Contacts>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Codigo para que al presionar el boton vaya al UI de crear contacto
       val boton = findViewById<Button>(R.id.btnAgregarContacto)
        boton.setOnClickListener{val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)}

        //Referencia a MyApplication
       val app: MyApplication = applicationContext as MyApplication
        contactsMain.addAll(app.contactos)


        //Adapter del array para poder ser mostrado en la listview
       val adapter = ArrayAdapter(this,
            R.layout.listview, contactsMain)
        val listViewContactos: ListView = this.findViewById(R.id.lv)
        listViewContactos.setAdapter(adapter)

        //Codigo necesario para que al seleccionar un contacto, se pueda ver la informacion del mismo
          listViewContactos.setOnItemClickListener { _, _, position, _ ->
             app.setSelectedUser(position)
             val information = Intent(applicationContext, Main3Activity::class.java)
             startActivity(information)
         }





       // val arregloContactos = (this.application as MyApplication).contactos

        //val listViewContactos = findViewById<ListView>(R.id.lv)
        //val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arregloContactos)
        //listViewContactos.setAdapter(adapter)
        //listViewContactos.setOnItemClickListener{ parent, view, position, id ->


    }
}
