package com.sis.appalmacen

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Entrada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrada)


        var btnguarda=findViewById<Button>(R.id.btnGuarda)
        btnguarda.setOnClickListener{
            Toast.makeText(this, "Guardado exitoso", Toast.LENGTH_SHORT).show()

        }
    }

}
