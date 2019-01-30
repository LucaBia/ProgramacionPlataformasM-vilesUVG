package com.example.wr.navigationdrawer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.support.v4.widget.DrawerLayout
import android.content.Intent
import android.view.View
import android.widget.ListView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myArray : ArrayList<String> = arrayListOf("Opcion 0", "Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4")
        val drawerLayout = findViewById(R.id.drawerLayout) as DrawerLayout
        val drawerList = findViewById<View>(R.id.left_drawer) as ListView

        // Set the adapter for the list view
        //drawerList.setAdapter(ArrayAdapter<String>(this, R.layout.drawer_list_item, myArray))
        val adapterDrawerList = ArrayAdapter(this, android.R.layout.simple_list_item_1, myArray)
        drawerList.adapter = adapterDrawerList
        // Set the list's click listener
        drawerList.setOnItemClickListener { parent, view, position, id ->
            val intentVerContacto = Intent(this, OtraActivity::class.java)
            intentVerContacto.putExtra("opcion", position)
            startActivity(intentVerContacto)
        }

    }
}
