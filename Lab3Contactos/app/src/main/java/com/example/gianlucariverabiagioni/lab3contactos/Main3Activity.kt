package com.example.gianlucariverabiagioni.lab3contactos

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    lateinit var tvName: TextView
    lateinit var tvCellphone: TextView
    lateinit var tvEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val app: MyApplication = applicationContext as MyApplication

        val name = app.contactos[app.getSelectedUser()].getName()
        val cellphone = app.contactos[app.getSelectedUser()].getCellphone()
        val email = app.contactos[app.getSelectedUser()].getEmail()

        tvName = findViewById(R.id.tvNameXML)
        tvCellphone = findViewById(R.id.tvCellphoneXML)
        tvEmail = findViewById(R.id.tvEmailXML)

        tvName.setText(name)
        tvCellphone.setText(cellphone)
        tvEmail.setText(email)


        //Intent para acceder al teclado del telefono y llamar
        tvCellphone.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+cellphone)
            startActivity(intent)
        }

        //Broadcast email
        tvEmail.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.type = "text/html"
            intent.data=Uri.parse("mailto:"+email)
            intent.putExtra(Intent.EXTRA_EMAIL,email)

            startActivity(Intent.createChooser(intent, "Send Email"))
            intent.setAction("CUSTOM_INTENT");
            sendBroadcast(intent)
        }
    }
}
