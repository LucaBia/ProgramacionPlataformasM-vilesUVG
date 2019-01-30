package com.example.wr.navigationdrawer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)

        val bundle = intent.extras
        val opcion = bundle!!.getInt("opcion")

        val textView1 = findViewById<TextView>(R.id.textView1)
        textView1.text = "Opcion: " + opcion
    }
}
