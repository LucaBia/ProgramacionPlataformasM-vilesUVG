package com.example.gianlucariverabiagioni.lab3contactos

import android.app.Application

class MyApplication: Application() {
    //val contactos = ArrayList<Contacts>()
    val contactos: ArrayList<Contacts> = arrayListOf(Contacts("Panchito", "56784325", "panchis@wilu.com"))

    fun add(contact: Contacts){
        contactos.add(contact)
    }
}