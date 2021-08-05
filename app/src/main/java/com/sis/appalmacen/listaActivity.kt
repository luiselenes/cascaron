package com.sis.appalmacen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class listaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val botonSalir = findViewById<Button>(R.id.btnSalir)
        val botonMenu = findViewById<Button>(R.id.btnMenu)
        botonSalir.setOnClickListener {
            finish()
        }

        botonMenu.setOnClickListener {
            val intento1 = Intent(this, activityAlmacenista::class.java)
            startActivity(intento1)
        }
    }
}