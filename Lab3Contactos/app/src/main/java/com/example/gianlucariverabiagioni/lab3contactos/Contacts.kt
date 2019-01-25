package com.example.gianlucariverabiagioni.lab3contactos

class Contacts (
    //Atributo que debe tener cada contacto
    //Variables
    private val name: String,
    private val  cellphone: String,
    private val email: String
) {
    //Getters
    fun getName(): String{
        return name
    }

    fun getCellphone(): String{
        return cellphone
    }

    fun getEmail(): String{
        return email
    }

    //ToString para imprimir las personas en la list view
    override fun toString(): String {
        return this.name + " - " +  this.cellphone
    }

}