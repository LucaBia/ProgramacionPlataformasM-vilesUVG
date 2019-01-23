package com.example.gianlucariverabiagioni.lab3contactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Codigo para que al presionar el boton vaya al UI de menu principal
        val boton = findViewById<Button>(R.id.btnRegresar)
        boton.setOnClickListener{val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}



    }

    fun create(view : View){
        var name = findViewById<EditText>(R.id.etName).getText().toString()
        var phone = findViewById<EditText>(R.id.etPhone).getText().toString()
        var email = findViewById<EditText>(R.id.etEmail).getText().toString()

        val contact = Contacts(name, phone, email)

        (this.application as MyApplication).add(contact)
        Toast.makeText(this, "Se agrego su contacto ${name} con éxito", Toast.LENGTH_SHORT).show()
    }
}
